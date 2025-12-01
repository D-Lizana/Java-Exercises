package uax.dao;

import jakarta.transaction.SystemException;
import jakarta.transaction.Transaction;
import org.hibernate.Session;
import uax.model.Gato;

import java.util.List;

public class GestionHibernate {

    public void guardarGato(Gato gato) throws SystemException {
        // CREAMOS UNA TRANSACCION VACIA
        Transaction tx = null;

        // ABRIMOS SESSION EN LA BASE DE DATOS UTILIZANDO LA CLASE HIBERNATEUTIL QUE HEMOS CREADO PARA CONECTARNOS
        // USAMOS LA CLASE SESSION DE HIBERNATE PARA MANEJAR LA BASE DE DATOS
        try(Session session = HibernateUtil.getSessionFactory().openSession()){

            // SI HA CONSEGUIDO INICIAR SESION LA TRANSACION DEJA DE SER VACIA
            tx = (Transaction) session.beginTransaction();

            // USANDO EL METODO PERSIST AÑADIMOS EL OBJETO GATO QUE HEMOS PASADO A LA BASE DE DATOS
            // HIBERNATE MAPEA LOS DATOS PARA QUE CONCUERDEN CON LA BASE (PUEDE DAR ERROR)
            session.persist(gato);

            // CON EL METODO COMMIT ANOTAMOS LA TRANSACCION EN LA BASE DE DATOS
            tx.commit();
            System.out.println("Dato añadido correctamente a la base de datos.");

        } catch (Exception e) {
            // SI HA LLEGADO A CONECTARSE PERO HA HABIDO ALGUN ERROR ELIMINA LOS CAMBIOS
            if(tx != null){
                tx.rollback();
                System.out.println("Error al ejecutar el mapeo.");
            }
        }
    }

    public List<Gato> leerGatos(){
        // TE CONECTAS A LA BASE DE DATOS USANDO EL SESSION Y LA CLASE CREADA
        try(Session session = HibernateUtil.getSessionFactory().openSession()){

            // LA SENTENCIA SQL NOS DEVUELVE LOS DATOS DE LA TABLA
            // LOS MAPEA COMO GATO Y CREA UNA LISTA CON ELLOS, LA CUAL NOS DEVUELVE
            return session.createQuery("FROM gato", Gato.class).list();
        }
    }


}
