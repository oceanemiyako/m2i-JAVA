package org.example.exoplante;

public class Arbre extends Plante{

    private double trunkcircumference;
    public Arbre(String name, double height, String colorleaf, double trunkcircumference) {
        super(name, height, colorleaf);
        this.trunkcircumference = trunkcircumference;
    }
    public double getTrunkcircumference() {
        return trunkcircumference;
    }

    public void setTrunkcircumference(double trunkcircumference) {
        this.trunkcircumference = trunkcircumference;
    }

    @Override
    public  void display(){
        super.display();
        System.out.println("Circonférence du tronc : " + trunkcircumference + " m");

    }

}
