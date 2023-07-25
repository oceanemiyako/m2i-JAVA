package exercices;

import java.util.Scanner;

public class Exo6 {
    /*
    1. Saisir une chaine et la stocker dans une variable
    2. Effectuer les traitements suivants :
    1. Afficher la chaîne en minuscule
    2. Afficher la chaîne en majuscule
     */
    public static void main(String[] args) {

    String chaineInitiale, chaineMinuscule, chaineMajuscule;
        Scanner scanner = new Scanner(System.in);

        System.out.println("saisir du texte : ");
        chaineInitiale = scanner.nextLine();

        chaineMinuscule = chaineInitiale.toLowerCase();
        chaineMajuscule = chaineInitiale.toUpperCase();
        System.out.println(chaineMinuscule);
        System.out.println(chaineMajuscule);

        // Bonus
        String chainVirgule = String.join(" ,", chaineMinuscule.split(""));
        System.out.println(chainVirgule);
        String chaineCapitale = "";

        String[] motsChaine = chaineMinuscule.split(" ");
        //for(String mot: motsChaine){  motsChaine: ["tu", "vas", "bien", "?"] mot: "tu"
            //chaineCapitale = chaineCapitale + mot.substring(0,1).toUpperCase() + mot.substring(1) + " ";
        //}
       // System.out.println(chaineCapitale);
    }
}
