package org.sergei.soap.service.repos;

import org.sergei.soap.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    List<Order> getAllOrders();

    Order getOrderById(Long id);

    Order getOrderByCustomerIdAndOrderId(Long customerId, Long orderId);

    List<Order> getAllOrdersByCustomerId(Long id);

    List<Order> getAllOrdersByCustomerIdAndGood(Long customerId, String good);

    List<Order> getAllByGood(String good);
}
