package org.example.interfaces;

public class Rectangle extends Forme{

    private double longueur;
    private double largeur;


    public Rectangle(String nom, double longueur, double largeur) {
        super(nom);
        this.largeur = largeur;
        this.longueur = longueur;
    }


    public double calculerAire(){
        return longueur * largeur;
    }
    @Override
    public double calculerPerimetre(){
return  2 * (longueur * largeur);
    }
    @Override
    public void afficherDetails() {
        System.out.println(" Rectangle : " + nom);
        System.out.println(" Longueur : " + longueur );
        System.out.println(" Largeur : " +  largeur);
        System.out.println(" Perimetre : " + calculerPerimetre() );
        System.out.println(" Aire : " + calculerAire());
    }

}
