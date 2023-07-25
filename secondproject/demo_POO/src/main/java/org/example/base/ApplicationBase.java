package org.example.base;

public class ApplicationBase {
    public static void main(String[] args) {

        // Instanciation d'un objet voiture
        Voiture voiture1 = new Voiture();

        // Pour executer une méthode d'instance , il suffit de faire objet.methode(<paramétres>)
        voiture1.demarrer();

        // Pour acceder à une attribut public, il suffit de faire objet. attribut
        System.out.println(voiture1.carburant);

        voiture1.remplirReservoir(15);

        voiture1.carburant += 1;

        System.out.println(voiture1.carburant);
        System.out.println(voiture1.couleur);

        Voiture voiture2 = new Voiture("rouge", 50, 120);
        Voiture voiture3 = new Voiture("bleu");

        double chevauxFiscaux = voiture2.puissanceChevauxFiscaux();

        System.out.println(chevauxFiscaux);
        System.out.println(voiture2.puissanceChevauxFiscaux());

        System.out.println(voiture2.toString());
        System.out.println(voiture2);

    }
}
