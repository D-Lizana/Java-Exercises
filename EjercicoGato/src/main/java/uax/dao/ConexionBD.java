package uax.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/uax"; // postgresql y puerto diferente
    private static final String USER = "root"; // "postgres
    private static final String PASS = "";

    // USAMOS LA CLASE CONNECTION QUE NOS DA LA DEPENDENCIA
    // EL METODO SIEMPRE DEVUELVE ALGO, O LA CONEXION CORRECTA O NULL
    public static Connection conectar(){
        try{
            // USANDO EL DRIVER MANAGER DE LA BASE DE DATOS CORRESPONDIENTE
            // PARA CONECTARSE A LA BASE DE DATOS SIEMPRE ES OBLIGATORIO PASAR LA URL, EL USUARIO Y LA CONTRASEÑA
            return DriverManager.getConnection(URL,USER,PASS);
        }catch (SQLException e){
            System.out.println("Error al conectar a la base de datos.");
            return null;
        }
    }

    // PASAMOS LA CONEXION QE QUEREMOS DESCONECTAR
    public static void desconectar(Connection conexion){
        try{
            // SI LA CONEXION EXISTE Y ESTA ACTIVA LA CIERRA
            if(conexion != null && conexion.isClosed()){
                conexion.close();
                System.out.println("Se ha cerrado la conexión correctamente.");
            }
        } catch(SQLException e){
            System.out.println("Error al cerrar la conexion.");
        }
    }

}
