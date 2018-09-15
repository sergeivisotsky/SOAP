
package org.sergei.soap.ws.impl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.sergei.soap.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Order", targetNamespace = "http://soap.sergei.org")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Order {


    /**
     * 
     * @param inputCustomerId
     * @param inputOrderId
     * @return
     *     returns org.sergei.soap.Order
     */
    @WebMethod(action = "getOrderByCustomerIdAndOrderId")
    @WebResult(name = "outputOrderByCustomerIdAndOrderId", targetNamespace = "")
    @RequestWrapper(localName = "getOrderByCustomerIdAndOrderId", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.GetOrderByCustomerIdAndOrderId")
    @ResponseWrapper(localName = "getOrderByCustomerIdAndOrderIdResponse", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.GetOrderByCustomerIdAndOrderIdResponse")
    @Action(input = "getOrderByCustomerIdAndOrderId", output = "http://soap.sergei.org/Order/getOrderByCustomerIdAndOrderIdResponse")
    public org.sergei.soap.Order getOrderByCustomerIdAndOrderId(
        @WebParam(name = "inputCustomerId", targetNamespace = "")
        Long inputCustomerId,
        @WebParam(name = "inputOrderId", targetNamespace = "")
        Long inputOrderId);

    /**
     * 
     * @param inputCustomerId
     * @return
     *     returns java.util.List<org.sergei.soap.Order>
     */
    @WebMethod(action = "getAllOrdersByCustomerId")
    @WebResult(name = "outputAllOrdersByCustomerId", targetNamespace = "")
    @RequestWrapper(localName = "getAllOrdersByCustomerId", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.GetAllOrdersByCustomerId")
    @ResponseWrapper(localName = "getAllOrdersByCustomerIdResponse", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.GetAllOrdersByCustomerIdResponse")
    @Action(input = "getAllOrdersByCustomerId", output = "http://soap.sergei.org/Order/getAllOrdersByCustomerIdResponse")
    public List<org.sergei.soap.Order> getAllOrdersByCustomerId(
        @WebParam(name = "inputCustomerId", targetNamespace = "")
        Long inputCustomerId);

    /**
     * 
     * @param inputCustomerId
     * @param inputGood
     * @return
     *     returns java.util.List<org.sergei.soap.Order>
     */
    @WebMethod(action = "getAllOrdersByCustomerIdAndGood")
    @WebResult(name = "outputAllOrdersByCustomerIdAndGood", targetNamespace = "")
    @RequestWrapper(localName = "getAllOrdersByCustomerIdAndGood", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.GetAllOrdersByCustomerIdAndGood")
    @ResponseWrapper(localName = "getAllOrdersByCustomerIdAndGoodResponse", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.GetAllOrdersByCustomerIdAndGoodResponse")
    @Action(input = "getAllOrdersByCustomerIdAndGood", output = "http://soap.sergei.org/Order/getAllOrdersByCustomerIdAndGoodResponse")
    public List<org.sergei.soap.Order> getAllOrdersByCustomerIdAndGood(
        @WebParam(name = "inputCustomerId", targetNamespace = "")
        Long inputCustomerId,
        @WebParam(name = "inputGood", targetNamespace = "")
        String inputGood);

    /**
     * 
     * @param goodWeight
     * @param transId
     * @param price
     * @param customerId
     * @param good
     */
    @WebMethod(action = "saveOrder")
    @RequestWrapper(localName = "saveOrder", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.SaveOrder")
    @ResponseWrapper(localName = "saveOrderResponse", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.SaveOrderResponse")
    @Action(input = "saveOrder", output = "http://soap.sergei.org/Order/saveOrderResponse")
    public void saveOrder(
        @WebParam(name = "customerId", targetNamespace = "")
        Long customerId,
        @WebParam(name = "transId", targetNamespace = "")
        Long transId,
        @WebParam(name = "good", targetNamespace = "")
        String good,
        @WebParam(name = "goodWeight", targetNamespace = "")
        double goodWeight,
        @WebParam(name = "price", targetNamespace = "")
        double price);

    /**
     * 
     * @return
     *     returns java.util.List<org.sergei.soap.Order>
     */
    @WebMethod(action = "getAllOrders")
    @WebResult(name = "outputAllOrders", targetNamespace = "")
    @RequestWrapper(localName = "getAllOrders", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.GetAllOrders")
    @ResponseWrapper(localName = "getAllOrdersResponse", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.GetAllOrdersResponse")
    @Action(input = "getAllOrders", output = "http://soap.sergei.org/Order/getAllOrdersResponse")
    public List<org.sergei.soap.Order> getAllOrders();

    /**
     * 
     * @param inputOrderId
     * @return
     *     returns org.sergei.soap.Order
     */
    @WebMethod(action = "getOrderById")
    @WebResult(name = "outputOrderById", targetNamespace = "")
    @RequestWrapper(localName = "getOrderById", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.GetOrderById")
    @ResponseWrapper(localName = "getOrderByIdResponse", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.GetOrderByIdResponse")
    @Action(input = "getOrderById", output = "http://soap.sergei.org/Order/getOrderByIdResponse")
    public org.sergei.soap.Order getOrderById(
        @WebParam(name = "inputOrderId", targetNamespace = "")
        Long inputOrderId);

    /**
     * 
     * @param orderId
     * @param customerId
     */
    @WebMethod(action = "deleteOrderByCustomerIdAndOrderId")
    @RequestWrapper(localName = "deleteOrderByCustomerIdAndOrderId", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.DeleteOrderByCustomerIdAndOrderId")
    @ResponseWrapper(localName = "deleteOrderByCustomerIdAndOrderIdResponse", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.DeleteOrderByCustomerIdAndOrderIdResponse")
    @Action(input = "deleteOrderByCustomerIdAndOrderId", output = "http://soap.sergei.org/Order/deleteOrderByCustomerIdAndOrderIdResponse")
    public void deleteOrderByCustomerIdAndOrderId(
        @WebParam(name = "customerId", targetNamespace = "")
        Long customerId,
        @WebParam(name = "orderId", targetNamespace = "")
        Long orderId);

    /**
     * 
     * @param inputOrderGood
     * @return
     *     returns java.util.List<org.sergei.soap.Order>
     */
    @WebMethod(action = "getOrderByGood")
    @WebResult(name = "outputOrderByGood", targetNamespace = "")
    @RequestWrapper(localName = "getAllOrdersByGood", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.GetAllOrdersByGood")
    @ResponseWrapper(localName = "getAllOrdersByGoodResponse", targetNamespace = "http://soap.sergei.org", className = "org.sergei.soap.GetAllOrdersByGoodResponse")
    @Action(input = "getOrderByGood", output = "http://soap.sergei.org/Order/getAllOrdersByGoodResponse")
    public List<org.sergei.soap.Order> getAllOrdersByGood(
        @WebParam(name = "inputOrderGood", targetNamespace = "")
        String inputOrderGood);

}