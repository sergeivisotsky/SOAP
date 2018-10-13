package org.sergei.soap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Transactional
@SuppressWarnings("unchecked")
public abstract class GenericHibernateDAO<T extends Serializable> {

    private static final String PERSISTENCE_UNIT = "CustomerData";

    private Class<T> persistentClass;

    public void setPersistentClass(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);

    public List<T> findAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<T> entityList = entityManager.createQuery("FROM " + persistentClass.getName()).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return entityList;
    }
}
