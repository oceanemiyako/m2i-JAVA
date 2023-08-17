package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {



    public static Connection getPostgreSQLConnection()  {
            String url = "jdbc:postgresql://localhost:5432/classe";
            String user = "postgres";
            String password = "1234";
            //Connection connection = null;

            try{

                Connection connection = DriverManager.getConnection( url,user,password);

                if(connection != null){

                    System.out.println("Connexion OK !");

                }else{

                    System.out.println("Connexion ECHOUE !");

                }

                return connection;

            }catch (SQLException e){

                throw new RuntimeException(e);

            }
        }
    }

