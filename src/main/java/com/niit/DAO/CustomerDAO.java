package com.niit.DAO;

import java.util.List;

import com.niit.domain.Customer;

public interface CustomerDAO
{
void save(Customer c);
void delete(int id);
void update(Customer c);
public Customer getCustomer(int id);
List<Customer> customerlist();
}
