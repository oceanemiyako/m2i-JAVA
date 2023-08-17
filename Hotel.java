package exoHotel;

import com.sun.management.UnixOperatingSystemMXBean;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Client> clients;
    private List<Chambre> chambres;
    private List<Reservation> reservations;

    public Hotel(List<Client> clients, List<Chambre> chambres, List<Reservation> reservations) {
        this.clients = clients;
        this.chambres = chambres;
        this.reservations = reservations;
    }

    // TODO: 14/08/2023  ajouter/supprimer des clients, chambres, reservations
    public Hotel() {
        clients = new ArrayList<>();
        chambres = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addChambre(Chambre chambre) {
        chambres.add(chambre);
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void afficherListClient() {
        for (int i = 0; i < clients.size(); i++) {
            System.out.println((i + 1) + ") " + clients.get(i).toString());
        }
    }

    public void affReservationClient() {
        for (int i = 0; i < reservations.size(); i++) {
            System.out.println((i + 1) + ") " + reservations.get(i).toString());

        }
    }

    public void removeReservation(Reservation reservation){
        reservations.remove(reservation);
    }

    public void affListReservationClient() {
        for (int i = 0; i < reservations.size(); i++) {
            System.out.println((i + 1) + ") " + reservations.get(i).toString());

        }
    }

}