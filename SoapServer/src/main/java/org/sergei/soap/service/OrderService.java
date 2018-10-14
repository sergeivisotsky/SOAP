package org.sergei.soap.service;

import org.modelmapper.ModelMapper;
import org.sergei.soap.dao.OrderDAO;
import org.sergei.soap.dto.OrderDTO;
import org.sergei.soap.model.Order;
import org.sergei.soap.utils.ObjectMapperUtils;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class OrderService {

    @Inject
    private OrderDAO orderDAO;

    @Inject
    private ModelMapper modelMapper;

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

    public List<OrderDTO> getAllOrdersByCustomerIdAndProduct(Long customerId, String product) {
        List<Order> orderList = orderDAO.findAllByCustomerIdAndProduct(customerId, product);
        return ObjectMapperUtils.mapAll(orderList, OrderDTO.class);
    }

    public List<OrderDTO> getAllByProduct(String product) {
        List<Order> orderList = orderDAO.findAllByProduct(product);
        return ObjectMapperUtils.mapAll(orderList, OrderDTO.class);
    }

    public void deleteOrder(Long customerId, Long orderId) {
        Order order = orderDAO.findOne(orderId);
        orderDAO.delete(order);
    }
}
