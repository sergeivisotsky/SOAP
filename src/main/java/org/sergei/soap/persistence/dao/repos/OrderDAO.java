package org.sergei.soap.persistence.dao.repos;

import org.sergei.soap.persistence.pojo.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDAO {
    List<Order> findAll();

    Order findById(Long id);

    Order findByCustomerIdAndOrderId(Long customerId, Long orderId);

    List<Order> findAllByCustomerIdAndGood(Long customerId, String good);

    List<Order> findAllByGood(String good);

    boolean existsById(Long orderId);

    boolean existsByGood(String good);

    boolean existsByCustomerId(Long customerId);

    List<Order> findAllByCustomerId(Long id);
}
