package org.sergei.soap.ws.impl;

import org.sergei.soap.dto.OrderDTO;
import org.sergei.soap.service.OrderService;
import org.sergei.soap.ws.OrderWS;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

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
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setCustomerId(customerId);
        orderDTO.setTransId(transId);
        orderDTO.setProduct(product);
        orderDTO.setProductWeight(productWeight);
        orderDTO.setPrice(price);

        orderService.saveOrder(orderDTO);
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return orderService.getAllOrders();
    }

    @Override
    public List<OrderDTO> getAllOrdersByCustomerId(Long customerId) {
        return orderService.getAllOrdersByCustomerId(customerId);
    }

    @Override
    public List<OrderDTO> getAllOrdersByCustomerIdAndProduct(Long customerId, String product) {
        return orderService.getAllOrdersByCustomerIdAndProduct(customerId, product);
    }

    @Override
    public OrderDTO getOrderById(Long orderId) {
        return orderService.getOrderById(orderId);
    }

    @Override
    public OrderDTO getOrderByCustomerIdAndOrderId(Long customerId, Long orderId) {
        return orderService.getOrderByCustomerIdAndOrderId(customerId, orderId);
    }

    @Override
    public List<OrderDTO> getAllOrdersByProduct(String product) {
        return orderService.getAllByProduct(product);
    }

    @Override
    public void deleteOrderByCustomerIdAndOrderId(Long customerId, Long orderId) {
        orderService.deleteOrder(customerId, orderId);
    }
}
