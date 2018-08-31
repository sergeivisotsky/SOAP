package org.sergei.client.controller;

import org.sergei.client.service.CustomerClientService;
import org.sergei.soap.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerClientService customerClientService;

    @GetMapping
    public String welcome(Model model) {
        Long customerId = 1L;
        Customer customer = customerClientService.getCustomerById(customerId);
        model.addAttribute("firstName", customer.getFirstName());
        model.addAttribute("lastName", customer.getLastName());
        model.addAttribute("age", customer.getAge());
        return "index";
    }
}
