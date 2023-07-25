package exercices;

import java.util.Scanner;

public class Exercice1 {

    /* Slide 51
    1. Créer une variable nom et une variable prenom
    2. Afficher la phrase suivante "Bonjour {prenom} {NOM}."
    3. Remplacer les valeurs entre chevrons par les variables créées
       précédemment
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez entrer votre prenom ");
        String str = sc.nextLine();
        System.out.println("ma reponse : " + str);

        sc.nextLine();
        System.out.print("Veuillez entrer votre nom ");
        String sto = sc.nextLine();

        System.out.println(" ma reponse : " + sto);

        System.out.println(" Bonjour  " + str + " " + sto.toUpperCase());

    }
}
