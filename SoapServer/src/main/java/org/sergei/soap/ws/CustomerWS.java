package org.sergei.soap.ws;

import org.sergei.soap.model.Customer;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@Component
@WebService(name = "Customer", targetNamespace = "http://soap.sergei.org")
public interface CustomerWS {
    @WebMethod(action = "addCustomer")
    @WebResult(name = "saveCustomer")
    void saveCustomer(@WebParam(name = "firstName") String firstName,
                      @WebParam(name = "lastName") String lastName,
                      @WebParam(name = "age") int age);

    @WebMethod(action = "getAllCustomers")
    @WebResult(name = "outputAllCustomers")
    List<Customer> getAllCustomers();

    @WebMethod(action = "getCustomerById")
    @WebResult(name = "outputCustomer")
    Customer getCustomerById(@WebParam(name = "inputCustomerId") Long customerId);

    @WebMethod(action = "deleteCustomerById")
    @WebResult(name = "deleteCustomerData")
    void deleteCustomer(@WebParam(name = "inputCustomerId") Long customerId);
}
