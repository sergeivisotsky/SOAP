package org.sergei.soap.ws;

import org.sergei.soap.model.Order;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@Component
@WebService(name = "Order", targetNamespace = "http://soap.sergei.org")
public interface OrderWS {

    @WebMethod(action = "saveOrder")
    @WebResult(name = "inputOrder")
    void saveOrder(@WebParam(name = "customerId")Long customerId,
                   @WebParam(name = "transId") Long transId,
                   @WebParam(name = "product") String product,
                   @WebParam(name = "productWeight") double productWeight,
                   @WebParam(name = "price") double price);

    @WebMethod(action = "getAllOrders")
    @WebResult(name = "outputAllOrders")
    List<Order> getAllOrders();

    @WebMethod(action = "getAllOrdersByCustomerId")
    @WebResult(name = "outputAllOrdersByCustomerId")
    List<Order> getAllOrdersByCustomerId(@WebParam(name = "inputCustomerId") Long customerId);

    @WebMethod(action = "getAllOrdersByCustomerIdAndProduct")
    @WebResult(name = "outputAllOrdersByCustomerIdAndProduct")
    List<Order> getAllOrdersByCustomerIdAndProduct(@WebParam(name = "inputCustomerId") Long customerId,
                                                   @WebParam(name = "inputProduct") String product);

    @WebMethod(action = "getOrderById")
    @WebResult(name = "outputOrderById")
    Order getOrderById(@WebParam(name = "inputOrderId") Long orderId);

    @WebMethod(action = "getOrderByCustomerIdAndOrderId")
    @WebResult(name = "outputOrderByCustomerIdAndOrderId")
    Order getOrderByCustomerIdAndOrderId(@WebParam(name = "inputCustomerId") Long customerId,
                                         @WebParam(name = "inputOrderId") Long orderId);

    @WebMethod(action = "getOrderByProduct")
    @WebResult(name = "outputOrderByProduct")
    List<Order> getAllOrdersByProduct(@WebParam(name = "inputOrderProduct") String product);

    @WebMethod(action = "deleteOrderByCustomerIdAndOrderId")
    @WebResult(name = "deleteOrderData")
    void deleteOrderByCustomerIdAndOrderId(@WebParam(name = "customerId") Long customerId,
                                           @WebParam(name = "orderId") Long orderId);
}
