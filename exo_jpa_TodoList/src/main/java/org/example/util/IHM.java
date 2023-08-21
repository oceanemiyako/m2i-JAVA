package org.example.util;

import java.util.Scanner;

public class IHM {
    private Scanner scanner;

    public void start(){
        System.out.println("Exercice :TO DO LIST");
        String choix;
        do {
            menu();
            choix = scanner.nextLine();
            switch (choix){
                case "1":

                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "0":
                    System.out.println("Aurevoir");
                    break;
                default:
                    System.out.println("choix invalide");

            }
        }while (!choix.equals("0"));

    }

    private void menu() {
        System.out.println("=== To do list ===");
        System.out.println("1 - Ajouter une tâche à la liste");
        System.out.println("2 - Afficher toutes les tâches de la liste");
        System.out.println("3 - Marquer une tâche comme terminée");
        System.out.println("4 - Supprimer une tâche de la liste");
        System.out.println("0 - Quitter");
    }

}


