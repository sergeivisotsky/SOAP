package org.sergei.client.service;

import org.junit.jupiter.api.Test;
import org.sergei.soap.ws.impl.Order;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

class OrderClientServiceTest {
    @Test
    void connectionTest() throws MalformedURLException {
        URL wsdlUrl = new URL("http://localhost:8080/soap/ws/v1/OrderService?wsdl");
        QName qname = new QName("http://impl.ws.soap.sergei.org/", "OrderService");
        Service service = Service.create(wsdlUrl, qname);
        Order order = service.getPort(Order.class);

        System.out.println(Arrays.toString(order.getAllOrdersByCustomerId((long) 1).toArray()));
    }

}