package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory INSTANCE =
            new Configuration().configure().buildSessionFactory();

    private HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        return INSTANCE;
    }
}