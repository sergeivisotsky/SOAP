package org.sergei.client.controller;

import org.sergei.client.service.CustomerClientService;
import org.sergei.client.service.OrderClientService;
import org.sergei.soap.Customer;
import org.sergei.soap.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private CustomerClientService customerClientService;

    @Autowired
    private OrderClientService orderClientService;

    @GetMapping
    public String welcome(Model model) {
        Long customerId = 5L;
        Customer customer = customerClientService.getCustomerById(customerId);
        model.addAttribute("customerId", customer.getCustomerId());
        model.addAttribute("firstName", customer.getFirstName());
        model.addAttribute("lastName", customer.getLastName());
        model.addAttribute("age", customer.getAge());

        List<Order> orders  = orderClientService.getAllOrdersByCustomerId(customerId);
        model.addAttribute("orders", orders);
        return "index";
    }
}
