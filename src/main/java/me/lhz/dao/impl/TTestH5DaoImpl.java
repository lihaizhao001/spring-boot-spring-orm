package me.lhz.dao.impl;

import me.lhz.bo.TTest;
import me.lhz.dao.TTestH5Dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TTestH5DaoImpl implements TTestH5Dao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(TTest tTest) {
        sessionFactory.getCurrentSession().save(tTest);
    }

    @Override
    public List<TTest> list() {
        return sessionFactory.getCurrentSession().createQuery("from me.lhz.bo.TTest").list();
    }
}
