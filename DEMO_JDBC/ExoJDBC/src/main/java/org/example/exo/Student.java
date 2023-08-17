package org.example.exo;

import java.time.LocalDate;

public class Student {

    private int id;
    private String lastname;
    private String Firstname;
    private int ClassNumber;
    private LocalDate DateDiplome;

    public Student(String lastname, String firstname, int classNumber, LocalDate dateDiplome) {
        this.lastname = lastname;
        Firstname = firstname;
        ClassNumber = classNumber;
        DateDiplome = dateDiplome;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public int getClassNumber() {
        return ClassNumber;
    }

    public void setClassNumber(int classNumber) {
        ClassNumber = classNumber;
    }

    public LocalDate getDateDiplome() {
        return DateDiplome;
    }

    public void setDateDiplome(LocalDate dateDiplome) {
        DateDiplome = dateDiplome;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastname='" + lastname + '\'' +
                ", Firstname='" + Firstname + '\'' +
                ", ClassNumber=" + ClassNumber +
                ", DateDiplome=" + DateDiplome +
                '}';
    }

    public Student() {
    }
}
