package org.sergei.soap.dao;

import org.sergei.soap.dto.CustomerDTO;
import org.sergei.soap.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CustomerDAO extends GenericHibernateDAO<Customer> {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void saveCustomer(CustomerDTO customerDTO) {

    }

    /*public List<CustomerDTO> findAll() {
        return null;
    }*/

    public CustomerDTO findById(Long id) {
        return null;
    }

    public void delete(CustomerDTO customerDTO) {

    }
}
