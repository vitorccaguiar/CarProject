package br.com.carproject.configurations.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectionTest
{

    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/carproject?useSSL=false";
        String user = "root";
        String pass = "";

        try {
            System.out.println("Connecting to: " + url);
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection successful!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
