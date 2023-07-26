package org.example.joueur;

public class ApplicationBase {
    public static void main(String[] args) {

        Joueur joueur1 = new Joueur("LadyWarrior");

        for (int compteur = 1; compteur < 21; compteur++){
            System.out.println("le joueur " +joueur1.getName()+" effectue la quête n°" + compteur);
            joueur1.effectuerUneQuete();

        }
        String ancienPseudo = joueur1.getName();
        joueur1.setName("QueenWarrior");
        System.out.println("Le joueur" + ancienPseudo +"est renommé :" + joueur1.getName());
    }
}
