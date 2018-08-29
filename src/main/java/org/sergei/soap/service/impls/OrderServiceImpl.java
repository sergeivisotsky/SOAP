package org.sergei.soap.service.impls;

import org.sergei.soap.exceptions.RecordNotFoundException;
import org.sergei.soap.dao.repos.OrderDAO;
import org.sergei.soap.model.Order;
import org.sergei.soap.service.repos.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;

    @Override
    public List<Order> getAllOrders() {
        return orderDAO.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        if (!orderDAO.existsById(id)) {
            throw new RecordNotFoundException("No record with this parameters found");
        }

        return orderDAO.findById(id);
    }

    @Override
    public Order getOrderByCustomerIdAndOrderId(Long customerId, Long orderId) {
        if (!orderDAO.existsByCustomerId(customerId) || !orderDAO.existsById(orderId)) {
            throw new RecordNotFoundException("No record with this parameters found");
        }

        return orderDAO.findByCustomerIdAndOrderId(customerId, orderId);
    }

    @Override
    public List<Order> getAllOrdersByCustomerId(Long id) {
        if (!orderDAO.existsByCustomerId(id)) {
            throw new RecordNotFoundException("No record with this parameters found");
        }

        return orderDAO.findAllByCustomerId(id);
    }

    @Override
    public List<Order> getAllOrdersByCustomerIdAndGood(Long customerId, String good) {
        if (!orderDAO.existsByCustomerId(customerId) || !orderDAO.existsByGood(good)) {
            throw new RecordNotFoundException("No record with this parameters found");
        }

        return orderDAO.findAllByCustomerIdAndGood(customerId, good);
    }

    @Override
    public List<Order> getAllByGood(String good) {
        if (!orderDAO.existsByGood(good)) {
            throw new RecordNotFoundException("No record with this parameters found");
        }

        return orderDAO.findAllByGood(good);
    }
}
