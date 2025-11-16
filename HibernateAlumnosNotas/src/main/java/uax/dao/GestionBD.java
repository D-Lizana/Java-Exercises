package uax.dao;

import jakarta.transaction.SystemException;
import jakarta.transaction.Transaction;
import org.hibernate.Session;
import uax.model.Moto;

import java.util.List;

public class GestionBD {

    public void guardarMoto(Moto moto) throws SystemException {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = (Transaction) session.beginTransaction();
            session.persist(moto);
            tx.commit();
            if(tx == null) System.out.println("Moto insertada correctamente.");
        }
        catch (Exception e){
            if(tx != null) tx.rollback();
            System.out.println("Error al ejecutar el mapeo.");
        }
    }

    public List<Moto> leerMotos(){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            return session.createQuery("from Moto", Moto.class).list();
        }
    }

    public void eliminarMoto(int id) throws SystemException {

        // transaction para asegurar la persistencia y que los datos esten correctos si ocurre un fallo
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = (Transaction) session.beginTransaction();
            Moto moto = session.get(Moto.class, id);
            if(moto != null) session.remove(moto);
            tx.commit();
            if(tx == null) System.out.println("Moto borrada correctamente.");
        }
        catch (Exception e){
            if(tx != null){
                tx.rollback();
                System.out.println("Error al ejecutar el mapeo.");
            }

        }
    }

    public Moto buscarMotosMarca(String marca){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            return session.createQuery("from Moto where marca = :marca",Moto.class)
                    .setParameter("marca", marca)
                    .setMaxResults(1)
                    .uniqueResult();
        }
    }

}
