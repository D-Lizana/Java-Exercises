package uax.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/uax";
    private static final String USER = "root";
    private static final String PASS = "";


    public static Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL,USER,PASS);

        }catch(SQLException | ClassNotFoundException e){
            System.out.println("Error al conectar con la base de datos.");
            return null;
        }
    }

}
