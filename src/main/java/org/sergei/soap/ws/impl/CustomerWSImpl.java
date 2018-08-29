package org.sergei.soap.ws.impl;

import org.sergei.soap.persistence.pojo.Customer;
import org.sergei.soap.persistence.service.repos.CustomerService;
import org.sergei.soap.ws.endpoint.CustomerWS;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@Component
@WebService(endpointInterface = "org.sergei.soap.ws.endpoint.CustomerWS",
        serviceName = "CustomerService", portName = "Customer")
public class CustomerWSImpl implements CustomerWS {

    private CustomerService customerService;

    @WebMethod(exclude = true)
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        return customerService.getCustomerById(customerId);
    }

    /*@Override
    public void saveCustomer(Customer customer) {
        customerService.saveCustomer(customer);
    }*/
}
