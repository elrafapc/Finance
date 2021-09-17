import BarCharts from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Dashboard = () => {
    return (
        <div>
            <>
                <NavBar />
                <div className="container">
                    <h1 className="text-primary py-3"> Dashboard de Receitas e Despesas</h1>

                    <div className="container">
                        <Link className="btn btn-secondary " to="/transaction">
                            Lançar Registros
                        </Link>
                    </div>

                    <div className="row px-3" >
                        <div className="col-sm-6">
                            <h5 className="text-center text-secondary">Total de Gastos por Mês</h5>
                            <BarCharts />
                        </div>
                        <div className="col-sm-6">
                            <h5 className="text-center text-secondary">Gastos por Tipo de Registro</h5>
                            <DonutChart />
                        </div>
                    </div>
                    <div className="py-3">
                        <h2 className="text-primary">Todas Vendas</h2>

                    </div>

                    <DataTable />
                </div>

                <Footer />
            </>
        </div>
    );
}

export default Dashboard;
