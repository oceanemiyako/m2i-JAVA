package org.example.exobibliothèque;

import java.util.ArrayList;

public class Bibliotheque {

    private ArrayList<Livre> Livres;

    public Bibliotheque() {
        Livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        Livres.add(livre);
    }

    public void supprimerLivre(Livre livre) {
        Livres.remove(livre);
    }

    public void afficherListeLivres() {
        System.out.println("Liste des livres dans la bibliothèque:");
        for (Livre livre : Livres) {
            livre.afficher();
        }
    }

    public void emprunterLivre(Livre livre) {
        if (!livre.isEmbrunte()) {
            livre.setEmbrunte(true);
            System.out.println("Le livre \"" + livre.getTitre() + "\" a été emprunté.");
        }
    }

    public void retournerLivre(Livre livre) {
        if (livre.isEmbrunte()) {
            livre.setEmbrunte(false);
            System.out.println("Le livre \"" + livre.getTitre() + "\" a la bibliothèque.");
        }
    }
}



