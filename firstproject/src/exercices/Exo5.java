package exercices;

import java.util.Scanner;

public class Exo5 {
/*
1. Créer un programme qui permet de calculer le volume d'un cône
2. La formule est la suivante : 1/3 × π × r² × h
 */
    public static void main(String[] args) {
    double rayon, hauteur, volume;
        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("Saisir un rayon");
        rayon = scanner.nextDouble();
        System.out.println("Saisir hauteur");
        hauteur = scanner.nextDouble();

        volume = 1.0/3.0 * Math.PI * (rayon * rayon) * hauteur;
        System.out.println(volume);

        // Floor arrondi à l'entier le plus proche vers le bas
        System.out.println(Math.floor(volume));
        // Ceil arrondi à l'entier le plus proche vers le haut
        System.out.println(Math.ceil(volume));

        // Arrondi 2 chiffres après la virgule
        volume = Math.round(volume * 100.) / 100.;
        System.out.println(volume);

    }
}
// TODO déclarer des variables