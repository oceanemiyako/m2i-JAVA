package exoHotel;

public class Chambre {

    private int number;
    private String statut;
    private int numberLits;
    private double price;

    public Chambre(int number, String statut, int numberLits, double price) {
        this.number = number;
        this.statut = statut;
        this.numberLits = numberLits;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getNumberLits() {
        return numberLits;
    }

    public void setNumberLits(int numberLits) {
        this.numberLits = numberLits;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chambre{" + "number=" + number + ", statut='" + statut + '\'' + ", numberLits=" + numberLits + ", price=" + price + '}';
    }
}
