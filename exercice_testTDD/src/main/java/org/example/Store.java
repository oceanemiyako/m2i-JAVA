package org.example;
/*
Un magasin possède un système informatisé pour connaître la date limite et la qualité des produits.
Le système fonctionne de la sorte que chaque produit possède :
Un attribut « SellIn » qui représente le nombre de jours restant pour vendre le produit.
Un attribut « quality » qui indique la valeur de chaque produit.
A la fin de chaque journée le système utilise une méthode update qui décrémente la valeur de SellIn et quality d’un produit.
Voici les règles de décrémentation :
Une fois la date de péremption est à zéro, la qualité se dégrade deux fois plus vite.
La qualité d'un article n'est jamais négative.
La qualité d'un article n'est jamais supérieure à 50.
La qualité du « brie vieilli » augmente à mesure qu'il vieillit.
Les produits laitiers se dégradent en qualité deux fois plus vite que les produits normaux
Réaliser la méthode update en utilisant les TDD.
 */
public class Store extends Product {

    private int sellIn;
    private int quality;

    public Store(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public void update() {
        sellIn--;

        if (quality > 0) {
            if (sellIn < 0) {
                quality -= 2;
            } else {
                quality--;
            }
        }

        if (quality > 50) {
            quality = 50;
        } else if (quality < 0) {
            quality = 0;
        }

        String name = new String();

        if (name.toLowerCase().contains("Brie")) {
            quality++;
        }

        if (name.toLowerCase().contains("Milk")) {
            quality -= 2;
        }
    }
}
