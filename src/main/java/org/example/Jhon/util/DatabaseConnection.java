package org.example.Jhon.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private  static String url="jdbc:mysql://localhost:33060/jdbcprueba";
    private  static String user="root";
    private static String pass="secret";


    //conexion con el metodo anterior
    //private static Connection myConn;
//    public static Connection getInstance() throws SQLException {
//        if(myConn==null){
//            myConn= DriverManager.getConnection(url,user,pass);
//        }
//        return myConn;
//    }

    //esto es usando un pool de conexiones de la dependencia dbcp2
    private static BasicDataSource pool;

}
