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
public class Store  {

        public void update(Product product) throws NegativeQualityException, MaxQualityException {
            int minusQuality = 0;
            if(product.getQuality() <= 0) {
                throw new NegativeQualityException();
            }
            if(product.getQuality() > 50) {
                throw new MaxQualityException();
            }
            if(product.getType() != null && product.getType().equals("laitier")) {
                if(product.getName() != null && product.getName().equals("brie vieilli")) {
                    minusQuality = -1;
                }else {
                    if(product.getSellIn() == 0) {
                        if(product.getQuality()>3)
                            minusQuality = 4;
                        else
                            minusQuality = product.getQuality();
                    }
                    else {
                        if(product.getQuality() > 1)
                            minusQuality = 2;
                        else
                            minusQuality = product.getQuality();
                    }

                }
            }

            else {
                if(product.getSellIn() <= 0) {
                    if(product.getQuality() == 1){
                        minusQuality = product.getQuality();
                    }else {
                        minusQuality = 2;
                    }
                }else {
                    minusQuality = 1;
                }
            }
            product.setQuality(product.getQuality() - minusQuality);
            product.setSellIn(product.getSellIn()-1);
        }
    }


