package uax.dao;

import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    @Getter
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try{
            return new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(uax.model.Moto.class) //clase que se va a mapear
                    .buildSessionFactory(); // se prepara para realizar las sentencias SQL
        }catch (Throwable e){
            System.err.println("Error creando SessionFactory: "+ e);
            throw new ExceptionInInitializerError(e);
        }

    }

    public static void shutdown(){
        // El getter lo sacamos de la etiqueta lombok de esta clase
        getSessionFactory().close();
    }

}
