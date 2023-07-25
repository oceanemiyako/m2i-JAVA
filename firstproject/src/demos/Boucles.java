package demos;

import java.util.Scanner;

public class Boucles {
    public static void main(String[] args) {
        // for
        for (int compteur = 0; compteur < 10; compteur++) {
            System.out.println(compteur); // on sort de la boucle à 9
            //System.out.println(compteur*2); table de 2
        }


        for (int compteur2 = 10; compteur2 > 0; compteur2--) {
            System.out.println(compteur2);

        }

        String[] prenom = {"Sophie", "Aurélie", "Dorian"};

        for (int cpt = 0; cpt < prenom.length;cpt++){
            System.out.println(prenom[cpt]);
        }
        // for each
        for (String prenom1 : prenom){
            System.out.println(prenom1);
        }

        // While tant que

        int compteur5 = 0;

        while (compteur5 < 10) {
            System.out.println("compteur : " + compteur5);
            compteur5++;
        }

        Scanner scanner = new Scanner(System.in);

        // Création d'une boucle infinie
        while (true){
            System.out.println("Veuillez saisir 'y' pour sortir :");
            String valeur = scanner.nextLine();
            if (valeur.equals("y")){
                break;
            }
        }

        int nombre = 10;

        do {
            System.out.println(nombre);
            nombre--;
        }while (nombre > 0);

        // break et continue
        for (int compteur6 = 0; compteur6 < 10; compteur6++){
            if(compteur6 == 3){
                continue;
            }
            if (compteur6 == 8){
                break;
            }
            System.out.println(compteur6);
        }
    }
}
