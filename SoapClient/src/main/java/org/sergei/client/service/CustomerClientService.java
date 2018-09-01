package org.sergei.client.service;

import org.sergei.soap.ws.impl.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class CustomerClientService {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    private Customer customer;

    public CustomerClientService() {
        try {
            URL wsdlUrl = new URL("http://localhost:8080/soap/ws/v1/CustomerService?wsdl");
            QName qname = new QName("http://impl.ws.soap.sergei.org/", "CustomerService");
            javax.xml.ws.Service service = javax.xml.ws.Service.create(wsdlUrl, qname);
            customer = service.getPort(Customer.class);
        } catch (MalformedURLException e) {
            LOGGER.error(e.getMessage());
        }
    }

    public org.sergei.soap.Customer getCustomerById(Long id) {
        return customer.getCustomerById(id);
    }

}