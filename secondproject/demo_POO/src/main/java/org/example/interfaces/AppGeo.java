package org.example.interfaces;

public class AppGeo {
    public static void main(String[] args) {


        Cercle cercle = new Cercle("Cercle 1", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle 1", 4.0, 6.0);

        cercle.afficherDetails();
        rectangle.afficherDetails();


        System.out.println(" Aire du cercle ; " + cercle.calculerAire());
        System.out.println(" Aire du rectangle : " + rectangle.calculerAire());

        System.out.println(Forme.compareAire(cercle, rectangle));
        System.out.println("#####");

        // Utilisation du polymorphisme avec un tableau de formes

        Forme[] formes = {cercle, rectangle};
        System.out.println(" Détail du tableau de Formes");
        for (Forme forme : formes) {
            forme.afficherDetails();
            System.out.println("#####");
        }

        // Utilisation du polymorphisme pour calculer aire total de mes formes
        double aireTole = 0.0;
        for (Forme forme : formes) {
            aireTole += forme.calculerAire();
        }
        System.out.println(" Aire totales des formes : " + aireTole);
        System.out.println("######");
        System.out.println("######");
        System.out.println("######");
    Cercle cercle2 = new Cercle("Cercle 2", 8.0);
    Rectangle rectangle2 = new Rectangle("Rectangle 2", 8.0, 16.0);

    Calculable[] formes2 = {cercle2, rectangle2};

    double aireTole2 = 0.0;
        for(
    Calculable forme:formes2)

    {
        aireTole2 += forme.calculerAire();
    }

        System.out.println(" Aire totale des formes 2 : " + aireTole2);

        for(Calculable forme:formes2){
            if (forme instanceof Forme){
                // Cast
                ((Forme) forme).afficherDetails();
                System.out.println("################");
            }
        }







}

}