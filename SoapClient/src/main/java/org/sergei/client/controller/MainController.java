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

package org.sergei.client.controller;

import org.sergei.client.service.CustomerClientService;
import org.sergei.client.service.OrderClientService;
import org.sergei.soap.CustomerDTO;
import org.sergei.soap.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Sergei Visotsky
 */
@Controller
public class MainController {

    private final CustomerClientService customerClientService;
    private final OrderClientService orderClientService;

    @Autowired
    public MainController(CustomerClientService customerClientService, OrderClientService orderClientService) {
        this.customerClientService = customerClientService;
        this.orderClientService = orderClientService;
    }

    @GetMapping
    public String welcome(Model model) {
        Long customerId = 1L;
        CustomerDTO customer = customerClientService.getCustomerById(customerId);
        model.addAttribute("customerId", customer.getCustomerId());
        model.addAttribute("firstName", customer.getFirstName());
        model.addAttribute("lastName", customer.getLastName());
        model.addAttribute("age", customer.getAge());

        List<OrderDTO> orders = orderClientService.getAllOrdersByCustomerId(customerId);
        model.addAttribute("orders", orders);
        return "index";
    }
}
