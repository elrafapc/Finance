import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Transacao = () => {
    return (
        <>
            <NavBar />
            <div>
                <Link className="btn btn-primary btn-lg" to="/dashboard">
                    Acessar Dashboard
                </Link>
            </div>
            <Footer />
        </>

    );
}

export default Transacao;
