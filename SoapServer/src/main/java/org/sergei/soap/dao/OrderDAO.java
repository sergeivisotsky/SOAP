package org.sergei.soap.dao;

import org.sergei.soap.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class OrderDAO {

    private static final String SQL_FIND_ALL = "SELECT * FROM orders";
    private static final String SQL_FIND_BY_ID = "SELECT * FROM orders WHERE order_id = ?";
    private static final String SQL_FIND_BY_CUSTOMER_ID_AND_PRODUCT = "SELECT * FROM orders WHERE customer_id = ? AND product = ?";
    private static final String SQL_FIND_BY_CUSTOMER_ID_AND_ORDER_ID = "SELECT * FROM orders WHERE customer_id = ? AND order_id = ?";
    private static final String SQL_FIND_BY_PRODUCT = "SELECT * FROM orders WHERE product = ?";
    private static final String SQL_EXISTS_BY_ORDER_ID = "SELECT count(*) FROM orders WHERE order_id = ?";
    private static final String SQL_EXISTS_BY_PRODUCT = "SELECT count(*) FROM orders WHERE product = ?";
    private static final String SQL_EXISTS_BY_CUSTOMER_ID = "SELECT count(*) FROM orders WHERE customer_id = ?";
    private static final String SQL_FIND_ALL_BY_CUSTOMER_ID = "SELECT * FROM orders WHERE customer_id = ?";
    private static final String SQL_SAVE_ORDER = "INSERT INTO orders(customer_id, trans_id, product, product_weight, price) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_DELETE_BY_CUSTOMER_ID_PRODUCT_ID = "DELETE FROM orders WHERE customer_id = ? AND order_id = ?";

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveOrder(Order order) {
        try {
            jdbcTemplate.update(SQL_SAVE_ORDER, order.getCustomerId(), order.getTransId(),
                    order.getProduct(), order.getProductWeight(), order.getPrice());
            logger.info("Order entity saved");
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
        }
    }

    public List<Order> findAll() {
        try {
            return jdbcTemplate.query(SQL_FIND_ALL, new OrderRowMapper());
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    public Order findById(Long id) {
        try {
            return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new OrderRowMapper(), id);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    public Order findByCustomerIdAndOrderId(Long customerId, Long orderId) {
        try {
            return jdbcTemplate.queryForObject(SQL_FIND_BY_CUSTOMER_ID_AND_ORDER_ID,
                    new OrderRowMapper(), customerId, orderId);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    public List<Order> findAllByCustomerIdAndProduct(Long customerId, String product) {
        try {
            return jdbcTemplate.query(SQL_FIND_BY_CUSTOMER_ID_AND_PRODUCT, new OrderRowMapper(), customerId, product);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    public List<Order> findAllByProduct(String product) {
        try {
            return jdbcTemplate.query(SQL_FIND_BY_PRODUCT, new OrderRowMapper(), product);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    public boolean existsById(Long orderId) {
        int count = jdbcTemplate.queryForObject(SQL_EXISTS_BY_ORDER_ID, new Object[]{orderId}, Integer.class);
        return count > 0;
    }

    public boolean existsByProduct(String product) {
        int count = jdbcTemplate.queryForObject(SQL_EXISTS_BY_PRODUCT, new Object[]{product}, Integer.class);
        return count > 0;
    }

    public boolean existsByCustomerId(Long customerId) {
        int count = jdbcTemplate.queryForObject(SQL_EXISTS_BY_CUSTOMER_ID, new Object[]{customerId}, Integer.class);
        return count > 0;
    }

    public List<Order> findAllByCustomerId(Long id) {
        try {
            return jdbcTemplate.query(SQL_FIND_ALL_BY_CUSTOMER_ID, new OrderRowMapper(), id);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    public void delete(Order order) {
        try {
            jdbcTemplate.update(SQL_DELETE_BY_CUSTOMER_ID_PRODUCT_ID, order.getCustomerId(), order.getOrderId());
            logger.info("Order entity deleted");
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
        }
    }

    private static final class OrderRowMapper implements RowMapper<Order> {

        @Override
        public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
            Order order = new Order();

            order.setOrderId(rs.getLong("order_id"));
            order.setCustomerId(rs.getLong("customer_id"));
            order.setTransId(rs.getLong("trans_id"));
            order.setProduct(rs.getString("product"));
            order.setProductWeight(rs.getDouble("product_weight"));
            order.setPrice(rs.getDouble("price"));

            return order;
        }
    }
}
