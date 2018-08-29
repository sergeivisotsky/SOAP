package org.sergei.soap.persistence.dao.repos;

import org.sergei.soap.persistence.pojo.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO {
    List<Customer> findAll();

    Customer findById(Long id);

    boolean existsById(Long customerId);
}
