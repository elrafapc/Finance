import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">Controle de Finanças</h1>
                    <p className="lead">Controle suas receitas e despesas de maneira simples.</p>
                    <hr />
                    <p>Vizualize seus gastos em gráficos dinâmicos e intuitivos..</p>
                    <Link className="btn btn-primary btn-lg" to ="/dashboard">
                        Acessar Dashboard
                    </Link>
                </div>
            </div>
            <Footer />
        </>
    );
}

export default Home;
