package org.sergei.soap.service;

import org.sergei.soap.dao.CustomerDAO;
import org.sergei.soap.dto.CustomerDTO;
import org.sergei.soap.model.Customer;
import org.sergei.soap.utils.ObjectMapperUtils;

import java.util.List;

public class CustomerService {

    private CustomerDAO customerDAO = new CustomerDAO();

    public List<CustomerDTO> getAllCustomers() {
//        return customerDAO.findAll();
        List<Customer> customerList = customerDAO.findAll();
        List<CustomerDTO> customerDTOList = ObjectMapperUtils.mapAll(customerList, CustomerDTO.class);
        return customerDTOList;
    }

    public void saveCustomer(CustomerDTO customerDTO) {
//        customerDAO.saveCustomer(customerDTO);
    }

    public CustomerDTO getCustomerById(Long customerId) {
//        return customerDAO.findById(customerId);
        return null;
    }

    public void deleteCustomer(Long id) {
//        customerDAO.delete(customerDTO);
    }
}
