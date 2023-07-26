package org.example.exoplante;
/*
1. Créer une classe "Plante" avec les attributs suivants : nom, hauteur et
couleur des feuilles
2. Ajouter un constructeur, des getters et des setters pour ces attributs
3. Créer une méthode pour afficher les informations sur la plante
4. Créer une classe "Arbre" qui hérite de "Plante" et qui ajoute un attribut
supplémentaire pour la circonférence du tronc
5. Surcharger la méthode afficher pour qu'elle ajoute les informations à
propos de l'arbre
 */
public class Plante {

    private String name; //nom
    private double height; //hauteur
    private String colorleaf; //couleur des feuilles

    public Plante(String name, double height, String colorleaf) {
        this.name = name;
        this.height = height;
        this.colorleaf = colorleaf;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColorleaf() {
        return colorleaf;
    }

    public void setColorleaf(String colorleaf) {
        this.colorleaf = colorleaf;
    }
    @Override
    public String toString() {
        return "Plante{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", colorleaf='" + colorleaf + '\'' +
                '}';
    }
public  void display() {
        System.out.println("Nom de la plante : " + name);
        System.out.println("Hauteur : " + height + " m");
        System.out.println("Couleur des feuilles : " + colorleaf);
}
}
