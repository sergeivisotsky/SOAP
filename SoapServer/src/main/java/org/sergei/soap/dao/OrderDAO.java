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

import org.sergei.soap.model.Order;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
@SuppressWarnings("unchecked")
public class OrderDAO extends GenericHibernateDAO<Order> {

    private static final String SQL_FIND_BY_CUSTOMER_AND_ORDER_ID = "SELECT o FROM Order o WHERE o.customer.customerId = :customerId AND orderId = :orderId";

    private static final String SQL_FIND_ALL_BY_CUSTOMER_ID = "SELECT o FROM Order o WHERE o.customer.customerId = :customerId";

    private static final String SQL_FIND_ALL_BY_CUSTOMER_ID_AND_PRODUCT = "SELECT o FROM Order o WHERE o.customer.customerId = :customerId AND o.product = :product";

    private static final String SQL_ALL_BY_PRODUCT = "SELECT o FROM Order o WHERE o.product = :product";

    public OrderDAO() {
        setPersistentClass(Order.class);
    }

    public Order findByCustomerIdAndOrderId(Long customerId, Long orderId) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Order order = (Order) entityManager.createQuery(SQL_FIND_BY_CUSTOMER_AND_ORDER_ID)
                .setParameter("customerId", customerId)
                .setParameter("orderId", orderId)
                .getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        return order;
    }

    public List<Order> findAllByCustomerId(Long customerId) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Order> orderList = entityManager.createQuery(SQL_FIND_ALL_BY_CUSTOMER_ID)
                .setParameter("customerId", customerId)
                .getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return orderList;
    }

    public List<Order> findAllByCustomerIdAndProduct(Long customerId, String product) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Order> orderList = entityManager.createQuery(SQL_FIND_ALL_BY_CUSTOMER_ID_AND_PRODUCT)
                .setParameter("customerId", customerId)
                .setParameter("product", product)
                .getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return orderList;
    }

    public List<Order> findAllByProduct(String product) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Order> orderList = entityManager.createQuery(SQL_ALL_BY_PRODUCT)
                .setParameter("product", product)
                .getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return orderList;
    }
}
