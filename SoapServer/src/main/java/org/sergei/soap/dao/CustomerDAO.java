package org.sergei.soap.dao;

import org.sergei.soap.model.Customer;

/**
 * @author Sergei Visotsky, 2018
 */
@SuppressWarnings("unchecked")
public class CustomerDAO extends GenericHibernateDAO<Customer> {
    public CustomerDAO() {
        setPersistentClass(Customer.class);
    }
}
