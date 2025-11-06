package uax.database;

import uax.model.Moto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionBD {

    private List<Moto> listaMotos = new ArrayList<>();

    public void insertarMoto(Moto moto){
        String sql = "INSERT INTO motos (marca,modelo,cilindrada) VALUES (?,?,?)";
        Connection conn = ConexionBD.conectar();

        try(PreparedStatement statement = conn.prepareStatement(sql)){
            statement.setString(1, moto.getMarca());
            statement.setString(2, moto.getModelo());
            statement.setString(3, moto.getCilindrada());
            statement.executeUpdate();
            System.out.println("Datos insertados correctamente.");

        }catch(SQLException e){
            System.err.println("Error al insertar en la base de datos.");
        }finally{
            ConexionBD.desconectar(conn);
            // o conn.close()
        }
    }

    public List<Moto> leerMotos(){
        return null;
    }

    public List<Moto> leerMotosPorMarca(String marca){
        return null;
    }

    public void eliminarMoto(int id){

    }

}
