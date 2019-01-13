/*
 * Copyright 2018-2019 the original author.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sergei.soap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
@Transactional
@SuppressWarnings("unchecked")
public abstract class GenericHibernateDAO<T extends Serializable> {

    private static final String PERSISTENCE_UNIT = "org.sergei.soap.jpa";

    private Class<T> persistentClass;

    public void setPersistentClass(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

    EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);

    public T findOne(Long aLong) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        T entity = entityManager.find(persistentClass, aLong);
        entityManager.getTransaction().commit();
        entityManager.close();
        return entity;
    }

    public List<T> findAll() {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        List<T> entityList = entityManager.createQuery("FROM " + persistentClass.getName()).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return entityList;
    }

    public void save(T entity) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void delete(T entity) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    protected void finalize() {
        if (factory != null) {
            factory.close();
        }
    }
}
