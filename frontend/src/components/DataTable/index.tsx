import axios from "axios";
import { useEffect, useState } from "react";
import { TransactionPage } from "types/transaction";
import { BASE_URL } from "utils/requests";
import { formatLocalDate } from "utils/format";
import Pagination from "components/Pagination";

const DataTable = () => {



    const [page, setPage] = useState<TransactionPage>({
        first: true,
        last: true,
        number: 0,
        totalElements: 0,
        totalPages: 0
    })

    useEffect(() => {
        axios.get(`${BASE_URL}/transaction?page=0&size=10&sort=registerType.id`)
            .then(Response => {
                setPage(Response.data);
            })
    }, [])

    return (
        <>
            <div className="table-responsive">
                <table className="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th>Descrição</th>
                            <th>Tipo de Registro</th>
                            <th>Valor</th>
                            <th>Data</th>
                        </tr>
                    </thead>
                    <tbody>
                        {page.content?.map(item => (
                            <tr key={item.id}>
                                <td>{item.description}</td>
                                <td>{item.registerType.description}</td>
                                <td>{item.value}</td>
                                <td>{formatLocalDate(item.date, "dd/MM/yyyy")}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
            
        </>
    );
}

export default DataTable;
