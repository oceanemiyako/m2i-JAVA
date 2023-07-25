package exercices;
import java.util.Scanner;

public class Exo9 {
    /*
    1. Créer une variable nombre de type entier
    2. Affecter une valeur à la variable nombre
    3. Créer une condition qui permet d'afficher si le nombre est pair ou impair
     */
    public static void main(String[] args) {

        int nombre;
        System.out.print("Entrez un entier : ");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextInt();

        if (nombre % 2 == 0)
            System.out.println("Le nombre est pair.");
        else
            System.out.println("Le nombre est impair.");

    }
}
