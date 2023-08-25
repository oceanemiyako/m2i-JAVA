package org.example;
/*et renvoie les vi
En appliquant les principes du TDD et junit. Implémenter une fonctionnalité de recherche de ville. La fonction prend une chaîne (texte de recherche) .
en entrée les trouvées qui correspondent au texte de recherche
Exemple de villes : Paris, Budapest, Skopje, Rotterdam, Valence, Vancouver, Amsterdam, Vienne, Sydney, New York, Londres, Bangkok, Hong Kong, Dubaï, Rome, Istanbul Conditions:
1- Si le texte de la recherche contient moins de 2 caractères, aucun résultat ne devrait être renvoyé ou Une exception est levée de type NotFoundException.
2- Si le texte de recherche est égal ou supérieur à 2 caractères, il doit renvoyer tous les noms de ville commençant par le texte de recherche exact.
Par exemple, pour le texte de recherche "Va", la fonction doit renvoyer Valence et Vancouver
3- La fonctionnalité de recherche doit être insensible à la casse
4- La fonctionnalité de recherche devrait également fonctionner lorsque le texte de recherche n'est qu'une partie d'un nom de ville
Par exemple "ape" devrait renvoyer la ville "Budapest"
5- Si le texte de recherche est un « * » (astérisque), il doit renvoyer tous les noms de ville.
 */
import org.example.exception.CityNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CitySearch {
    private List<String> cities;

    public CitySearch(List<String> cities) {
        this.cities = cities;
    }

        public List<String> search(String query) {
            if (query.length() < 2) {
                throw new CityNotFoundException();
            }

            List<String> result = new ArrayList<>();

            for (String city : cities) {
                if (city.toLowerCase().startsWith(query.toLowerCase())) {
                    result.add(city);
                }
            }
            return result;
        }
    }

