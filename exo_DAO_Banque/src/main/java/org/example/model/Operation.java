package org.example.model;

import jdk.jshell.Snippet;

import java.sql.SQLException;
import java.sql.Statement;

/*
1- Créer une classe CompteBancaire Cette classe aura : un solde, un client et une liste d'opérations(dépôt ou retrait).
2- Créer une classe Client avec les attributs suivants : nom, prénom, identifiant, liste des comptes et numéro de téléphone. On créera le client au début de l'application
3- Créer une classe Opération avec les attributs suivants : numéro, montant et statut (depot/retrait en enum)
4- Créer une IHM pour tester l'application. Pour un compte au choix de l'utilisateur on pourra effectuer un dépôt, un retrait ou afficher le solde et les opérations
On souhaite ajouter une couche base de données pour gérer les comptes bancaires.
 */
public class Operation {

    public int number;

    public double rising;
    private Status statut;

    public Operation(int number, double rising, Status statut) {
        this.number = number;
        this.rising = rising;
        this.statut = statut;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getRising() {
        return rising;
    }

    public void setRising(double rising) {
        this.rising = rising;
    }

    public Status getStatut() {
        return statut;
    }

    public void setStatut(Status statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "number=" + number +
                ", rising=" + rising +
                ", statut=" + statut +
                '}';
    }
}
