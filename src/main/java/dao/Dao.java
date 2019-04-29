package dao;

import models.Avto;
import models.Creater;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.Factory;
import java.util.List;

public class Dao {

    public Creater findById(int id) {
        return Factory.getSessionFactory().openSession().get(Creater.class, id);
    }

    public void save(Creater creater) {
        Session session = Factory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(creater);
        tx1.commit();
        session.close();
    }

    public void update(Creater creater) {
        Session session = Factory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(creater);
        tx1.commit();
        session.close();
    }

    public void delete(Creater creater) {
        Session session = Factory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(creater);
        tx1.commit();
        session.close();
    }

    public Avto findAutoById(int id) {
        return Factory.getSessionFactory().openSession().get(Avto.class, id);
    }

    public List<Creater> findAll() {
        List<Creater> creaters =
            (List<Creater>)
                Factory.getSessionFactory().openSession().createQuery("From creater").list();
        return creaters;
    }
}
