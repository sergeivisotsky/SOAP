/*
 * Copyright (c) 2018 Sergei Visotsky
 */

package org.sergei.soap.ws;

import org.sergei.soap.dto.OrderDTO;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(name = "Order", targetNamespace = "http://soap.sergei.org")
public interface OrderWS {

    @WebMethod(action = "saveOrder")
    @WebResult(name = "inputOrder")
    void saveOrder(@WebParam(name = "customerId")Long customerId,
                   @WebParam(name = "transId") Long transId,
                   @WebParam(name = "product") String product,
                   @WebParam(name = "productWeight") Double productWeight,
                   @WebParam(name = "price") Double price);

    @WebMethod(action = "getAllOrders")
    @WebResult(name = "outputAllOrders")
    List<OrderDTO> getAllOrders();

    @WebMethod(action = "getAllOrdersByCustomerId")
    @WebResult(name = "outputAllOrdersByCustomerId")
    List<OrderDTO> getAllOrdersByCustomerId(@WebParam(name = "inputCustomerId") Long customerId);

    @WebMethod(action = "getAllOrdersByCustomerIdAndProduct")
    @WebResult(name = "outputAllOrdersByCustomerIdAndProduct")
    List<OrderDTO> getAllOrdersByCustomerIdAndProduct(@WebParam(name = "inputCustomerId") Long customerId,
                                                      @WebParam(name = "inputProduct") String product);

    @WebMethod(action = "getOrderById")
    @WebResult(name = "outputOrderById")
    OrderDTO getOrderById(@WebParam(name = "inputOrderId") Long orderId);

    @WebMethod(action = "getOrderByCustomerIdAndOrderId")
    @WebResult(name = "outputOrderByCustomerIdAndOrderId")
    OrderDTO getOrderByCustomerIdAndOrderId(@WebParam(name = "inputCustomerId") Long customerId,
                                            @WebParam(name = "inputOrderId") Long orderId);

    @WebMethod(action = "getOrderByProduct")
    @WebResult(name = "outputOrderByProduct")
    List<OrderDTO> getAllOrdersByProduct(@WebParam(name = "inputOrderProduct") String product);

    @WebMethod(action = "deleteOrderByCustomerIdAndOrderId")
    @WebResult(name = "deleteOrderData")
    void deleteOrderByCustomerIdAndOrderId(@WebParam(name = "customerId") Long customerId,
                                           @WebParam(name = "orderId") Long orderId);
}
