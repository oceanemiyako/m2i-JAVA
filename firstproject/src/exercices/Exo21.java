package exercices;

import java.io.OptionalDataException;
import java.util.Arrays;

public class Exo21 {
    /*
    1. Déclarer un tableau de 100 éléments et l'initialiser
    2. Afficher les éléments par dizaine séparés d'une virgule
     */
    public static void main(String[] args) {

        int[] tab = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tab[i] = i * 10 + j;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tab[i] + "\t");
                if (j == 9) {
                    System.out.println();
                }
            }
        }
    }
}




