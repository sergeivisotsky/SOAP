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

package org.sergei.soap.ws.impl;

import org.sergei.soap.dto.CustomerDTO;
import org.sergei.soap.service.CustomerService;
import org.sergei.soap.ws.CustomerWS;

import javax.jws.WebService;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
@WebService(endpointInterface = "org.sergei.soap.ws.CustomerWS",
        serviceName = "CustomerService", portName = "Customer")
public class CustomerWSImpl implements CustomerWS {

    private CustomerService customerService = new CustomerService();

    @Override
    public void saveCustomer(String firstName, String lastName, Integer age) {
        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setFirstName(firstName);
        customerDTO.setLastName(lastName);
        customerDTO.setAge(age);

        customerService.saveCustomer(customerDTO);
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @Override
    public CustomerDTO getCustomerById(Long customerId) {
        return customerService.getCustomerById(customerId);
    }

    @Override
    public void deleteCustomer(Long customerId) {
        customerService.deleteCustomer(customerId);
    }
}