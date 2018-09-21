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
                          String product, double productWeight, double price) {
        Order order = new Order();

        order.setCustomerId(customerId);
        order.setTransId(transId);
        order.setProduct(product);
        order.setProductWeight(productWeight);
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
    public List<Order> getAllOrdersByCustomerIdAndProduct(Long customerId, String product) {
        return orderService.getAllOrdersByCustomerIdAndProduct(customerId, product);
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
    public List<Order> getAllOrdersByProduct(String product) {
        return orderService.getAllByGood(product);
    }

    @Override
    public void deleteOrderByCustomerIdAndOrderId(Long customerId, Long orderId) {
        orderService.deleteOrder(customerId, orderId);
    }
}
