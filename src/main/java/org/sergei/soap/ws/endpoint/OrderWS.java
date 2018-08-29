package org.sergei.soap.ws.endpoint;

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
    @WebMethod(action = "getAllOrders")
    @WebResult(name = "outputAllOrders")
    List<Order> getAllOrders();

    @WebMethod(action = "getAllOrdersByCustomerId")
    @WebResult(name = "outputAllOrdersByCustomerId")
    List<Order> getAllOrdersByCustomerId(@WebParam(name = "inputCustomerId") Long customerId);

    @WebMethod(action = "getAllOrdersByCustomerIdAndGood")
    @WebResult(name = "outputAllOrdersByCustomerIdAndGood")
    List<Order> getAllOrdersByCustomerIdAndGood(@WebParam(name = "inputCustomerId") Long customerId,
                                                @WebParam(name = "inputGood") String good);

    @WebMethod(action = "getOrderById")
    @WebResult(name = "outputOrderById")
    Order getOrderById(@WebParam(name = "inputOrderId") Long orderId);

    @WebMethod(action = "getOrderByCustomerIdAndOrderId")
    @WebResult(name = "outputOrderByCustomerIdAndOrderId")
    Order getOrderByCustomerIdAndOrderId(@WebParam(name = "inputCustomerId") Long customerId,
                                         @WebParam(name = "inputOrderId") Long orderId);

    @WebMethod(action = "getOrderByGood")
    @WebResult(name = "outputOrderByGood")
    List<Order> getAllOrdersByGood(@WebParam(name = "inputOrderGood") String good);
}
