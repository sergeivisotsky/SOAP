package org.sergei.soap.dao.impl;

import org.sergei.soap.dao.repos.OrderDAO;
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
public class OrderDAOImpl implements OrderDAO {

    private static final String SQL_FIND_ALL = "SELECT * FROM orders";
    private static final String SQL_FIND_BY_ID = "SELECT * FROM orders WHERE order_id = ?";
    private static final String SQL_FIND_BY_CUSTOMER_ID_AND_GOOD = "SELECT * FROM orders WHERE customer_id = ? AND good = ?";
    private static final String SQL_FIND_BY_CUSTOMER_ID_AND_ORDER_ID = "SELECT * FROM orders WHERE customer_id = ? AND order_id = ?";
    private static final String SQL_FIND_BY_GOOD = "SELECT * FROM orders WHERE good = ?";
    private static final String SQL_EXISTS_BY_ORDER_ID = "SELECT count(*) FROM orders WHERE order_id = ?";
    private static final String SQL_EXISTS_BY_GOOD = "SELECT count(*) FROM orders WHERE good = ?";
    private static final String SQL_EXISTS_BY_CUSTOMER_ID = "SELECT count(*) FROM orders WHERE customer_id = ?";
    private static final String SQL_FIND_ALL_BY_CUSTOMER_ID = "SELECT * FROM orders WHERE customer_id = ?";

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Order> findAll() {
        try {
            return jdbcTemplate.query(SQL_FIND_ALL, new OrderRowMapper());
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Order findById(Long id) {
        try {
            return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new OrderRowMapper(), id);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Order findByCustomerIdAndOrderId(Long customerId, Long orderId) {
        try {
            return jdbcTemplate.queryForObject(SQL_FIND_BY_CUSTOMER_ID_AND_ORDER_ID,
                    new OrderRowMapper(), customerId, orderId);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Order> findAllByCustomerIdAndGood(Long customerId, String good) {
        try {
            return jdbcTemplate.query(SQL_FIND_BY_CUSTOMER_ID_AND_GOOD, new OrderRowMapper(), customerId, good);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Order> findAllByGood(String good) {
        try {
            return jdbcTemplate.query(SQL_FIND_BY_GOOD, new OrderRowMapper(), good);
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean existsById(Long orderId) {
        int count = jdbcTemplate.queryForObject(SQL_EXISTS_BY_ORDER_ID, new Object[]{orderId}, Integer.class);
        return count > 0;
    }

    @Override
    public boolean existsByGood(String good) {
        int count = jdbcTemplate.queryForObject(SQL_EXISTS_BY_GOOD, new Object[]{good}, Integer.class);
        return count > 0;
    }

    @Override
    public boolean existsByCustomerId(Long customerId) {
        int count = jdbcTemplate.queryForObject(SQL_EXISTS_BY_CUSTOMER_ID, new Object[]{customerId}, Integer.class);
        return count > 0;
    }

    @Override
    public List<Order> findAllByCustomerId(Long id) {
        return jdbcTemplate.query(SQL_FIND_ALL_BY_CUSTOMER_ID, new OrderRowMapper(), id);
    }

    private static final class OrderRowMapper implements RowMapper<Order> {

        @Override
        public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
            Order order = new Order();

            order.setOrderId(rs.getLong("order_id"));
            order.setCustomerId(rs.getLong("customer_id"));
            order.setTransId(rs.getLong("trans_id"));
            order.setGood(rs.getString("good"));
            order.setGoodWeight(rs.getDouble("good_weight"));
            order.setPrice(rs.getDouble("price"));

            return order;
        }
    }
}
