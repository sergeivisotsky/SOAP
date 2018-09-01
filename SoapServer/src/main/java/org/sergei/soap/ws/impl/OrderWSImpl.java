package org.sergei.soap.ws.impl;

import org.sergei.soap.model.Order;
import org.sergei.soap.service.OrderService;
import org.sergei.soap.ws.OrderWS;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@Component
@WebService(endpointInterface = "org.sergei.soap.ws.OrderWS",
        serviceName = "OrderService", portName = "Order")
public class OrderWSImpl implements OrderWS {

    private OrderService orderService;

    @WebMethod(exclude = true)
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void saveOrder(Long customerId, Long transId,
                          String good, double goodWeight, double price) {
        Order order = new Order();

        order.setCustomerId(customerId);
        order.setTransId(transId);
        order.setGood(good);
        order.setGoodWeight(goodWeight);
        order.setPrice(price);

        orderService.saveOrder(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @Override
    public List<Order> getAllOrdersByCustomerId(Long customerId) {
        return orderService.getAllOrdersByCustomerId(customerId);
    }

    @Override
    public List<Order> getAllOrdersByCustomerIdAndGood(Long customerId, String good) {
        return orderService.getAllOrdersByCustomerIdAndGood(customerId, good);
    }

    @Override
    public Order getOrderById(Long orderId) {
        return orderService.getOrderById(orderId);
    }

    @Override
    public Order getOrderByCustomerIdAndOrderId(Long customerId, Long orderId) {
        return orderService.getOrderByCustomerIdAndOrderId(customerId, orderId);
    }

    @Override
    public List<Order> getAllOrdersByGood(String good) {
        return orderService.getAllByGood(good);
    }

    @Override
    public void deleteOrderByCustomerIdAndOrderId(Long customerId, Long orderId) {
        orderService.deleteOrder(customerId, orderId);
    }
}