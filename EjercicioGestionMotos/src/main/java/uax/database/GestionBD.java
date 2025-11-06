package uax.database;

import uax.model.Moto;

import java.sql.*;
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
        listaMotos.clear();
        String sql = "SELECT * FROM motos";
        Connection conn = ConexionBD.conectar();

        try(Statement statement = conn.createStatement()){
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()){
                Moto moto = new Moto(rs.getInt("id"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("cilindrada"));

                listaMotos.add(moto);
            }

        }catch(SQLException e){
            System.out.println("Error al leer la base de datos.");
        }finally{
            ConexionBD.desconectar(conn);
        }
        return listaMotos;
    }

    public List<Moto> leerMotosPorMarca(String marca){
        return null;
    }

    public void eliminarMoto(int id){

    }

}
