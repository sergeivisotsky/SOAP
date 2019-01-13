/*
 * Copyright 2018-2019 the original author.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sergei.soap.ws;

import org.sergei.soap.dto.CustomerDTO;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
@WebService(name = "Customer", serviceName = "CustomerService", targetNamespace = "http://soap.sergei.org")
public interface CustomerWS {
    @WebMethod(action = "addCustomer")
    @WebResult(name = "saveCustomer")
    void saveCustomer(@WebParam(name = "firstName") String firstName,
                      @WebParam(name = "lastName") String lastName,
                      @WebParam(name = "age") Integer age);

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
