package exercices;

import java.util.Scanner;

public class Exo8 {
    /*
    1. Créer une variable age
    2. Affecter une valeur à la variable age
    3. Créer une condition qui permet d'afficher si la personne est
    majeure ou mineure
     */
    public static void main(String[] args) {
        Scanner scanner;
        int age;
        scanner = new Scanner(System.in);
        System.out.print("Saisir votre age: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("La personne est majeure.");
        } else {
            System.out.println("La personne est mineure.");
        }
    }
}

