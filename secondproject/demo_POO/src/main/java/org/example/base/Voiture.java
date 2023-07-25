package org.example.base;

public class Voiture {

    // Attributs d'instance
    // <visibilité> <type> <nom>
    // public = accessible en dehors de la classe

    public String couleur;
    public int carburant;
    public int puissant;
    // private : accessible uniquement dans la classe
    private String marque;
    // protected: accessible dans la classe et dans les enfants qui héritent de cette classe
    protected int nombrePortes;
// clic droit + generate +  constructor
    //public Voiture(String couleur, int carburant, int puissant, String marque, int nombrePortes) {
       // this.couleur = couleur;
      //  this.carburant = carburant;
       // this.puissant = puissant;
        //this.marque = marque;
       // this.nombrePortes = nombrePortes;
   // }

    // Constructeur
    // Défini comment est construit la classe
    public Voiture() {

        System.out.println("Je suis dans le constructeur sans paramétre");

    }

    // Polymorphisme : possibilité de définir plusieurs méthode avec le même nom mais des signatures différentes
    public Voiture(String couleur){
        // this (<parametres>) appelle le construteur avec la signature similaire
        this();
        System.out.println("Je suis dans le constructeur avec la couleur");
        this.couleur = couleur;
    }

    public Voiture(String couleur, int carburant, int puissant) {
        // this.couleur = couleur;
        this(couleur);
        this.carburant = carburant;
        this.puissant = puissant;
        System.out.println("Je suis dans le constructeur avec tout les attributs");
    }

    // Méthodes d'instance

    // Visibilité <type de retour> <nom> (<paramètre>)

    public void demarrer(){
        System.out.println("La voiture démarre");
    }
    public void freiner(){
        System.out.println("la voiture freine");
    }

    public void remplirReservoir(int volume){
        carburant += volume;
    }
    public double puissanceChevauxFiscaux(){
        return puissant / 7.;
    }

    @Override
    public String toString() {
        return "Voiture :" +
                "couleur='" + couleur + '\'' +
                ", carburant=" + carburant +
                ", puissant=" + puissant +
                ", marque='" + marque + '\'' +
                ", nombrePortes=" + nombrePortes +
                '.';
    }

    // Destructeur
    protected void finalize(){
    }


}
