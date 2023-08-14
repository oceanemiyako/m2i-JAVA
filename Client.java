package exoHotel;
/*
1- Créer une classe Client possédant : un identifiant, un nom, un prénom et un numéro de téléphone
2- Créer une classe Chambre ayant : un numéro, un statut, un nombre de lits et un tarif.
3- Créer une classe Réservation possédant : un identifiant, un statut , une liste de chambres et un client
4- Créer une classe Hotel comportant : une liste de clients, une liste de chambres et une liste de réservations
5- Créer une IHM pour tester l'application
 */

public class Client {

    private int id;
    private String name;
    private String firstname;
    private String numberPhone;

    public Client(int id, String name, String firstname, String numberPhone) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.numberPhone = numberPhone;
    }

    public int getIdentifiant() {
        return id;
    }

    public void setIdentifiant(int identifiant) {
        this.id = identifiant;
    }

    public String getName() {
        return name;
    }

    public void setNom(String nom) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Client{ " + " id = " + id + ", name ='" + name + '\'' + ", firstname='" + firstname + '\'' + ", numberPhone ='" + numberPhone + '\'' + '}';
    }
}
