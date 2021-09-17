import axios from "axios";
import { useEffect, useState } from "react";
import Chart from "react-apexcharts"
import { TransactionSpendByMonth } from "types/transaction";
import { BASE_URL } from "utils/requests";

type SeriesData = {
    name: string;
    data: number[];
}

type ChartData = {
    labels: {
        categories: string[]
    };
    series: SeriesData[];
}

const BarCharts = () => {

    const [chartData, setChartData] = useState<ChartData>(
        {
            labels: {
                categories: []
            },
            series: [
                {
                    name: "Total de Gastos",
                    data: []
                }
            ]
        });

    useEffect(() => {
        axios.get(`${BASE_URL}/transaction/total_Spend`)
            .then(response => {
                const data = response.data as TransactionSpendByMonth[];

                const myLabels = data.map(item => item.date);
                const mySeries = data.map(item => item.total)

                setChartData(
                    {
                        labels: {
                            categories: myLabels
                        },
                        series: [
                            {
                                name: "Total de Gastos",
                                data: mySeries
                            }
                        ]
                    }
                );
            })
    }, [])

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    const mockData = {
        labels: {
            categories: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
        },
        series: [
            {
                name: "% Sucesso",
                data: [43.6, 67.1, 67.7, 45.6, 71.1]
            }
        ]
    };

    return (
        <Chart
            options={{ ...options, xaxis: chartData.labels }}
            series={chartData.series}
            type="bar"
            height="240"
        />
    );
}

export default BarCharts;
