INSERT INTO user(login,password) VALUES ('rafael', '12345');

INSERT INTO register_type(description) VALUES ('Entrada de Valor');
INSERT INTO register_type(description) VALUES ('Benefício');
INSERT INTO register_type(description) VALUES ('Despesa Fixa');
INSERT INTO register_type(description) VALUES ('Despesa Variável');
INSERT INTO register_type(description) VALUES ('Suporte');
INSERT INTO register_type(description) VALUES ('Dízimo');


INSERT INTO transaction(register_type_id,date,description,value) VALUES (1,'2021-09-05','Salário Zé',5000);
INSERT INTO transaction(register_type_id,date,description,value) VALUES (1,'2021-09-05','Salário Maria',5000);
INSERT INTO transaction(register_type_id,date,description,value) VALUES (2,'2021-09-05','Ticket Zé',700);
INSERT INTO transaction(register_type_id,date,description,value) VALUES (3,'2021-09-10','Luz',180);
INSERT INTO transaction(register_type_id,date,description,value) VALUES (3,'2021-09-10','Clube',176);
INSERT INTO transaction(register_type_id,date,description,value) VALUES (3,'2021-09-10','Empréstimo Banco',314);
INSERT INTO transaction(register_type_id,date,description,value) VALUES (3,'2021-09-10','Aluguel',700);
INSERT INTO transaction(register_type_id,date,description,value) VALUES (4,'2021-09-05','Cartão Zé',1000);
INSERT INTO transaction(register_type_id,date,description,value) VALUES (4,'2021-09-05','Cartão Maria',1000);
INSERT INTO transaction(register_type_id,date,description,value) VALUES (5,'2021-09-05','Caridade Asilo',100);
INSERT INTO transaction(register_type_id,date,description,value) VALUES (5,'2021-09-05','Caridade Orfanato',150);
INSERT INTO transaction(register_type_id,date,description,value) VALUES (6,'2021-09-05','Dízimo',500);
