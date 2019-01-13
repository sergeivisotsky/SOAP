/*
 * Copyright 2018-2019 the original author.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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

/**
 * @author Sergei Visotsky
 */
@Component
public class CustomerClientService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerClientService.class);

    private Customer customer;

    public CustomerClientService() {
        try {
            URL wsdlUrl = new URL("http://localhost:8079/soap/ws/v1/CustomerService?wsdl");
            QName qname = new QName("http://impl.ws.soap.sergei.org/", "CustomerService");
            Service service = Service.create(wsdlUrl, qname);
            customer = service.getPort(Customer.class);
        } catch (MalformedURLException e) {
            LOGGER.error(e.getMessage());
        }
    }

    public List<org.sergei.soap.CustomerDTO> getAllCustomers() {
        return customer.getAllCustomers();
    }

    public org.sergei.soap.CustomerDTO getCustomerById(Long id) {
        return customer.getCustomerById(id);
    }
}
