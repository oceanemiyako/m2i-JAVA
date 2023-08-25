package org.example;
import org.example.exception.MaxQualityException;
import org.example.exception.NegativeQualityException;
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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {


    private Store store;

    private Product product;


    @BeforeEach
    void setUp() {
        store = new Store();
    }

    @Test
    void testUpdateShouldDecreaseQuality() throws NegativeQualityException, MaxQualityException {
        //Arrange
        product = Product.builder().quality(10).sellIn(10).build();

        //Act
        store.update(product);

        //Assert
        Assertions.assertEquals(9, product.getQuality());

    }

    @Test
    void testUpdateShouldDecreaseSellIn() throws NegativeQualityException, MaxQualityException {
        //Arrange
        product = Product.builder().quality(10).sellIn(10).build();

        //Act
        store.update(product);

        //Assert
        Assertions.assertEquals(9, product.getSellIn());

    }


    @Test
    void testUpdateShouldDecreaseQualityTwiceWhenSellInIs0() throws NegativeQualityException, MaxQualityException {
        product = Product.builder().sellIn(0).quality(10).build();
        store.update(product);
        Assertions.assertEquals(8, product.getQuality());
    }

    @Test
    void testUpdateShouldRaiseNegativeQualityExceptionWhenQualityIsNegative() {
        product = Product.builder().quality(-10).sellIn(5).build();
        Assertions.assertThrowsExactly(NegativeQualityException.class, () -> {
            store.update(product);
        });
    }

    @Test
    void testUpdateShouldDecreaseQualityOnceWhenSellInIs0AndQualityIs1() throws NegativeQualityException, MaxQualityException {
        product = Product.builder().sellIn(0).quality(1).build();
        store.update(product);
        Assertions.assertEquals(0, product.getQuality());
    }

    @Test
    void testUpdateShouldRaiseExceptionWhenQualityGT50() {
        product = Product.builder().sellIn(10).quality(51).build();
        Assertions.assertThrowsExactly(MaxQualityException.class,() -> {
            store.update(product);
        });
    }

    @Test
    void testUpdateShouldIncreaseQualityWhenProductNameIsBrie() throws NegativeQualityException, MaxQualityException {
        product = Product.builder().type("laitier").name("brie vieilli")
                .sellIn(5).quality(10).build();
        store.update(product);
        Assertions.assertEquals(11, product.getQuality());
    }

    @Test
    void testUpdateShouldDecreaseQualityTwiceWhenTypeIsLaitier() throws NegativeQualityException, MaxQualityException {
        product = Product.builder().sellIn(5).quality(10).type("laitier").build();
        store.update(product);
        Assertions.assertEquals(8, product.getQuality());
    }

    @Test
    void testUpdateShouldDecreaseQualityOnceWhenTypeIsLaitierAndQualityIs1() throws NegativeQualityException, MaxQualityException {
        product = Product.builder().sellIn(5).type("laitier").quality(1).build();
        store.update(product);
        Assertions.assertEquals(0, product.getQuality());
    }

    @Test
    void testUpdateShouldDecreaseQualityFourTimeWhenTypeIsLaitierAndSellInIs0() throws NegativeQualityException, MaxQualityException {
        product = Product.builder().sellIn(0).quality(10).type("laitier").build();
        store.update(product);
        Assertions.assertEquals(6, product.getQuality());
    }

    @Test
    void testUpdateShouldDecreaseQualityThreeTimeWhenTypeIsLaitierAndSellInIs0AndQualityIs3() throws NegativeQualityException, MaxQualityException {
        product = Product.builder().sellIn(0).quality(3).type("laitier").build();
        store.update(product);
        Assertions.assertEquals(0, product.getQuality());
    }

}

