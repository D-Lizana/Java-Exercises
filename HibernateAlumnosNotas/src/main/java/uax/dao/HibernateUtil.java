package uax.dao;

import lombok.Getter;
import org.hibernate.SessionFactory;

public class HibernateUtil {

    @Getter
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {


    }

    public static void shutdown(){
        // El getter lo sacamos de la etiqueta lombok
        getSessionFactory().close();
    }

}
