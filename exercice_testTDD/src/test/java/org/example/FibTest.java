package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class FibTest {

    @Test
    public void testFibSeriesWithRange1() {
        Fib fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();

        assertFalse(result.isEmpty(), "Le résultat n'est pas vide");
        assertEquals(List.of(0), result, "Le résultat correspond à une liste qui contient 0");
    }

    @Test
    public void testFibSeriesWithRange6() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();

        assertTrue(result.contains(3), "Le résultat contient le chiffre 3");
        assertEquals(6, result.size(), "Le résultat contient 6 éléments");
        assertFalse(result.contains(4), "Le résultat n'a pas le chiffre 4 en son sein");
        assertEquals(List.of(0, 1, 1, 2, 3, 5), result, "Le résultat correspond à une liste qui contient {0, 1, 1, 2, 3, 5}");

        for (int i = 1; i < result.size(); i++) {
            assertTrue(result.get(i - 1) <= result.get(i), "Le résultat est trié de façon ascendante");
        }
    }
}
