package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/uax";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL,USER,PASS);

        } catch (SQLException | ClassNotFoundException e) {
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
