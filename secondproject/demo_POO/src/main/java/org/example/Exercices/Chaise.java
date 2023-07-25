package org.example.Exercices;
/*
1. Créer une classe Chaise possédant comme variables d’instance le nombre de pieds, le
matériaux et la couleur de l’objet
2. Afficher ses informations en surchargeant une méthode de la classe Object
3. La classe Chaise pourra être instanciée avec ou sans paramètres (Constructeur par
défaut)
4. Afficher toutes les chaises (Possibilité de simplifier avec une méthode ToString)
 */
public class Chaise {

    public String materiaux;
    public int nbPieds;
    public String couleur;

    public double prix;


    public Chaise() {

    }

    public Chaise(String materiaux, int nbPieds, String couleur, double prix){
        this.couleur = couleur;
        this.nbPieds = nbPieds;
        this.materiaux = materiaux;
        this.prix = prix;
}

    @Override
    public String toString() {
        return ":" +
                "en " + materiaux + '\'' +
                "avec " + nbPieds +
                " de couleur '" + couleur + '\'' +
                "à un prix de " + prix +
                '.';
    }

}
