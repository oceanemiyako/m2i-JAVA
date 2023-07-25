package demos;

public class Tableau {
    public static void main(String[] args) {

        int[] tableau = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tableau[i] = i * 10 + j;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tableau[i] + "\t");
                if (j == 9) {
                    System.out.println();
                }
            }
        }
    }
}