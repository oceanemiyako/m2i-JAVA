package org.example.model;

import java.util.List;

/*
1- Créer une classe CompteBancaire Cette classe aura : un solde, un client et une liste d'opérations(dépôt ou retrait).
2- Créer une classe Client avec les attributs suivants : nom, prénom, identifiant, liste des comptes et numéro de téléphone. On créera le client au début de l'application
3- Créer une classe Opération avec les attributs suivants : numéro, montant et statut (depot/retrait en enum)
4- Créer une IHM pour tester l'application. Pour un compte au choix de l'utilisateur on pourra effectuer un dépôt, un retrait ou afficher le solde et les opérations
On souhaite ajouter une couche base de données pour gérer les comptes bancaires.
 */
public class Client {

    public String last_name;

    public  String First_name;

    private int id;

    public String numberPhone;

    private List<CompteBancaire> compteBancaires;


    public Client(String last_name, String first_name, int id, String numberPhone) {
        this.last_name = last_name;
        First_name = first_name;
        this.id = id;
        this.numberPhone = numberPhone;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public List<CompteBancaire> getCompteBancaires() {
        return compteBancaires;
    }

    public void setCompteBancaires(List<CompteBancaire> compteBancaires) {
        this.compteBancaires = compteBancaires;
    }

    @Override
    public String toString() {
        return "Client{" +
                "last_name='" + last_name + '\'' +
                ", First_name='" + First_name + '\'' +
                ", id=" + id +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
