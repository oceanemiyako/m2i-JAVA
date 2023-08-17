package org.example.exo;

import org.example.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class ManagerStudent {
    public static void AjoutStudent() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("enter first name : :");
        student.setFirstname(scanner.next());

        System.out.println("enter last name :");
        student.setLastname(scanner.next());

        System.out.println("enter numberClass :");
        student.setClassNumber(scanner.nextInt());

        System.out.print("Merci de saisir la date (aaaa-mm-jj)  : ");
        student.setDateDiplome(LocalDate.parse(scanner.next()));

//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Connection connection = DatabaseManager.getPostgreSQLConnection();
            String request = "INSERT INTO eleves (prenom, nom, numberClasse, anneediplome) VALUES ( ? , ? , ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(request);
            preparedStatement.setString(1, student.getFirstname());
            preparedStatement.setString(2,student.getLastname());
            preparedStatement.setInt(3,student.getClassNumber());
            preparedStatement.setDate(4, Date.valueOf(student.getDateDiplome()));

            int nbRows = preparedStatement.executeUpdate();
            System.out.println("Nombre ligne "+nbRows);

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        // }
        //public static void AllStudent(){
        //   System.out.println("=== Student ===");
        // for (Student student : ) {
        //    System.out.println(eleves);
        //  }
    }
}
