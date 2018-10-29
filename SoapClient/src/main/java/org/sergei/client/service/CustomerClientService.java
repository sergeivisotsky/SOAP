/*
 * Copyright (c) Sergei Visotsky, 2018
 */

package org.sergei.client.service;

import org.sergei.soap.ws.impl.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Component
public class CustomerClientService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Customer customer;

    public CustomerClientService() {
        try {
            URL wsdlUrl = new URL("http://localhost:8080/soap/ws/v1/CustomerService?wsdl");
            QName qname = new QName("http://impl.ws.soap.sergei.org/", "CustomerService");
            Service service = Service.create(wsdlUrl, qname);
            customer = service.getPort(Customer.class);
        } catch (MalformedURLException e) {
            logger.error(e.getMessage());
        }
    }

    public List<org.sergei.soap.Customer> getAllCustomers() {
        return customer.getAllCustomers();
    }

    public org.sergei.soap.Customer getCustomerById(Long id) {
        return customer.getCustomerById(id);
    }
}
