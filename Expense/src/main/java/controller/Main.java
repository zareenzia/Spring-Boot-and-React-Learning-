package controller;

import com.mysql.cj.Session;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import model.expense;
import utils.HibernateUtil;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            expense expense1 = new expense(1, "Food");
            expense expense2 = new expense(2, "Transportation");

            session.save(expense1);
            session.save(expense2);

            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
