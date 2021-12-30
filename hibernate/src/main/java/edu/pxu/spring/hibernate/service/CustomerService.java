package edu.pxu.spring.hibernate.service;

import java.util.List;

import edu.pxu.spring.hibernate.entity.Customer;
public interface CustomerService {
	public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}
