# Système de Gestion des Étudiants avec Spring Framework

Ce projet est un système de gestion des étudiants développé avec le framework Spring pour l'école ENAA. Il permet aux administrateurs de gérer efficacement les dossiers des étudiants en incluant des fonctionnalités telles que l'ajout, la visualisation, la mise à jour et la suppression des étudiants.

# <img src="https://raw.githubusercontent.com/spring-projects/spring-framework/main/framework-docs/src/docs/spring-framework.png" width="80" height="80"> Spring Framework [![Build Status](https://github.com/spring-projects/spring-framework/actions/workflows/build-and-deploy-snapshot.yml/badge.svg?branch=main)](https://github.com/spring-projects/spring-framework/actions/workflows/build-and-deploy-snapshot.yml?query=branch%3Amain) [![Revved up by Develocity](https://img.shields.io/badge/Revved%20up%20by-Develocity-06A0CE?logo=Gradle&labelColor=02303A)](https://ge.spring.io/scans?search.rootProjectNames=spring)

## Table des Matières

- [Fonctionnalités](#fonctionnalités)
- [Technologies Utilisées](#technologies-utilisées)
- [Prérequis](#prérequis)
- [Installation et Configuration](#installation-et-configuration)
- [Usage](#usage)
- [Auteurs](#auteurs)

## Fonctionnalités

- **Visualiser les Étudiants :** Affichage d'une liste de tous les étudiants dans le système en utilisant une page JSP. Chaque entrée d'étudiant montre des informations de base telles que le nom, le numéro de matricule et l'e-mail.

- **Ajouter un Nouvel Étudiant :** Formulaire pour permettre aux administrateurs d'ajouter un nouvel étudiant au système. Validation des données pour garantir que les champs obligatoires sont remplis et que les formats de données appropriés sont utilisés.

- **Mettre à Jour les Détails de l'Étudiant :** Possibilité de modifier les détails d'un étudiant existant, y compris le nom, le numéro de matricule, l'e-mail, le numéro de téléphone et l'adresse.

- **Supprimer un Étudiant :** Option pour supprimer un étudiant du système.

## Technologies Utilisées

- **Spring Core :** Pour l'injection de dépendances et la gestion des composants d'application.
- **Spring MVC :** Pour construire l'application Web et gérer les requêtes HTTP.
- **Spring DATA JPA :** Pour faciliter l'interaction avec la base de données et la persistance des entités.
- **Hibernate :** ORM (Object-Relational Mapping) pour la gestion de la couche de persistance.
- **MySQL :** Utilisation d'une base de données relationnelle pour stocker les données des étudiants.
- **Java JDK 1.8**
- **Apache Tomcat 8.5**

## Prérequis

Avant de commencer, assurez-vous d'avoir installé les éléments suivants :

- Java JDK 1.8
- Apache Tomcat 8.5 (ou un autre conteneur servlet compatible)
- MySQL Server
- Maven

## Installation et Configuration

1. Clonez ce dépôt sur votre machine locale.
2. Importez le projet dans votre IDE.
3. Configurez votre base de données MySQL en créant une nouvelle base de données nommée `student_db`.
4. Modifiez le fichier `application.properties` dans `src/main/resources` pour correspondre à votre configuration MySQL.

### Exemple de configuration :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db?serverTimezone=UTC
spring.datasource.username=votre_nom_utilisateur_mysql
spring.datasource.password=votre_mot_de_passe_mysql
````
Lancez le projet en utilisant votre IDE ou en construisant le projet avec Maven et en le déployant sur un serveur Tomcat.

## Usage
Une fois le projet lancé avec succès, accédez à l'URL de l'application (généralement [http://localhost:8082/SPRING_GESTION_DES_ETUDIANTS_war_exploded/]) pour commencer à utiliser le système de gestion des étudiants.

## Auteurs
Ce projet a été développé par Yassine OULARBI pour l'école ENAA.
Contact : yassineoularbi4@gmail.com

---

## References
### Spring tutorial (Spring Core, Spring MVC, Spring DATA JPA) : [https://www.baeldung.com/spring-tutorial](https://www.baeldung.com/spring-tutorial)

[![Spring Framework](https://img.shields.io/badge/Spring%20Framework-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](#) [![Spring Core](https://img.shields.io/badge/Spring%20Core-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](#) [![Spring MVC](https://img.shields.io/badge/Spring%20MVC-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](#) [![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](#) [![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache%20maven&logoColor=white)](#) [![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](#) [![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)](#) [![Java JDK](https://img.shields.io/badge/Java%20JDK-007396?style=for-the-badge&logo=java&logoColor=white)](#) [![Apache Tomcat](https://img.shields.io/badge/Apache%20Tomcat-F8DC75?style=for-the-badge&logo=apache%20tomcat&logoColor=black)](#)


**GitHub Repository:** [https://github.com/RameshMF/spring-mvc-tutorial.git]
