package uax.dao;

import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    @Getter
    private static final SessionFactory sessionFactory = buildSessionFactory();

    // USA EL ARCHIVO DE CONFIGURACION XML PROPORCIONADO PARA CONECTARSE A LA BASE DE DATOS
    // SE USAN LAS CLASE SESSIONFACTORY  Y CONFIGURATION QUE NOS LAS DA LA DEENDENCIA Y SE CONFIGURA CON EL XML
    private static SessionFactory buildSessionFactory() {
        try{
            return new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(uax.model.Gato.class) //clase que se va a mapear
                    .buildSessionFactory(); // se prepara para realizar las sentencias SQL
        }catch (Throwable e){
            System.err.println("Error creando SessionFactory: "+ e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown(){
        // El getter lo sacamos de la etiqueta lombok de esta clase
        getSessionFactory().close();
    }

}
