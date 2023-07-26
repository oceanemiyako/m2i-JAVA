package org.example.exoplante;

public class AppliPlante {
    public static void main(String[] args) {

      Plante plante = new Plante("Cerisier", 15 , "Pink");
      Arbre arbre = new Arbre("Chêne", 20, "Green", 10);

       System.out.println(plante);
       plante.display();
       System.out.println(arbre);
        arbre.display();
        System.out.println(arbre.getTrunkcircumference());
    }
}
