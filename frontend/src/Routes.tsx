import Dashboard from "pages/DashBoard";
import Home from "pages/Home";
import Login from "pages/Login";
import Transacao from "pages/Transacoes";
import { BrowserRouter, Route, Switch } from "react-router-dom";

const Routes = () => {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/login">
                    <Login />
                </Route>
                <Route path="/" exact>
                    <Home />
                </Route>
                <Route path="/dashboard">
                    <Dashboard />
                </Route>
                <Route path="/transaction">
                    <Transacao />
                </Route>
            </Switch>
        </BrowserRouter>
    );
}

export default Routes;