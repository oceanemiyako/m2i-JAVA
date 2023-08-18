package org.example.utils;

import java.util.Scanner;

public class ConsoleIhm {

    public static void start() {
        boolean running = true;
        while (running) {
            System.out.println("1. Create a customer");
            System.out.println("2. Modification customer");
            System.out.println("3. create a account");
            System.out.println("4. update account");
            System.out.println("5. display operation\n");
            System.out.print("Choix : ");

            Scanner scanner = null;
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    ;
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
                case 5:
                    ;
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid chose !");
            }
        }
        System.out.println("Bye bye!");
    }
}
