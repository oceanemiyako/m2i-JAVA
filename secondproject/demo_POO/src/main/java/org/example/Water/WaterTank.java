package org.example.Water;
/*
1. Créer une classe WaterTank
2. Ajouter les attributs suivants: poids à vide, capacité maximale, niveau de
remplissage
3. Créer une méthode remplir() qui ajoutera une volume d'eau à la citerne
4. Créer une méthode vider() qui enlèvera un volume d'eau à la citerne
5. Créer un attribut de classe qui contiendra la totalité des volumes d'eau de la
citerne
6. /!\ le volume d'eau d'une citerne ne peut pas être négatif ou dépasser le
volume maximum
 */
public class WaterTank {

    private double emptyWeight; // poids à vide en anglais
    private double maxCapacity; // capacité max en anglais
    private double currentLevel; //niveau de remplissage en anglais

    private static double totalWaterVolume = 0;

    public WaterTank(double emptyWeight, double maxCapacity, double currentLevel) {
        this.emptyWeight = emptyWeight;
        this.maxCapacity = maxCapacity;
        this.currentLevel = currentLevel;
        totalWaterVolume += currentLevel;
    }

public void fill(double volume) {    //remplir
    double potentialLevel = currentLevel + volume;
    if (potentialLevel <= maxCapacity) {
        currentLevel = potentialLevel;
        totalWaterVolume += volume;
    }

    }

public void empty(double volume){     //vider

    double potentialLevel = currentLevel - volume;
    if (potentialLevel >= 0) {
        currentLevel = potentialLevel;
        totalWaterVolume -= volume;
    }
}

    public static double getTotalWaterVolume() {
        return totalWaterVolume;
    }

    public double getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(double emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(double currentLevel) {
        this.currentLevel = currentLevel;
    }

}

