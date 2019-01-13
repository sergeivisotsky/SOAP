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

package org.sergei.soap.service;

import org.modelmapper.ModelMapper;
import org.sergei.soap.dao.CustomerDAO;
import org.sergei.soap.dto.CustomerDTO;
import org.sergei.soap.model.Customer;
import org.sergei.soap.utils.ObjectMapperUtils;

import java.util.List;

/**
 * @author Sergei Visotsky
 */
public class CustomerService {

    private CustomerDAO customerDAO = new CustomerDAO();
    private ModelMapper modelMapper = new ModelMapper();

    public CustomerDTO getCustomerById(Long customerId) {
        Customer customer = customerDAO.findOne(customerId);
        return modelMapper.map(customer, CustomerDTO.class);
    }

    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customerList = customerDAO.findAll();
        return ObjectMapperUtils.mapAll(customerList, CustomerDTO.class);
    }

    public void saveCustomer(CustomerDTO customerDTO) {
        Customer customer = modelMapper.map(customerDTO, Customer.class);
        customerDAO.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        Customer customer = customerDAO.findOne(customerId);
        customerDAO.delete(customer);
    }
}