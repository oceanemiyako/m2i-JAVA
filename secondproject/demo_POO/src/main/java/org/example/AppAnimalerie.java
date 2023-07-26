package org.example;

import org.example.heritage.Animal;
import org.example.heritage.Chat;
import org.example.heritage.Chien;

public class AppAnimalerie {
    public static void main(String[] args) {
        Animal animal = new Animal("Felix", 10, "Bleu");
        animal.crier();

        // System.out.println(animal.anneeNaissance()); // méthode protected

        Chat chat = new Chat("Yugi", 3, "Gris");
        chat.crier();
        Chien chien = new Chien("Orka", 1 , "Roux");
        chien.crier();

        chat.manger();

        chien.manger();

        System.out.println(animal);
        System.out.println(chien);
        System.out.println(chat);

     // Objet est l'objet racine dont toute les classes héritent
        Object object = new Object();
    }
}
