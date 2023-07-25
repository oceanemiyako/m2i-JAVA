package demos;

public class Variables {
    public static void main(String[] args) {

        // Déclaration d'une variable

        // <type> <nom>;

        // int : entier sur 32 bits;
        int age;

        // long : entier sur 64 bits;
        long indice;

        float distance;

        double monnaie;

        boolean estVrai;

        char lettre;

        // Chaine de caractère
        // String n'est pas considéré comme un type primitif
        String prenom;

        // <type> <nom> = <valeur>;
        int jour = 5;

        //Affectation
        age = 25;
        indice = 100_000_000;
        distance = 12.74f;
        monnaie = 15.5;
        estVrai = false;
        lettre = 'a';
        prenom = "Toto";

        double resultat = age + monnaie;

        // println() permet d'afficher des enregistrement dans la console

        System.out.println(resultat);

        System.out.println(prenom + " a " + age + " an. ");
        System.out.println(age);
        System.out.println(indice);
        System.out.println(distance);
        System.out.println(estVrai);
        System.out.println(lettre);
        System.out.println(prenom);

        // Les types énumérés (enum)
            enum JourSemaine{

                LUNDI,MARDI,MERCREDI
            }

            JourSemaine today = JourSemaine.MARDI;

        System.out.println(today);

    }


    public class Main {
        public static void main(String[] args) {
            String nom = "écrire votre nom";
            String prenom = "écrire votre prénom";

            System.out.println("Nom : " + nom);
            System.out.println("Prénom : " + prenom);
        }
    }

}
