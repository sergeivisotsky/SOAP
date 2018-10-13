package org.sergei.soap.service;

import org.modelmapper.ModelMapper;
import org.sergei.soap.dao.OrderDAO;
import org.sergei.soap.dto.OrderDTO;
import org.sergei.soap.model.Order;
import org.sergei.soap.utils.ObjectMapperUtils;

import java.util.List;

public class OrderService {

    private OrderDAO orderDAO = new OrderDAO();

    private ModelMapper modelMapper = new ModelMapper();

    public OrderDTO getOrderById(Long orderId) {
        Order order = orderDAO.findOne(orderId);
        return modelMapper.map(order, OrderDTO.class);
    }

    public List<OrderDTO> getAllOrders() {
        List<Order> orderList = orderDAO.findAll();
        return ObjectMapperUtils.mapAll(orderList, OrderDTO.class);
    }

    public void saveOrder(OrderDTO orderDTO) {
        Order order = modelMapper.map(orderDTO, Order.class);
        orderDAO.save(order);
    }

    public OrderDTO getOrderByCustomerIdAndOrderId(Long customerId, Long orderId) {
        Order order = orderDAO.findByCustomerIdAndOrderId(customerId, orderId);
        return modelMapper.map(order, OrderDTO.class);
    }

    public List<OrderDTO> getAllOrdersByCustomerId(Long customerId) {
        List<Order> orderList = orderDAO.findAllByCustomerId(customerId);
        return ObjectMapperUtils.mapAll(orderList, OrderDTO.class);
    }

    public List<OrderDTO> getAllOrdersByCustomerIdAndProduct(Long customerId, String good) {
//        return orderDAO.findAllByCustomerIdAndProduct(customerId, good);
        return null;
    }

    public List<OrderDTO> getAllByProduct(String product) {
//        return orderDAO.findAllByProduct(product);
        return null;
    }

    public void deleteOrder(Long customerId, Long orderId) {
//        orderDAO.delete(orderDTO);
    }
}
