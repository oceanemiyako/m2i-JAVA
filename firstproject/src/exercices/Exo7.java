package exercices;

import java.util.Scanner;

public class Exo7 {

    public static void main(String[] args) {
        int longueur;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir le coté du carré : " );
        longueur = scanner.nextInt();

        System.out.println("Le périmètre du carré est de : " + (longueur*4));
        System.out.println("l'air du carré est de : " + (longueur*longueur));



    }
}
