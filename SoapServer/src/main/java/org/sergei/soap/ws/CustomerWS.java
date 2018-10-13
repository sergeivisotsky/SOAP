package org.sergei.soap.ws;

import org.sergei.soap.dto.CustomerDTO;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(name = "Customer", serviceName = "CustomerService", targetNamespace = "http://soap.sergei.org")
public interface CustomerWS {
    @WebMethod(action = "addCustomer")
    @WebResult(name = "saveCustomer")
    void saveCustomer(@WebParam(name = "firstName") String firstName,
                      @WebParam(name = "lastName") String lastName,
                      @WebParam(name = "age") int age);

    @WebMethod(action = "getAllCustomers")
    @WebResult(name = "outputAllCustomers")
    List<CustomerDTO> getAllCustomers();

    @WebMethod(action = "getCustomerById")
    @WebResult(name = "outputCustomer")
    CustomerDTO getCustomerById(@WebParam(name = "inputCustomerId") Long customerId);

    @WebMethod(action = "deleteCustomerById")
    @WebResult(name = "deleteCustomerData")
    void deleteCustomer(@WebParam(name = "inputCustomerId") Long customerId);
}
