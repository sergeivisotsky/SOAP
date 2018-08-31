package org.sergei.client.service;

import org.junit.jupiter.api.Test;
import org.sergei.soap.ws.impl.Customer;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

class CustomerClientServiceTest {
    @Test
    void connectionTest() throws MalformedURLException {
        URL wsdlUrl = new URL("http://localhost:8080/soap/ws/v1/CustomerService?wsdl");
        QName qname = new QName("http://impl.ws.soap.sergei.org/", "CustomerService");
        Service service = Service.create(wsdlUrl, qname);
        Customer customer = service.getPort(Customer.class);

        System.out.println(customer.getCustomerById((long) 1).getFirstName());
    }
}