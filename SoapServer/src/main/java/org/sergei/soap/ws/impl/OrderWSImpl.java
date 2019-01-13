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

package org.sergei.soap.ws.impl;

import org.sergei.soap.dto.OrderDTO;
import org.sergei.soap.service.OrderService;
import org.sergei.soap.ws.OrderWS;

import javax.jws.WebService;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
@WebService(endpointInterface = "org.sergei.soap.ws.OrderWS",
        serviceName = "OrderService", portName = "Order")
public class OrderWSImpl implements OrderWS {

    private OrderService orderService = new OrderService();

    @Override
    public void saveOrder(Long customerId, Long transId,
                          String product, Double productWeight, Double price) {
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setCustomerId(customerId);
        orderDTO.setTransId(transId);
        orderDTO.setProduct(product);
        orderDTO.setProductWeight(productWeight);
        orderDTO.setPrice(price);

        orderService.saveOrder(orderDTO);
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return orderService.getAllOrders();
    }

    @Override
    public List<OrderDTO> getAllOrdersByCustomerId(Long customerId) {
        return orderService.getAllOrdersByCustomerId(customerId);
    }

    @Override
    public List<OrderDTO> getAllOrdersByCustomerIdAndProduct(Long customerId, String product) {
        return orderService.getAllOrdersByCustomerIdAndProduct(customerId, product);
    }

    @Override
    public OrderDTO getOrderById(Long orderId) {
        return orderService.getOrderById(orderId);
    }

    @Override
    public OrderDTO getOrderByCustomerIdAndOrderId(Long customerId, Long orderId) {
        return orderService.getOrderByCustomerIdAndOrderId(customerId, orderId);
    }

    @Override
    public List<OrderDTO> getAllOrdersByProduct(String product) {
        return orderService.getAllByProduct(product);
    }

    @Override
    public void deleteOrderByCustomerIdAndOrderId(Long customerId, Long orderId) {
        orderService.deleteOrder(customerId, orderId);
    }
}