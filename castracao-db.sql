/*Criação da tabelas de castração*/
create table castracao(
    cpf varchar(14),
    nome_dono varchar(255) not null,
    telefone varchar(10) not null,
    endereco varchar(255) not null,
    nome_animal varchar(255) not null,
    especie_animal ENUM('Cachorro', 'Gato') not null,
    raca_animal varchar(255) not null,
    atendido boolean not null,
    dataAtendimento date not null,
    horaAtendimento date not null,
    primary key(cpf)
);
