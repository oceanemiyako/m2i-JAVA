package exercices;

import java.util.Scanner;

public class Exo4 {

    /*
    .1.  Créer une variable age et lui affecter une valeur
     2. Vérifier si la personne est mineure ou majeure à l'aide des
        opérateurs logiques
     3. Afficher le résultat
     4. /!\ Ne pas utiliser de structure conditionnelle
     */
    public static void main(String[] args) { //point d'entré pour la lecture du programme

        int age;
        boolean estMajeur;
        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.print("Saisir votre age: ");
        age = scanner.nextInt();

        estMajeur = age >= 18;

        System.out.println("Afficher l'age:" + estMajeur );
    }
}
// TODO faire la correction