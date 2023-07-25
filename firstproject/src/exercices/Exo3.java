package exercices;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {

        int a, b;
        double carre1 , carre2;
        System.out.print("Saisir deux nombres: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        carre1 = a * a;
        carre2 = b * b;
        double sommeCarre = carre1 + carre2;
        System.out.println("La somme des carrés de a:" + sommeCarre);

    }
}
