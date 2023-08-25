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

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testQualityDecreasesBy1EachDay() {    // Test qualité produit
        Product product = new Product("Product", 20, 10);
        product.update();
        assertEquals(9,product.getSellIn());
        assertEquals(19, product.getQuality());
    }

    @Test
    public void testQualityNeverNegative() {
        Product product = new Product("Product", 0, 0);
        product.update();
        assertEquals(0, product.getQuality());
    }

    @Test
    public void testQualityNeverMoreThan50() {
        Product product = new Product("Product", 51,10);
        product.update();
        assertEquals(50, product.getQuality());
    }

    @Test
    public void testQualityDegradesTwiceAsFastAfterSellIn0() {
        Product product = new Product("Product", 10,10);
        product.update();
        assertEquals(8, product.getQuality());
    }

    @Test
    public void testAgedBrieIncreasesInQuality() {
        Product agedBrie = new Product("Aged Brie", 10, 20);
        agedBrie.update();
        assertEquals(21, agedBrie.getQuality());
    }

    @Test
    public void testDairyProductsDegradeTwiceAsFast() {
        Product dairyProduct = new Product("Milk", 10, 20);
        dairyProduct.update();
        assertEquals(18, dairyProduct.getQuality());
    }
}

