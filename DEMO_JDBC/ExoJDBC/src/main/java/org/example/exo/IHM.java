package org.example.exo;

import java.sql.SQLException;
import java.util.Scanner;

import static org.example.exo.ManagerStudent.AjoutStudent;

public class IHM {
    public static void afficherMenu() throws SQLException {
        int choix;

        Scanner scanner = null;
        do {
            System.out.println("=== Menu principal ===");
            System.out.println();
            System.out.println("1. Add a Student");
            System.out.println("2. Aff Student");
            System.out.println("3. Aff Class Student");
            System.out.println("4. Supp Student");
            System.out.println("0. Quitter");
            System.out.println("Votre choix :");

            choix= scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    AjoutStudent();
                    break;

                case 0 :
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un choix valide !!!!");

            }


        }while (choix != 0);

        scanner.close();

    }
}
