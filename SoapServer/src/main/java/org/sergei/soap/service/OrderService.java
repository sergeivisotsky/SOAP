package org.sergei.soap.service;

import org.sergei.soap.dao.OrderDAO;
import org.sergei.soap.dto.OrderDTO;

import java.util.List;

public class OrderService {

    private OrderDAO orderDAO;

    public void saveOrder(OrderDTO orderDTO) {
//        orderDAO.saveOrder(orderDTO);
    }

    public List<OrderDTO> getAllOrders() {
//        return orderDAO.findAll();
        return null;
    }

    public OrderDTO getOrderById(Long id) {

//        return orderDAO.findById(id);
        return null;
    }

    public OrderDTO getOrderByCustomerIdAndOrderId(Long customerId, Long orderId) {

//        return orderDAO.findByCustomerIdAndOrderId(customerId, orderId);
        return null;
    }

    public List<OrderDTO> getAllOrdersByCustomerId(Long id) {
//        return orderDAO.findAllByCustomerId(id);
        return null;
    }

    public List<OrderDTO> getAllOrdersByCustomerIdAndProduct(Long customerId, String good) {
//        return orderDAO.findAllByCustomerIdAndProduct(customerId, good);
        return null;
    }

    public List<OrderDTO> getAllByProduct(String good) {
//        return orderDAO.findAllByProduct(good);
        return null;
    }

    public void deleteOrder(Long customerId, Long orderId) {
//        orderDAO.delete(orderDTO);
    }
}
