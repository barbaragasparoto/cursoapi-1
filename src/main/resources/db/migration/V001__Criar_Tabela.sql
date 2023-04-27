Create Table Curso(
    idcurso int not null primary key auto_increment ,
    nomecurso varchar(100) not null
);

Create Table Cidade(
    idcidade int not null primary key auto_increment,
    nomecidade varchar(100) not null,
    uf varchar(2) not null
);

Create Table Aluno(
    id int not null primary key auto_increment,
    nomealuno varchar(100) not null,
    idcidade int not null,
    idcurso int not null
);


insert into aluno(nomealuno, idcidade, idcurso) values ('Nara', 3, 2);
insert into aluno(nomealuno, idcidade, idcurso) values ('Liggia', 1, 1);
insert into aluno(nomealuno, idcidade, idcurso) values ('Juninho', 2, 3);


insert into curso(nomecurso) values ('DS');
insert into curso(nomecurso) values ('MKT');
insert into curso(nomecurso) values ('DS');


insert into cidade(nomecidade, uf) values ('Lencois Paulista', 'SP');
insert into cidade(nomecidade, uf) values ('Barra Bonita', 'SP');
insert into cidade(nomecidade, uf) values ('Bauru', 'SP');


Alter Table aluno add CONSTRAINT FK_curso_aluno foreign key (idcurso) references curso(idcurso);
Alter Table aluno add CONSTRAINT FK_cidade_aluno foreign key (idcidade) references cidade(idcidade);


