package org.sergei.client.service;

import org.sergei.soap.ws.impl.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Component
public class OrderClientService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Order order;

    public OrderClientService() {
        try {
            URL wsdlUrl = new URL("http://localhost:8080/soap/ws/v1/OrderService?wsdl");
            QName qname = new QName("http://impl.ws.soap.sergei.org/", "OrderService");
            Service service = Service.create(wsdlUrl, qname);
            order = service.getPort(Order.class);
        } catch (MalformedURLException e) {
            logger.error(e.getMessage());
        }
    }

    public List<org.sergei.soap.Order> getAllOrdersByCustomerId(Long customerId) {
        return order.getAllOrdersByCustomerId(customerId);
    }
}
