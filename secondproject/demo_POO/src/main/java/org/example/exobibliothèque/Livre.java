package org.example.exobibliothèque;
/*
1- Créer une classe "Livre" avec les attributs suivants : titre, auteur, nombre de pages et estEmprunté (par défaut false)
2- Ajouter un constructeur, des getters et des setters pour ces attributs
3- Créer une méthode pour afficher les informations sur le livre et une autre pour changer l'état d'emprunt
4- Créer une classe "Bibliothèque" avec un tableau de "Livre" et les méthodes suivantes :

Ajouter un livre à la collection

Supprimer un livre de la collection

Afficher la liste de tous les livres

Emprunter un livre (changer l'état d'emprunt à true)

Retourner un livre (changer l'état d'emprunt à false)

5- Utiliser la classe "Bibliothèque" pour créer une bibliothèque avec plusieurs livres et afficher la liste de tous les livres
6- Emprunter et retournez un livre, puis affichez à nouveau la liste de tous les livres pour vérifier que l'état d'emprunt a bien été modifié
*/
public class Livre {

    private String titre;
    private String auteur;
    private int nbpages;
    private boolean estembrunte;

    public Livre(String titre, String auteur, int nbpages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbpages = nbpages;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbpages() {
        return nbpages;
    }

    public void setNbpages(int nbpages) {
        this.nbpages = nbpages;
    }

    public boolean isEmbrunte() {
        return estembrunte;
    }

    public void setEmbrunte(boolean embrunte) {
        this.estembrunte = embrunte;
    }

   public void afficher(){
       System.out.println("Titre : " + titre);
       System.out.println(" Auteur : " + auteur);
       System.out.println(" nombre de Pages " + nbpages);
       System.out.println(" Emprunté " + estembrunte);
   }

   public void estembrunte(){
       estembrunte =! estembrunte;
   }
}
