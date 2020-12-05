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
    
------------------------------FOURNISSEUR-------------------------------------

insert into fournisseur values ('Abounayan', '92190 Meudon');
insert into fournisseur values ('Cima','75010 Paris');
insert into fournisseur values ('Preblocs','92230 Genevilliers');
insert into fournisseur values ('Samaco','75116 Paris');

--------------------------------PRODUIT----------------------------------------------

insert into produit values ('sable','Abounayan',300);
insert into produit values ('brique','Abounayan',1500);
insert into produit values ('parpaing','Abounayan',1150);
insert into produit values ('tuile','Preblocs',1150);
insert into produit values ('parpaing','Preblocs',1200);
insert into produit values ('parpaing','Samaco',1150);
insert into produit values ('ciment','Samaco',125);
insert into produit values ('brique','Samaco',1200);
insert into produit values ('brique','Cima',1000);

------------------------------CLIENT------------------------------------------------

insert into client values ('jean','75006 Paris',-12000);
insert into client values ('paul','75003 Paris',0);
insert into client values ('vincent','94200 Ivry',3000);
insert into client values ('pierre','92400 Courbevoie',7000);

-----------------------------COMMANDE--------------------------------------------

insert into commande values (1,'jean','brique','Abounayan',5);
insert into commande values (2,'jean','ciment','Samaco',1);
insert into commande values (3,'paul','brique','Samaco',3);
insert into commande values (4,'paul','parpaing','Samaco',9);
insert into commande values (5,'vincent','parpaing','Preblocs',7);


/* 4.1 Requetes de consultation */

-- Affichage du contenu de chaque table creee

SELECT * 
FROM CLIENT ;

SELECT * 
FROM COMMANDE ;

SELECT * 
FROM PRODUIT ;

SELECT *
FROM FOURNISSEUR ;

-- Nom des clients dont le solde est ńegatif ;

SELECT nomc, solde
FROM CLIENT
WHERE solde<0 ;

-- Nom des fournisseurs qui proposent le produit ”brique” ou le produit ”parpaing”

SELECT nomf
FROM PRODUIT
WHERE nomp = 'brique' OR nomp = 'parpaing' ;

-- Nom et adresse des clients dont le nom commence par un ”J” (attention `a la casse de la police de caracteres)

SELECT nomc, adrsc
FROM CLIENT
WHERE nomc like 'j%' ;

-- Nom et adresse des clients ayant commande du produit "brique", la quantite commande etant comprise entre 5 et 10

SELECT commande.nomc, client.adrsc
FROM commande, client
WHERE client.nomc = commande.nomc AND nomp = 'brique' AND qte BETWEEN 5 AND 10 ;

-- Nom et cout moyen des articles proposes par les fournisseurs

SELECT nomf, avg(cout)
FROM produit
GROUP BY nomf ;

/* 4.2 Requetes de definition et de mise a jour */

-- Inserer les tuples correspondant aux commandes suivantes:

insert into commande values (6, 'paul', 'ciment', 'Samaco', 12) ;
insert into commande values (7, 'pierre', 'parpaing', 'Abounayan', 8) ;

-- modifier l'adresse du client qui devient 83000 Toulon

/* 
UPDATE table
SET nom_colonne_1 = 'nouvelle valeur'
WHERE condition
*/

UPDATE CLIENT
SET adrsc = '83000 Toulon'
WHERE nomc = 'jean' ;

-- les produits du fournisseur Samaco ont augmenter de 15 %

UPDATE PRODUIT
SET cout = cout * 1.15
WHERE nomf = 'Samaco' ;

-- le fournisseur Samaco s'est fait racheter par la firme Technal adresse : 69005 Lyon

ALTER TABLE fournisseur NOCHECK CONSTRAINT ALL ;
UPDATE fournisseur 
SET nomf = 'Technal', adrsf = '69005 Lyon' 
WHERE nomf = 'Samaco';
