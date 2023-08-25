package org.example;

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

