package uax.dao;

import jakarta.transaction.SystemException;
import jakarta.transaction.Transaction;
import org.hibernate.Session;
import uax.model.Cliente;
import uax.model.Coche;


import java.util.List;
import java.util.Scanner;

public class GestionBD {

    public void guardarCoche(Coche coche) throws SystemException {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = (Transaction) session.beginTransaction();
            session.persist(coche);
            tx.commit();
            System.out.println("Coche insertado correctamente");

        } catch (Exception e) {
            if(tx != null) tx.rollback();
            System.out.println("Error al ejecutar el mapeo.");
        }
    }

    public List<Coche> leerCoches(){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            return session.createQuery("FROM coche", Coche.class).list();
        }
    }

    public void mostrarCochesDisponibles() {
            List<Coche> lista = leerCoches();
            for (Coche coche : lista) {
                if(!coche.isVendido()) System.out.println(coche);
            }
    }

    public void venderCoche() throws SystemException {
        Scanner sc = new Scanner(System.in);
        mostrarCochesDisponibles();
        System.out.println();
        Transaction tx = null;

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = (Transaction) session.beginTransaction();
            System.out.print("ID del coche a vender: ");
            int idCoche = Integer.parseInt(sc.nextLine());

            Coche coche = session.get(Coche.class, idCoche);
            if (coche == null || coche.isVendido()) {
                System.out.println("El coche no existe o ya está vendido.");
                return;
            }

            Cliente cliente = new Cliente();

            System.out.print("Introduce nombre del cliente: ");
            cliente.setNombre(sc.nextLine());
            System.out.print("Introduce Apellido del cliente: ");
            cliente.setApellido(sc.nextLine());
            System.out.print("Introduce DNI del cliente: ");
            cliente.setDni(sc.nextLine());

            session.save(cliente);

            coche.setCliente(cliente);
            coche.setVendido(true);
            session.update(coche);

            tx.commit();
            System.out.println("Coche vendido correctamente.");

        } catch (Exception e) {
            if(tx != null){
                tx.rollback();
                System.out.println("Error al modificar la base de datos.");
            }
        }
    }

    public void mostrarCochesVendidos() {
        List<Coche> lista = leerCoches();
        for (Coche coche : lista) {
            if(coche.isVendido()) System.out.println(coche);
        }
    }
}
