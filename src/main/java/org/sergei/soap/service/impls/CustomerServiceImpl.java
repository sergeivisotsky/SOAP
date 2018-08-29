package org.sergei.soap.service.impls;

import org.sergei.soap.exceptions.RecordNotFoundException;
import org.sergei.soap.dao.repos.CustomerDAO;
import org.sergei.soap.model.Customer;
import org.sergei.soap.service.repos.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public List<Customer> getAllCustomers() {
        return customerDAO.findAll();
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        if (!customerDAO.existsById(customerId)) {
            throw new RecordNotFoundException("No record with this parameters found");
        }

        return customerDAO.findById(customerId);
    }

    /*@Override
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);
    }*/
}
