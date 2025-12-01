package uax.dao;

import uax.model.Gato;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestionBD {

    private List<Gato> gatos = new ArrayList<>();

    // A LA BASE DE DATOS SE SUBEN LOS DATOS DE UNO EN UNO
    public void guardarGato(Gato gato){
        // PREPARAMOS LA SENTENCIA SQL PARA INSERTAR DATOS
        String sql = "INSERT INTO gatos (chip,nombre,raza) VALUES (?,?,?)";

        // NOS CONECTAMOS A LA BASE DE DATOS CON LA CLASE QUE HEMOS CREADO ANTES CONEXIONBD
        Connection conexion = ConexionBD.conectar();

        // PREPARAMOS LOS DATOS Y LOS INSERTAMOS CON LA SENTENCIA SQL USANDO PREPAREDSTATEMENT
        try(PreparedStatement ps = conexion.prepareStatement(sql)){
            // LE DECIMOS PARAMETRO A PARAMETRO CUAL TIENE QUE GUARDAR (NUMERO DE LA COLUMNA EN LA TABLA)
            ps.setInt(1, gato.getChip());
            ps.setString(2, gato.getNombre());
            ps.setString(3, gato.getRaza());

            // AL SELECCIONAR LOS DATOS QUEDA EJECUTAR LA SENTIENCIA SQL
            ps.executeUpdate();
            System.out.println("Datos insertados correctamente.");


        }catch (SQLException e){
            System.out.println("Error al insertar en la base de datos.");
        }finally{
            ConexionBD.desconectar(conexion);
        }
    }

    // SE RECUPERAN TODOS LOS DATOS DE LA BASE DE DATOS
    public List<Gato> leerGatos(){
        // VACIAMOS LA LISTA PARA DESCARGAR LOS DATOS
        gatos.clear();

        // CREAMOS LA SENTENCIA SQL PARA QUE NOS DEVUELVA LA TABLA
        String sql = "SELECT * FROM gatos";

        // NOS CONECTAMOS A LA BASE DE DATOS
        Connection conexion = ConexionBD.conectar();

        // USANDO STATEMENT PREPARAMOS LA SENTENCIA SQL Y LA EJECUTAMOS
        try(Statement statement = conexion.createStatement()) {

            // EN EL RESULTSET GUARDAMOS LOS DATOS RECUPERADOS DE LA BASE DE DATOS
            ResultSet rs = statement.executeQuery(sql);

            // EL RESULTSET LEE LOS DATOS LINEA A LINEA
            // EL BUCLE LEE LOS DATOS HASTA QUE NO HAYA MAS LINEAS
            while(rs.next()){
                // CON LOS DATOS DE CADA LINEA CREAMOS EL OBJETO CORRESPONDIENTE
                Gato gato = new Gato(rs.getInt("chip"),rs.getString("nombre"),rs.getString("raza"));

                // AÑADIMOS EL OBJETO A LA LISTA QUE VAMOS A DEVOLVER
                gatos.add(gato);
            }
            // UNA VEZ ACABA EL BUCLE YA TENEMOS LA LISTA CON TODOS LOS GATOS Y LA PODEMOS DEVOLVER

        }catch (SQLException e){
            System.out.println("Error al leer los datos.");
        }finally {
            // SE ENCARGA DE CERRAR LA CONEXION AL ACABAR EL METODO
            ConexionBD.desconectar(conexion);
        }
        return gatos;
    }
}


















