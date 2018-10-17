package org.sergei.soap.service;

import org.modelmapper.ModelMapper;
import org.sergei.soap.dao.CustomerDAO;
import org.sergei.soap.dto.CustomerDTO;
import org.sergei.soap.model.Customer;
import org.sergei.soap.utils.ObjectMapperUtils;

import java.util.List;

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