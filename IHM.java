package exoHotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IHM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Hotel hotel = new Hotel();

        while (true) {
            System.out.println("1. Ajouter un client");
            System.out.println("2. Afficher la liste des clients");
            System.out.println("3. Afficher les réservations d'un client");
            System.out.println("4. Ajouter une réservation");
            System.out.println("5. Annuler une réservation");
            System.out.println("6. Afficher la liste des réservations");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            Scanner scanner2;
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nom du client");
                    String nameClient = scanner.nextLine();
                    System.out.println("Prénom du client");
                    String firstnameClient = scanner.nextLine();
                    System.out.println("NumberPhoneClient");
                    String numberPhoneClient = scanner.nextLine();
                    hotel.addClient(new Client(1,nameClient,firstnameClient , numberPhoneClient));
                    break;
                case 2:
                    hotel.afficherListClient();
                    break;
                case 3:
                    hotel.affReservationClient();
                    break;

                case 4 :
                    // Ajouter une réservation
                    System.out.println("Id Reservation");
                    String idReservations = scanner.nextLine();
                    System.out.println("Statut");
                    String statuts = scanner.nextLine();
                    System.out.println("Nombre de lit");
                    String numberChambres = scanner.nextLine();
                    System.out.println("Nom du Client");
                    String nameClientel = scanner.nextLine();
                    //hotel.addReservation( new Reservation(idReservations, statuts, numberChambres, nameClientel));
                    break;

                case 5 :
                    // Annuler une réservation
                    //hotel.removeReservation();
                    break;

                case 6 :
                    hotel.affListReservationClient();
                    break;

                case 0:
                    System.out.println("Good Bye !");
                    System.exit(0);

                default:
                    System.out.println(" Invalid choice !");
            }
        }
    }
}

