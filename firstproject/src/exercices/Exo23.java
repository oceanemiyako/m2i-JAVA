package exercices;
/*
1. Ecrire un programme qui permet de trouver la valeur maximale
dans un tableau
 */
public class Exo23 {
    public static void main(String[] args) {

        int[] tableau = {23, 150, 12, 28, 59, 2};
        int max = 0;
        int indMax = 0;

        for (int indice = 0; indice < tableau.length; indice++) {

            if (indice == 0) {
                max = tableau[indice];
            } else if (indice > max) {
                max = tableau[indice];
            }
        }
    }
}
