package org.example.exo;

import org.example.utils.DatabaseManager;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
Réaliser une app en java qui demande à l'utilisateur de saisir :
- Nom
- Prenom
- numéro de téléphone
- Date de diplôme
L'application ajoutera les données dans une table etudiant.
On souhaite modifier notre application pour ajouter les fonctionnalités suivantes :
- Afficher la totalité des étudiants
- Afficher les etudiants d'une classe
- Supprimer un etudiant
 */
public class AppExo1 {

    public static void main(String[] args) {
//
//        {
//            // test de connexion à la BDD
//            String url = "jdbc:postgresql://localhost:5432/classe";
//            String user = "postgres";
//            String password = "1234";
//
//
//                Connection connection = DatabaseManager.getPostgreSQLConnection();
//                if(connection != null){
//                    System.out.println("La connexion est ok");
//                }else {
//                    System.out.println("connexion echoué");
//                }
//        }

        try {
            ManagerStudent.AjoutStudent();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

