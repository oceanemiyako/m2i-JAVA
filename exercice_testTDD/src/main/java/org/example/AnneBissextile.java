package org.example;

public class AnneBissextile {

    private int year;


    public boolean  isLeap(int years) {
    return (year % 400) == 0 || (year%4==0 && year%100 != 0) || (year%4000==0);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}



