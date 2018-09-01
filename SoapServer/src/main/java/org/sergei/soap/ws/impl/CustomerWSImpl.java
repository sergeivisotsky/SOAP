package org.sergei.soap.ws.impl;

import org.sergei.soap.model.Customer;
import org.sergei.soap.service.CustomerService;
import org.sergei.soap.ws.CustomerWS;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@Component
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
        Customer customer = new Customer();

        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setAge(age);

        customerService.saveCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        return customerService.getCustomerById(customerId);
    }

    @Override
    public void deleteCustomer(Long customerId) {
        customerService.deleteCustomer(customerId);
    }
}
