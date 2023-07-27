package org.example.exobibliothèque;

public class AppBibio {
    public static void main(String[] args) {

        Bibliotheque bibliotheque = new Bibliotheque();


        Livre livre1 = new Livre("Le petit chaperon rouge", "Océane Garcia", 250);
        Livre livre2 = new Livre("Le sorcier", "Dorian Levoisin", 500);
        Livre livre3 = new Livre("Java", "Aurelie Dernier", 1000);


        bibliotheque.ajouterLivre(livre1);

        bibliotheque.ajouterLivre(livre2);

        bibliotheque.ajouterLivre(livre3);

        System.out.println("#####");

        bibliotheque.afficherListeLivres();

        System.out.println("######");

        bibliotheque.emprunterLivre(livre1);

        bibliotheque.emprunterLivre(livre2);

        bibliotheque.retournerLivre(livre1);

        System.out.println("######");

        bibliotheque.afficherListeLivres();
    }
}

