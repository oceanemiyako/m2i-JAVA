package org.example.statique;

public class Main {
    public static void main(String[] args) {

        Maison maison = new Maison("Orange", 4, 12.5, 20);
        System.out.println(maison.getCouleur());
        maison.setCouleur("Rose");
        System.out.println(maison.getCouleur());
        maison.setCouleur("Vert");
        System.out.println(maison.getCouleur());


        Maison maisonJolie = new Maison("Jaune", 1, 2,3);

        //System.out.println(Maison.nombreMaison); //private utilisateur du getter
        System.out.println("Nombre de maison instanciées: " + Maison.getNombreMaison());
        System.out.println(Maison.nomLatin);

        // Exemple de méthodes statiques
        Math.round(120.3);

    }
}

