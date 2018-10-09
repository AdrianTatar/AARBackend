package com.rso.aar.persistence.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class HibernateDao<T, I extends Serializable> {

    private Class<T> persistentClass;

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public HibernateDao() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.persistentClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    protected T getById(I id) {
        return (T) getSession().get(persistentClass, id);
    }

    @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.MANDATORY)
    public T persist(T entity) {
        return (T) getSession().merge(entity);
    }
    
    @SuppressWarnings("unchecked")
    protected List<T> findAll() {
         return (List<T>) getSession().createCriteria(persistentClass).list();       
    }

}
