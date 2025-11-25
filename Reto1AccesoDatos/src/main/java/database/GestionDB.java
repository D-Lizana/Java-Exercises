package database;

import model.Cliente;
import model.Coche;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestionDB {

    private List<Coche> listaCochesVendidos = new ArrayList<>();

    public void insertarCocheVendido(Coche cocheVendido, Cliente cliente){
        String sql = "INSERT INTO coches_vendidos (marca,modelo,anno_fabricacion,precio,nombre,apellido,dni) VALUES (?,?,?,?,?,?,?)";
        Connection conn = ConexionDB.conectar();

        try(PreparedStatement statement = conn.prepareStatement(sql)){
            statement.setString(1, cocheVendido.getMarca());
            statement.setString(2, cocheVendido.getModelo());
            statement.setInt(3, cocheVendido.getAnno_fabricacion());
            statement.setDouble(4, cocheVendido.getPrecio());
            statement.setString(5, cliente.getNombre());
            statement.setString(6, cliente.getApellido());
            statement.setString(7, cliente.getDNI());
            statement.executeUpdate();

            System.out.println("Venta realizada con éxito.");

        } catch (SQLException e) {
            System.err.println("Error al insertar en la base de datos.");
        }finally{
            ConexionDB.desconectar(conn);
        }
    }

    public List<Coche> leerCochesVendidos(){
        listaCochesVendidos.clear();
        String sql = "SELECT * FROM coches_vendidos";
        Connection conn = ConexionDB.conectar();

        try(Statement statement = conn.createStatement()){
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()){
                Coche cocheVendido = new Coche(rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getInt("anno_fabricacion"),
                        rs.getDouble("precio"));

                listaCochesVendidos.add(cocheVendido);
            }

        }catch (SQLException e){
            System.err.println("Error al leer la base de datos.");
        }finally{
            ConexionDB.desconectar(conn);
        }

        return listaCochesVendidos;
    }

    public void mostrarCochesVendidos(){
        List<Coche> cochesVendidos = leerCochesVendidos();
        if (cochesVendidos.isEmpty()){
            System.out.println("No se ha vendido ningún coche.");
        }
        else{
            System.out.println("Lista de coches vendidos: ");
            cochesVendidos.forEach(System.out::println);
        }
    }






}

















