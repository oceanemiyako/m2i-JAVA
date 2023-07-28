package org.example.exobibliothèque;

import java.util.Iterator;

public class AppBibio {
    public static void main(String[] args) {

        Bibliotheque bibliotheque = new Bibliotheque();


        Livre livre1 = new Livre("Le petit chaperon rouge", "Océane Garcia", 250);
        Livre livre2 = new Livre("Le sorcier", "Dorian Levoisin", 500);
        Livre livre3 = new Livre("Java", "Aurelie Dernier", 1000);


        bibliotheque.ajouterLivre(livre1);

        bibliotheque.ajouterLivre(livre2);

        bibliotheque.ajouterLivre(livre3);

        bibliotheque.ajouterLivre(new Livre("test", "Aurelie Dernier", 1000));

        bibliotheque.ajouterLivre(new Livre("Titre5", "Aurelie Dernier", 1000));

        System.out.println("#####");

        bibliotheque.afficherListeLivres();

        System.out.println("######");

        bibliotheque.emprunterLivre(livre1);

        bibliotheque.emprunterLivre(livre2);

        System.out.println("#######");

        bibliotheque.retournerLivre(livre1);

        System.out.println("######");

        bibliotheque.afficherListeLivres();

        System.out.println("#####");
       // Supprimer un livre

        bibliotheque.supprimerLivre(livre2);
        bibliotheque.afficherListeLivres();


        System.out.println("########");

        // Supprimer Test

        String deletedBook5 = "test";
        Iterator<Livre> iterator = bibliotheque.iterator();
        while (iterator.hasNext()){
            Livre livre = iterator.next();
            if(livre.getTitre().equals(deletedBook5)){
                iterator.remove();
                break;
            }
        }
        bibliotheque.afficherListeLivres();

        // Correction bonus

        System.out.println("################# Emprunt du livre avec le titre5");
        System.out.println(bibliotheque.empruntLivreParTitre(" toto "));
        System.out.println(bibliotheque.empruntLivreParTitre(" Titre5 "));

    }
}

