package uax.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:5432/concesionario";
    private static final String USER = "postgres";
    private static final String PASS = "1234";

    public static Connection conectar(){
        try{
            return DriverManager.getConnection(URL,USER,PASS);

        } catch (SQLException e) {
            System.out.println("Error al conectar la base de datos.");
            return null;
        }
    }

    public static void desconectar(Connection conn){
        try{
            if(conn != null && !conn.isClosed()){
                conn.close();
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión");
        }
    }
}
