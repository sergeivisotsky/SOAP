package org.sergei.soap.persistence.service.repos;

import org.sergei.soap.persistence.pojo.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer getCustomerById(Long id);

//    void saveCustomer(Customer customer);
}
