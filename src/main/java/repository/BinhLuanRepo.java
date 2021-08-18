package repository;

import com.mysql.cj.Session;

import modules.BinhLuan;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.transaction.Transaction;
import java.util.ArrayList;
import java.util.List;

public class BinhLuanRepo implements IBinhLuanRepo{
    @Autowired
    EntityManager entityManager;



    @Override
    public ArrayList<BinhLuan> findAll() {
        String queryStr = "select c from BinhLuan as c";
        TypedQuery<BinhLuan> query = entityManager.createQuery(queryStr, BinhLuan.class);
        return (ArrayList<BinhLuan>) query.getResultList();
    }

    @Override
    public BinhLuan save(BinhLuan binhLuan) {
        EntityTransaction txn = entityManager.getTransaction();
        txn.begin();
        entityManager.persist(binhLuan);
        txn.commit();
        return binhLuan;
    }

    @Override
    public BinhLuan like(int id) {

        return null;
    }


}
