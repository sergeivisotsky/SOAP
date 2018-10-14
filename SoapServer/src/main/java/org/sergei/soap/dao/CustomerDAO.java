package org.sergei.soap.dao;

import org.sergei.soap.model.Customer;

import javax.ejb.Stateless;

@Stateless
@SuppressWarnings("unchecked")
public class CustomerDAO extends GenericHibernateDAO<Customer> {
    public CustomerDAO() {
        setPersistentClass(Customer.class);
    }
}
