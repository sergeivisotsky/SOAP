package org.sergei.soap.ws.impl;

import org.sergei.soap.dto.CustomerDTO;
import org.sergei.soap.service.CustomerService;
import org.sergei.soap.ws.CustomerWS;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "org.sergei.soap.ws.CustomerWS",
        serviceName = "CustomerService", portName = "Customer")
public class CustomerWSImpl implements CustomerWS {

    private CustomerService customerService;

    @WebMethod(exclude = true)
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void saveCustomer(String firstName, String lastName, int age) {
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
