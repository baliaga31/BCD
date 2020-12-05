/*
    TP 01 SQL ORACLE
*/

/* DROP TABLE
La commande DROP TABLE en SQL permet de supprimer définitivement une table 
d’une base de données. Cela supprime en même temps les éventuels index, trigger,
contraintes et permissions associées à cette table.

Attention : il faut utiliser cette commande avec attention car une fois 
supprimée, les données sont perdues. Avant de l’utiliser sur une base importante
il peut être judicieux d’effectuer un backup (une sauvegarde) pour éviter les 
mauvaises surprises.
*/

drop table COMMANDE ;
drop table CLIENT ;
drop table PRODUIT ;
drop table FOURNISSEUR ;

-- Create tables

create table FOURNISSEUR (
    nomf varchar(20) PRIMARY KEY, 
    adrsf varchar(50));

create table PRODUIT (
    nomp varchar(20), 
    nomf varchar(20), 
    cout float,
    CONSTRAINT comp_a CHECK (cout > 0),
    CONSTRAINT f_a FOREIGN KEY (nomf) REFERENCES fournisseur (nomf),
    CONSTRAINT pk_a PRIMARY KEY (nomp, nomf)
    );
    
create table CLIENT (
    nomc varchar(20),
    adrsc varchar(20),
    solde float,
    CONSTRAINT pk_c PRIMARY KEY (nomc)
    );
    
create table COMMANDE (
    ncom int,
    nomc varchar(20),
    nomp varchar(20),
    nomf varchar(20),
    qte int,
    CONSTRAINT pk_b PRIMARY KEY (ncom),
    CONSTRAINT f_b FOREIGN KEY (nomp, nomf) REFERENCES produit (nomp,nomf),
    CONSTRAINT f_c FOREIGN KEY (nomc) REFERENCES client(nomc)
    );
