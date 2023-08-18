package org.example.model;
/*
1- Créer une classe CompteBancaire Cette classe aura : un solde, un client et une liste d'opérations(dépôt ou retrait).
2- Créer une classe Client avec les attributs suivants : nom, prénom, identifiant, liste des comptes et numéro de téléphone. On créera le client au début de l'application
3- Créer une classe Opération avec les attributs suivants : numéro, montant et statut (depot/retrait en enum)
4- Créer une IHM pour tester l'application. Pour un compte au choix de l'utilisateur on pourra effectuer un dépôt, un retrait ou afficher le solde et les opérations
On souhaite ajouter une couche base de données pour gérer les comptes bancaires.
 */
import java.util.List;

public class CompteBancaire {

    private double pay;
    private String customer;
    private List<Operation> operations;

    public CompteBancaire(double pay, String customer, List<Operation> operations) {
        this.pay = pay;
        this.customer = customer;
        this.operations = operations;
    }



    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "pay=" + pay +
                ", customer='" + customer + '\'' +
                ", operations=" + operations +
                '}';
    }
}
