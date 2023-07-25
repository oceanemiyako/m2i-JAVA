package exercices;

public class Exo22 {
    /*
    1. Déclarer deux tableaux de 10 éléments
    2. Le premier tableau contiendra des nombres négatifs et positifs
    3. Ajouter tous les éléments positifs du premier tableau dans le
    second tableau
     */
    public static void main(String[] args) {

        int[] tab1 = {-5, 3, 24, -12, -10, 5, 100, -2, -71, 0}, tab2 = new int[10];

        int j = 0;

        System.out.print("\npremier tab:");
        for (int i = 0; i < 10; i++) {
            System.out.print(tab1[i] + " , ");
        }

        for (int i = 0; i < 10; i++) {
            if (tab1[i] > 0) {
                tab2[j] = tab1[i];
                j++;
            }

        }
        System.out.println("\nSecond tab:");
        for (int i = 0; i < j; i++) {
            System.out.print(tab2 [i] + " , ");
        }
    }
    }

