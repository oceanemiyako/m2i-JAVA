package org.example.Exercices;

public class ApplicationB {
    public static void main(String[] args) {

        Chaise chaise1 = new Chaise("chaine", 4 , "bleu", 14.4);
        Chaise chaise2 = new Chaise("Bambou", 3 , "gris", 130.99);
        Chaise chaise3 = new Chaise("métal", 1 , "orange",76.25);

        System.out.println("Je suis une "+ chaise1);
        System.out.println(" Je suis une "+ chaise2);
        System.out.println("Je suis une " + chaise3);




    }
}
