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
