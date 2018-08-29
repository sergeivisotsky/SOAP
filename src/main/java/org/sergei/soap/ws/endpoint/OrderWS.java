package org.sergei.soap.ws.endpoint;

import org.sergei.soap.persistence.pojo.Order;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@Component
@WebService(name = "Order", targetNamespace = "http://soap.controller.sergei.org")
public interface OrderWS {
    @WebMethod
    @WebResult(name = "outputAllOrders")
    List<Order> getAllOrders();

    @WebMethod
    @WebResult(name = "outputAllOrdersByCustomerId")
    List<Order> getAllOrdersByCustomerId(@WebParam(name = "inputCustomerId") Long customerId);

    @WebMethod
    @WebResult(name = "outputAllOrdersByCustomerIdAndGood")
    List<Order> getAllOrdersByCustomerIdAndGood(@WebParam(name = "inputCustomerId") Long customerId,
                                                @WebParam(name = "inputGood") String good);

    @WebMethod
    @WebResult(name = "outputOrderById")
    Order getOrderById(@WebParam(name = "inputOrderId") Long orderId);

    @WebMethod
    @WebResult(name = "outputOrderByCustomerIdAndOrderId")
    Order getOrderByCustomerIdAndOrderId(@WebParam(name = "inputCustomerId") Long customerId,
                                         @WebParam(name = "inputOrderId") Long orderId);

    @WebMethod
    @WebResult(name = "outputOrderByGood")
    List<Order> getAllOrdersByGood(@WebParam(name = "inputOrderGood") String good);
}
