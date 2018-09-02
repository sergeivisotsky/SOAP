
package org.sergei.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sergei.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteOrderByCustomerIdAndOrderIdResponse_QNAME = new QName("http://soap.sergei.org", "deleteOrderByCustomerIdAndOrderIdResponse");
    private final static QName _SaveOrder_QNAME = new QName("http://soap.sergei.org", "saveOrder");
    private final static QName _GetOrderByCustomerIdAndOrderId_QNAME = new QName("http://soap.sergei.org", "getOrderByCustomerIdAndOrderId");
    private final static QName _GetOrderById_QNAME = new QName("http://soap.sergei.org", "getOrderById");
    private final static QName _GetAllOrdersByCustomerIdAndGoodResponse_QNAME = new QName("http://soap.sergei.org", "getAllOrdersByCustomerIdAndGoodResponse");
    private final static QName _GetAllOrdersByCustomerIdAndGood_QNAME = new QName("http://soap.sergei.org", "getAllOrdersByCustomerIdAndGood");
    private final static QName _GetAllOrdersByGoodResponse_QNAME = new QName("http://soap.sergei.org", "getAllOrdersByGoodResponse");
    private final static QName _GetOrderByCustomerIdAndOrderIdResponse_QNAME = new QName("http://soap.sergei.org", "getOrderByCustomerIdAndOrderIdResponse");
    private final static QName _GetAllOrders_QNAME = new QName("http://soap.sergei.org", "getAllOrders");
    private final static QName _SaveOrderResponse_QNAME = new QName("http://soap.sergei.org", "saveOrderResponse");
    private final static QName _GetOrderByIdResponse_QNAME = new QName("http://soap.sergei.org", "getOrderByIdResponse");
    private final static QName _GetAllOrdersResponse_QNAME = new QName("http://soap.sergei.org", "getAllOrdersResponse");
    private final static QName _GetAllOrdersByCustomerId_QNAME = new QName("http://soap.sergei.org", "getAllOrdersByCustomerId");
    private final static QName _GetAllOrdersByCustomerIdResponse_QNAME = new QName("http://soap.sergei.org", "getAllOrdersByCustomerIdResponse");
    private final static QName _DeleteOrderByCustomerIdAndOrderId_QNAME = new QName("http://soap.sergei.org", "deleteOrderByCustomerIdAndOrderId");
    private final static QName _GetAllOrdersByGood_QNAME = new QName("http://soap.sergei.org", "getAllOrdersByGood");
    private final static QName _Order_QNAME = new QName("http://soap.sergei.org", "order");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sergei.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderByCustomerIdAndOrderIdResponse }
     * 
     */
    public GetOrderByCustomerIdAndOrderIdResponse createGetOrderByCustomerIdAndOrderIdResponse() {
        return new GetOrderByCustomerIdAndOrderIdResponse();
    }

    /**
     * Create an instance of {@link GetAllOrdersByGoodResponse }
     * 
     */
    public GetAllOrdersByGoodResponse createGetAllOrdersByGoodResponse() {
        return new GetAllOrdersByGoodResponse();
    }

    /**
     * Create an instance of {@link GetAllOrdersByCustomerIdAndGood }
     * 
     */
    public GetAllOrdersByCustomerIdAndGood createGetAllOrdersByCustomerIdAndGood() {
        return new GetAllOrdersByCustomerIdAndGood();
    }

    /**
     * Create an instance of {@link GetAllOrdersByCustomerIdAndGoodResponse }
     * 
     */
    public GetAllOrdersByCustomerIdAndGoodResponse createGetAllOrdersByCustomerIdAndGoodResponse() {
        return new GetAllOrdersByCustomerIdAndGoodResponse();
    }

    /**
     * Create an instance of {@link GetOrderByCustomerIdAndOrderId }
     * 
     */
    public GetOrderByCustomerIdAndOrderId createGetOrderByCustomerIdAndOrderId() {
        return new GetOrderByCustomerIdAndOrderId();
    }

    /**
     * Create an instance of {@link GetOrderById }
     * 
     */
    public GetOrderById createGetOrderById() {
        return new GetOrderById();
    }

    /**
     * Create an instance of {@link DeleteOrderByCustomerIdAndOrderIdResponse }
     * 
     */
    public DeleteOrderByCustomerIdAndOrderIdResponse createDeleteOrderByCustomerIdAndOrderIdResponse() {
        return new DeleteOrderByCustomerIdAndOrderIdResponse();
    }

    /**
     * Create an instance of {@link SaveOrder }
     * 
     */
    public SaveOrder createSaveOrder() {
        return new SaveOrder();
    }

    /**
     * Create an instance of {@link GetAllOrdersResponse }
     * 
     */
    public GetAllOrdersResponse createGetAllOrdersResponse() {
        return new GetAllOrdersResponse();
    }

    /**
     * Create an instance of {@link GetOrderByIdResponse }
     * 
     */
    public GetOrderByIdResponse createGetOrderByIdResponse() {
        return new GetOrderByIdResponse();
    }

    /**
     * Create an instance of {@link SaveOrderResponse }
     * 
     */
    public SaveOrderResponse createSaveOrderResponse() {
        return new SaveOrderResponse();
    }

    /**
     * Create an instance of {@link GetAllOrders }
     * 
     */
    public GetAllOrders createGetAllOrders() {
        return new GetAllOrders();
    }

    /**
     * Create an instance of {@link GetAllOrdersByGood }
     * 
     */
    public GetAllOrdersByGood createGetAllOrdersByGood() {
        return new GetAllOrdersByGood();
    }

    /**
     * Create an instance of {@link DeleteOrderByCustomerIdAndOrderId }
     * 
     */
    public DeleteOrderByCustomerIdAndOrderId createDeleteOrderByCustomerIdAndOrderId() {
        return new DeleteOrderByCustomerIdAndOrderId();
    }

    /**
     * Create an instance of {@link GetAllOrdersByCustomerIdResponse }
     * 
     */
    public GetAllOrdersByCustomerIdResponse createGetAllOrdersByCustomerIdResponse() {
        return new GetAllOrdersByCustomerIdResponse();
    }

    /**
     * Create an instance of {@link GetAllOrdersByCustomerId }
     * 
     */
    public GetAllOrdersByCustomerId createGetAllOrdersByCustomerId() {
        return new GetAllOrdersByCustomerId();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrderByCustomerIdAndOrderIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "deleteOrderByCustomerIdAndOrderIdResponse")
    public JAXBElement<DeleteOrderByCustomerIdAndOrderIdResponse> createDeleteOrderByCustomerIdAndOrderIdResponse(DeleteOrderByCustomerIdAndOrderIdResponse value) {
        return new JAXBElement<DeleteOrderByCustomerIdAndOrderIdResponse>(_DeleteOrderByCustomerIdAndOrderIdResponse_QNAME, DeleteOrderByCustomerIdAndOrderIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "saveOrder")
    public JAXBElement<SaveOrder> createSaveOrder(SaveOrder value) {
        return new JAXBElement<SaveOrder>(_SaveOrder_QNAME, SaveOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderByCustomerIdAndOrderId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "getOrderByCustomerIdAndOrderId")
    public JAXBElement<GetOrderByCustomerIdAndOrderId> createGetOrderByCustomerIdAndOrderId(GetOrderByCustomerIdAndOrderId value) {
        return new JAXBElement<GetOrderByCustomerIdAndOrderId>(_GetOrderByCustomerIdAndOrderId_QNAME, GetOrderByCustomerIdAndOrderId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "getOrderById")
    public JAXBElement<GetOrderById> createGetOrderById(GetOrderById value) {
        return new JAXBElement<GetOrderById>(_GetOrderById_QNAME, GetOrderById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersByCustomerIdAndGoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "getAllOrdersByCustomerIdAndGoodResponse")
    public JAXBElement<GetAllOrdersByCustomerIdAndGoodResponse> createGetAllOrdersByCustomerIdAndGoodResponse(GetAllOrdersByCustomerIdAndGoodResponse value) {
        return new JAXBElement<GetAllOrdersByCustomerIdAndGoodResponse>(_GetAllOrdersByCustomerIdAndGoodResponse_QNAME, GetAllOrdersByCustomerIdAndGoodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersByCustomerIdAndGood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "getAllOrdersByCustomerIdAndGood")
    public JAXBElement<GetAllOrdersByCustomerIdAndGood> createGetAllOrdersByCustomerIdAndGood(GetAllOrdersByCustomerIdAndGood value) {
        return new JAXBElement<GetAllOrdersByCustomerIdAndGood>(_GetAllOrdersByCustomerIdAndGood_QNAME, GetAllOrdersByCustomerIdAndGood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersByGoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "getAllOrdersByGoodResponse")
    public JAXBElement<GetAllOrdersByGoodResponse> createGetAllOrdersByGoodResponse(GetAllOrdersByGoodResponse value) {
        return new JAXBElement<GetAllOrdersByGoodResponse>(_GetAllOrdersByGoodResponse_QNAME, GetAllOrdersByGoodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderByCustomerIdAndOrderIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "getOrderByCustomerIdAndOrderIdResponse")
    public JAXBElement<GetOrderByCustomerIdAndOrderIdResponse> createGetOrderByCustomerIdAndOrderIdResponse(GetOrderByCustomerIdAndOrderIdResponse value) {
        return new JAXBElement<GetOrderByCustomerIdAndOrderIdResponse>(_GetOrderByCustomerIdAndOrderIdResponse_QNAME, GetOrderByCustomerIdAndOrderIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "getAllOrders")
    public JAXBElement<GetAllOrders> createGetAllOrders(GetAllOrders value) {
        return new JAXBElement<GetAllOrders>(_GetAllOrders_QNAME, GetAllOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "saveOrderResponse")
    public JAXBElement<SaveOrderResponse> createSaveOrderResponse(SaveOrderResponse value) {
        return new JAXBElement<SaveOrderResponse>(_SaveOrderResponse_QNAME, SaveOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "getOrderByIdResponse")
    public JAXBElement<GetOrderByIdResponse> createGetOrderByIdResponse(GetOrderByIdResponse value) {
        return new JAXBElement<GetOrderByIdResponse>(_GetOrderByIdResponse_QNAME, GetOrderByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "getAllOrdersResponse")
    public JAXBElement<GetAllOrdersResponse> createGetAllOrdersResponse(GetAllOrdersResponse value) {
        return new JAXBElement<GetAllOrdersResponse>(_GetAllOrdersResponse_QNAME, GetAllOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersByCustomerId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "getAllOrdersByCustomerId")
    public JAXBElement<GetAllOrdersByCustomerId> createGetAllOrdersByCustomerId(GetAllOrdersByCustomerId value) {
        return new JAXBElement<GetAllOrdersByCustomerId>(_GetAllOrdersByCustomerId_QNAME, GetAllOrdersByCustomerId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersByCustomerIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "getAllOrdersByCustomerIdResponse")
    public JAXBElement<GetAllOrdersByCustomerIdResponse> createGetAllOrdersByCustomerIdResponse(GetAllOrdersByCustomerIdResponse value) {
        return new JAXBElement<GetAllOrdersByCustomerIdResponse>(_GetAllOrdersByCustomerIdResponse_QNAME, GetAllOrdersByCustomerIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrderByCustomerIdAndOrderId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "deleteOrderByCustomerIdAndOrderId")
    public JAXBElement<DeleteOrderByCustomerIdAndOrderId> createDeleteOrderByCustomerIdAndOrderId(DeleteOrderByCustomerIdAndOrderId value) {
        return new JAXBElement<DeleteOrderByCustomerIdAndOrderId>(_DeleteOrderByCustomerIdAndOrderId_QNAME, DeleteOrderByCustomerIdAndOrderId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersByGood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "getAllOrdersByGood")
    public JAXBElement<GetAllOrdersByGood> createGetAllOrdersByGood(GetAllOrdersByGood value) {
        return new JAXBElement<GetAllOrdersByGood>(_GetAllOrdersByGood_QNAME, GetAllOrdersByGood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sergei.org", name = "order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

}
