package org.example.exercice.film;
/*
1. Créer une classe "Film"
2. Ajouter les attributs suivants : titre, réalisateur, année de sortie et genre
3. Ajouter un constructeur, des getters et des setters pour ces attributs, ainsi
qu'une méthode pour afficher les informations sur le film
*/
public class Film {

    private String titre;
    private String réalisateur;
    private String anneeSortie;
    private String genre;

    public Film(String titre, String réalisateur, String anneeSortie, String genre){
        this.titre = titre;
        this.réalisateur = réalisateur;
        this.anneeSortie = anneeSortie;
        this.genre = genre;
    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRéalisateur() {
        return réalisateur;
    }

    public void setRéalisateur(String réalisateur) {
        this.réalisateur = réalisateur;
    }

    public String getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(String anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String toString() {
        return "Film{" + "titre='" + titre + '\'' + ", réalisateur='" + réalisateur + '\'' + ", anneeSortie=" + anneeSortie + ", genre='" + genre + '\'' + '}';
    }
}
