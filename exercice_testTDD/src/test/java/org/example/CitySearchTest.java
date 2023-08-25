package org.example;

import org.example.exception.CityNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CitySearchTest {
    private CitySearch citySearch;

    @BeforeEach
    public void setUp() {
        List<String> cities = Arrays.asList(
                "Paris", "Budapest", "Skopje", "Rotterdam", "Valence",
                "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York",
                "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"
        );
        citySearch = new CitySearch(cities);
    }

    @Test
    public void testSearchWithShortQuery() {
        assertThrows(CityNotFoundException.class, () -> citySearch.search("a"));
    }

    @Test
    public void testSearchExactMatch() {
        List<String> result = citySearch.search("Va");
        List<String> expected = Arrays.asList("Valence", "Vancouver");
        assertEquals(expected, result);
    }

    @Test
    public void testSearchCaseInsensitive() {
        List<String> result = citySearch.search("budapest");
        List<String> expected = Arrays.asList("Budapest");
        assertEquals(expected, result);
    }

    @Test
    public void testSearchPartialMatch() {
        List<String> result = citySearch.search("ape");
        List<String> expected = Arrays.asList("Budapest");
        assertEquals(expected, result);
    }

    @Test
    public void testSearchAllCities() {
        List<String> result = citySearch.search("*");
        List<String> expected = Arrays.asList(
                "Paris", "Budapest", "Skopje", "Rotterdam", "Valence",
                "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York",
                "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"
        );
        assertEquals(expected, result);
    }
}
