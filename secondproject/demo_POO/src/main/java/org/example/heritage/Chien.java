package org.example.heritage;

public class Chien extends Animal{


    private double taille;

    public Chien(String name, int old, String color) {
        super(name, old, color);
        this.taille = taille;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    @Override
    public void crier() {
        System.out.println("Wouf Wouf");
    }
    @Override
    public void manger(){
        super.manger();
        System.out.println("Je mange de bon paté");
    }

}
