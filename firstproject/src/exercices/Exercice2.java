package exercices;

import java.util.Scanner;

public class Exercice2 {

    /*
    Écrire un programme qui permet de permuter les valeurs entre
    deux variables
     */

    public static void main(String[] args) {

        int a, b, tmp;
        System.out.print("Saisir deux nombres: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Saisi: a = "+a+" et b = "+b);

        tmp = a;
        a = b;
        b = tmp;

        System.out.println(" A la permutation: a = "+a+" et b = "+b);

    }
}
