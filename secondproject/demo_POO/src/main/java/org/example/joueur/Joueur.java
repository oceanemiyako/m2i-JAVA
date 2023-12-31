package org.example.joueur;
/*
1. Créer une classe Joueur
2. Ajouter les attributs suivants : nom, niveau et points d'expérience
3. Ajouter un constructeur, des getters et des setters pour ces attributs
4. Créer une méthode effectuerUneQuete() qui ajoute 10 points d'expérience
au joueur
5. Créer qu'une méthode qui augmente le niveau du joueur de +1 si son
expérience dépasse 100 points et réinitialise son expérience
6. Tester le programme
 */
public class Joueur {
 private String name;
 private int level;
 private int exp;

    public Joueur(String name) {
        this.name = name;
        this.level = 1;
        this.exp = 0;
    }

    public void effectuerUneQuete() {
       this.exp +=10;
       levelUp();
    }

     private void levelUp(){
       if(this.exp >= 100){
           this.level++;
           this.exp = 0;
           System.out.println("Le joueur : " + name + "passe au niveau : " +level);
       }
       }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
