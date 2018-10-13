package org.sergei.soap.dao;

import org.sergei.soap.dto.OrderDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class OrderDAO {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void saveOrder(OrderDTO orderDTO) {

    }

    public List<OrderDTO> findAll() {
        return null;
    }

    public OrderDTO findById(Long id) {
        return null;
    }

    public OrderDTO findByCustomerIdAndOrderId(Long customerId, Long orderId) {
        return null;
    }

    public List<OrderDTO> findAllByCustomerIdAndProduct(Long customerId, String product) {
        return null;
    }

    public List<OrderDTO> findAllByProduct(String product) {
        return null;
    }

    public List<OrderDTO> findAllByCustomerId(Long id) {
        return null;
    }

    public void delete(OrderDTO orderDTO) {

    }

}
