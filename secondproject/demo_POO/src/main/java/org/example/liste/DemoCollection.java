package org.example.liste;

import java.util.*;

public class DemoCollection {
    public static void main(String[] args) {

    // Démo pour Vector
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("Vector : " + vector);

    // Méthodes pour Vector
        System.out.println("1. Taille du Vector : " +vector.size());
        System.out.println("2. Element à l'index 1 : " + vector.get(1));
        System.out.println("3. Est ce que l'element est present ? : " + vector.contains("Banana"));

    // Démo pour SortedSet

        SortedSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("Java");
        sortedSet.add("Python");
        sortedSet.add("Javascript");
        sortedSet.add("Java"); // Non ajouté car doublons
        System.out.println(" SortedSet " + sortedSet);

    // Méthodes pour sortedSet
        System.out.println("1- Premier élement : " +sortedSet.first());
        System.out.println("2- Dernier élement : " +sortedSet.last());
        SortedSet<String> headSet = sortedSet.headSet("Python");
        System.out.println("3- Sous-ensemble avant \"Javascript\" : " +headSet);

    // Démo pour Linkedlist

        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(3.14);
        linkedList.add(2.45);
        linkedList.add(1.125);
        System.out.println("Linkedlist : " +linkedList);

        // Méthode pour LinkedList

        System.out.println("1. Premier élement : " +linkedList.getFirst());
        System.out.println("2. Dernier élement : " +linkedList.getLast());
        linkedList.removeFirst();
        System.out.println("3. Suppression du premier élement " +linkedList);

        // Démo pour SortedMap

        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Java", 20);
        sortedMap.put("Python", 10);
        sortedMap.put("C++",30);
        System.out.println(" SortedMap : " +sortedMap);

        // Méthodes pour SortedMap
        System.out.println("1. Clés de sortedMap : " + sortedMap.keySet());
        System.out.println("2. Valeurs de sortedMap : " + sortedMap.keySet());






    }
}
