import axios from "axios";
import Chart from "react-apexcharts"
import { TransactionSum } from "types/transaction";
import { BASE_URL } from "utils/requests";

type ChartData = {
    labels: string[];
    series: number[];
}

const DonutChart = () => {

    let chartData : ChartData = {labels: [], series: []};

    axios.get(`${BASE_URL}/transaction/sum_by_type`)
        .then(response => {
            const data = response.data as TransactionSum[];
            const myLabels = data.map(item => item.typeName);
            const mySeries = data.map(item => item.sum);

            chartData = {labels: myLabels, series: mySeries};

            console.log(chartData);
        });

    const mockData = {
        series: [477138, 499928, 444867, 220426, 473088],
        labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    }
    
    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart 
            options={{...options, labels: chartData.labels}}
            series={chartData.series}
            type="donut"
            height="240"
        />
    );
}

export default DonutChart;
