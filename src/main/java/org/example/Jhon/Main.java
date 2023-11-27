package org.example.Jhon;

import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {
//        Connection myConn=null;
//        PreparedStatement myStamt=null;
//        Statement myStamtNormal=null;
//        ResultSet myRes=null;

        String url="jdbc:mysql://localhost:33060/jdbcprueba";
        String user="root";
        String password="secret";

        // aca ya implemento el try with resources , esto me permite un autoclose de las estancias de conexion
        
        try(Connection myConn= DriverManager.getConnection(url,user,password);
            Statement myStamtNormal=myConn.createStatement();
            ResultSet myRes=myStamtNormal.executeQuery("SELECT * FROM employees order by pa_surname");) {

//            esto se hacia normal pero sin el try with resoruces
//            //1. conexion a nuestra base de datos
//            myConn= DriverManager.getConnection(url,user,password);
//            System.out.println("Genial Nos conectamos");
//
//            //2.Crea una declaracion objeto
//            myStamtNormal=myConn.createStatement();
//            //3.Ejecutar consulta SQL
//            myRes=myStamtNormal.executeQuery("SELECT * FROM employees order by pa_surname");
//
            while(myRes.next()){
                System.out.println(myRes.getString("first_name")+","+myRes.getString("email"));
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Algo salio mal ):");
        }
    }
}