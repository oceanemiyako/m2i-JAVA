package org.example.statique;

public class Maison {
    private String couleur;
    private int nombrePortes;
    private double largeur;
    private double longueur;

    // Attributs de la classe : commun à toute les instances
    // <Visibilité> static <type> <nom>
    // si il est public <Classe>.<attribut>

    private static int nombreMaison;
    public static String nomLatin = "Domus";

    public Maison(String couleur, int nombrePortes, double largeur, double longueur) {
        nombreMaison++;
        this.couleur = couleur;
        this.nombrePortes = nombrePortes;
        this.largeur = largeur;
        this.longueur = longueur;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        if (couleur != "Vert") {
            this.couleur = couleur;
        }
    }
    public int getNombrePortes() {
        return nombrePortes;
    }
    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }

    public double getLargeur() {
        return largeur;
    }
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    public double getLongueur() {
        return longueur;
    }
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
// <visibilité> static <type de retour> <nom>(<paramètre>)
    public static int getNombreMaison() {
        return nombreMaison;
    }

}


