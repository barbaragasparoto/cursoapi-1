Create Table Aluno(
    id int not null auto_increment primary key,
    nomealuno varchar(100) not null,
    idcidade int not null,
    idcurso int not null
);

Create Table Curso(
    idcurso int not null auto_increment primary key,
    nomecurso varchar(100) not null
);

Create Table Cidade(
    idcidade int not null auto_increment primary key,
    nomecidade varchar(100) not null,
    uf varchar(2) not null
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


Alter Table Aluno add CONSTRAINT FK_Aluno_Curso foreign key (cursoid) references curso(id);
Alter Table Aluno add CONSTRAINT FK_Aluno_Cidade foreign key (cidadeid) references cidade(id);

