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

package org.sergei.client.service;

import org.junit.jupiter.api.Test;
import org.sergei.soap.ws.impl.Order;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

class OrderClientServiceTest {
    @Test
    void connectionTest() throws MalformedURLException {
        URL wsdlUrl = new URL("http://localhost:8080/soap/ws/v1/OrderService?wsdl");
        QName qname = new QName("http://impl.ws.soap.sergei.org/", "OrderService");
        Service service = Service.create(wsdlUrl, qname);
        Order order = service.getPort(Order.class);

        System.out.println(Arrays.toString(order.getAllOrdersByCustomerId((long) 1).toArray()));
    }

}