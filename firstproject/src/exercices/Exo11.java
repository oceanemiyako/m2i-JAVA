package exercices;

import java.util.Scanner;

public class Exo11 {
    /*
    1. Créer une variable caractere
    2. Affecter une valeur à la variable caractere
    3. A l'aide des structures conditionnelles, déterminer si le caractère
    est une consonne ou une voyelle
     */
    public static void main(String[] args) {
        char lettre;

        System.out.print("Entrez une lettre : ");
        Scanner sc = new Scanner(System.in);
        lettre = sc.nextLine().toLowerCase().charAt(0);

        if (lettre >= 'a' && lettre <= 'z') {

            if (lettre == 'a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre == 'u' || lettre == 'y') {
                System.out.println("C'est une voyelle: " + lettre);
            } else {
                System.out.println("c'est une consonne: " + lettre);
            }
        }
    }
}





