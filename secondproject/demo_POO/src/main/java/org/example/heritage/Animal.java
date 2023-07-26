package org.example.heritage;

import java.time.Year;

public class Animal {

    private String name; //Nom
    private int old; //Age
    private String color; //Couleur

    public Animal(String name, int old, String color) {
        this.name = name;
        this.old = old;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void crier(){
        System.out.println("Un animal n'a pas de cri");
    }

    public void manger(){
        System.out.println("L'animal mange");
    }
  protected int anneeNaissance(){
        return Year.now().getValue() - old;
}
private int tailleName(){
        return this.name.length();
}

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", color='" + color + '\'' +
                '}';
    }
}
