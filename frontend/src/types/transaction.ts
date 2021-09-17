import { RegisterType } from "./registerType";

export type Transaction = {
    id: number;
    description: string;
    value: number;
    date: string;
    registerType: RegisterType;
}

export type TransactionPage = {
    content?: Transaction[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size?: number;
    number: number;
    first: boolean;
    numberOfElements?: number;
    empty?: boolean;
}

export type TransactionSum = {
    typeName: string,
    sum: number
}