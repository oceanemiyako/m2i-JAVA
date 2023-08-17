package org.example.exoHotel;

import java.util.ArrayList;

public class Reservation {
    private int id;

    private boolean statut;

    private ArrayList<Chambre> listeChambres;

    private Client client;
    private static int nbReservation;
    public Reservation(boolean statut, ArrayList<Chambre> listeChambres, Client client) {
        this.statut = statut;
        this.listeChambres = listeChambres;
        this.client = client;
        this.id = nbReservation++;

    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public ArrayList<Chambre> getListeChambres() {
        return listeChambres;
    }

    public void setListeChambres(ArrayList<Chambre> listeChambres) {
        this.listeChambres = listeChambres;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public static int getNbReservation() {
        return nbReservation;
    }

    public static void setNbReservation(int nbReservation) {
        Reservation.nbReservation = nbReservation;
    }

    @Override
    public String toString() {
        /*
        String statutString = "";
        if (statut) {
            statutString = "Reservation en cours";
        }else {
            statutString = "Reservation annulée ou fini";
        }
        */

        String statutString = statut ? "Reservation en cours" : "Reservation annulée ou fini";
        String message = id + ")" +
                statutString +
                " pour le client : \n " + client +
                "Liste des chambres reservées : \n ";
        for (Chambre chambre: listeChambres) {
            message += chambre.toString(); // += on ajoute en plus du message si =  tout seul on écrase ce qu'on a fait + haut

        }

        return message;
    }


}
