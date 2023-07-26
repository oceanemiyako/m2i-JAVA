package org.example.heritage;

// Utilisation de mot clé extend pour hériter d'une classe
public class Chat extends Animal{

    private int life;

    // Appel du constructeur parent

    public Chat(String name, int old, String color){
        // Utilisation du mot clé super pour appeler le constructeur du parent avec ses paramétres
        super(name, old , color);
        this.life = 7;
    }

    public int getLife() {
        return life;
    }
    // Surcharge de la méthode parent
    // utilisation de l'annotation @Override
    @Override
    public void crier(){
        System.out.println("Miaou miaou");
    }
    // Surcharge de la méthode parent
// utilisation de l'ancien comportement avec super.<nom>(<paramétres>)

    @Override
    public void manger(){
        super.manger();
        System.out.println("Je mange de délicieux poisson");
    }

    @Override
    public String toString() {
        return "Nom du chat " +getName() + " Age : " +getOld() + " année de naissance " +anneeNaissance();
    }
}
