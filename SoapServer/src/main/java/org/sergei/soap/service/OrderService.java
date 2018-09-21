package org.sergei.soap.service;

import org.sergei.soap.dao.OrderDAO;
import org.sergei.soap.exceptions.RecordNotFoundException;
import org.sergei.soap.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDAO orderDAO;

    public void saveOrder(Order order) {
        orderDAO.saveOrder(order);
    }

    public List<Order> getAllOrders() {
        return orderDAO.findAll();
    }

    public Order getOrderById(Long id) {
        if (!orderDAO.existsById(id)) {
            throw new RecordNotFoundException("No record with this parameters found");
        }

        return orderDAO.findById(id);
    }

    public Order getOrderByCustomerIdAndOrderId(Long customerId, Long orderId) {
        if (!orderDAO.existsByCustomerId(customerId) || !orderDAO.existsById(orderId)) {
            throw new RecordNotFoundException("No record with this parameters found");
        }

        return orderDAO.findByCustomerIdAndOrderId(customerId, orderId);
    }

    public List<Order> getAllOrdersByCustomerId(Long id) {
        if (!orderDAO.existsByCustomerId(id)) {
            throw new RecordNotFoundException("No record with this parameters found");
        }

        return orderDAO.findAllByCustomerId(id);
    }

    public List<Order> getAllOrdersByCustomerIdAndProduct(Long customerId, String good) {
        if (!orderDAO.existsByCustomerId(customerId) || !orderDAO.existsByProduct(good)) {
            throw new RecordNotFoundException("No record with this parameters found");
        }

        return orderDAO.findAllByCustomerIdAndProduct(customerId, good);
    }

    public List<Order> getAllByProduct(String good) {
        if (!orderDAO.existsByProduct(good)) {
            throw new RecordNotFoundException("No record with this parameters found");
        }

        return orderDAO.findAllByProduct(good);
    }

    public void deleteOrder(Long customerId, Long orderId) {
        Order order = orderDAO.findByCustomerIdAndOrderId(customerId, orderId);
        if (!orderDAO.existsByCustomerId(customerId) || !orderDAO.existsById(orderId)) {
            throw new RecordNotFoundException("No record with this parameters found");
        }

        orderDAO.delete(order);
    }
}
