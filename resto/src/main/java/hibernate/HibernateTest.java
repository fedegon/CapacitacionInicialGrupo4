package hibernate;

import org.hibernate.Session;

public class HibernateTest {
  public static void main(String[] args) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();

    // Check database version
    String sql = "select version()";

    String result = (String) session.createNativeQuery(sql).getSingleResult();
    System.out.println("RESTO SQL version: " + result);

    session.getTransaction().commit();
    session.close();

    
    HibernateUtil.shutdown();
  }
}