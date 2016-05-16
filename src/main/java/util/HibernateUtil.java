package util;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by KIRILL on 15.05.2016.
 */
public class HibernateUtil {

   //private static HibernateUtil util = null;
    private static final SessionFactory sessionFactory;
    //private final ThreadLocal sessions = new ThreadLocal();

    private HibernateUtil() {
    }

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


//    public Session getSession () {
//        Session session = (Session) sessions.get();
//        if (session == null) {
//            session = sessionFactory.openSession();
//            sessions.set(session);
//        }
//
//        return session;
//    }


//    public static synchronized HibernateUtil getHibernateUtil() {
//        if (util == null) {
//            util = new HibernateUtil();
//        }
//        return util;
//    }


}
