package org.sergei.soap.dao;

import org.sergei.soap.model.Order;

import javax.persistence.EntityManager;
import java.util.List;

@SuppressWarnings("unchecked")
public class OrderDAO extends GenericHibernateDAO<Order> {

    private static final String SQL_FIND_BY_CUSTOMER_AND_ORDER_ID = "SELECT o FROM Order o WHERE Order.customer.customerId = :customerId AND orderId = :orderId";

    private static final String SQL_FIND_BY_CUSTOMER_ID = "SELECT o FROM Order o WHERE Order.customer.customerId = :customerId";

    public OrderDAO() {
        setPersistentClass(Order.class);
    }

    public Order findByCustomerIdAndOrderId(Long customerId, Long orderId) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Order order = (Order) entityManager.createQuery(SQL_FIND_BY_CUSTOMER_AND_ORDER_ID).getSingleResult();
        entityManager.setProperty("customerId", customerId);
        entityManager.setProperty("orderId", orderId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return order;
    }

    public List<Order> findAllByCustomerId(Long customerId) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Order> orderList = entityManager.createQuery(SQL_FIND_BY_CUSTOMER_ID)
                .setParameter("customerId", customerId)
                .getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return orderList;
    }

    public List<Order> findAllByCustomerIdAndProduct(Long customerId, String product) {
        return null;
    }

    public List<Order> findAllByProduct(String product) {
        return null;
    }

    public void delete(Order order) {

    }

}
