package exercices;
import java.util.Scanner;

public class Exo10 {
    /*
    1. Créer 3 variables : nombre1, nombre2, nombre3
    2. Affecter des valeurs aux variables
    3. Créer des structures conditionnelles permettant d'afficher le
    maximum parmis les 3 nombres créésprécédemment
    */
    public static void main(String[] args) {

        int nombre1, nombre2, nombre3;

        System.out.print("Entrez 3 entier : ");
        Scanner sc = new Scanner(System.in);
        nombre1 = sc.nextInt();
        nombre2 = sc.nextInt();
        nombre3 = sc.nextInt();

        if( nombre1 >= nombre2 && nombre1 >= nombre3)
            System.out.println("Le plus grand nombre est: "+nombre1);
        else if (nombre2 >= nombre2 && nombre2 >= nombre3)
            System.out.println("Le plus grand nombre est: "+nombre2);
        else
            System.out.println("Le plus grand nombre est: "+nombre3);
    }
}







