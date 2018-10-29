/*
 * Copyright (c) 2018 Sergei Visotsky
 */

package org.sergei.soap.dao;

import org.sergei.soap.model.Customer;

@SuppressWarnings("unchecked")
public class CustomerDAO extends GenericHibernateDAO<Customer> {
    public CustomerDAO() {
        setPersistentClass(Customer.class);
    }
}
