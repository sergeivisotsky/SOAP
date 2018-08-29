package org.sergei.soap.dao.repos;

import org.sergei.soap.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO {
    List<Customer> findAll();

    Customer findById(Long id);

    boolean existsById(Long customerId);

//    void saveCustomer(Customer customer);
}
