package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.CustomerDAO;
import com.niit.domain.Customer;
@Repository(value="customerdao")
public class CustomerDAOImpl implements CustomerDAO
{
	@Autowired
	SessionFactory sessionFactory;

	
	public void save(Customer c) 
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
		session.close();	
	}

	@Override
	public void delete(int id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();		
		session.delete(getCustomer(id));		
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void update(Customer c)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.update(c);
		session.getTransaction().commit();
		session.close();	
		
	}

	@Override
	public Customer getCustomer(int id) 
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Customer c=session.get(Customer.class,id);
		session.getTransaction().commit();
		session.close();
	
	return c;
	}

	@Override
	public List<Customer> customerlist() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<Customer> customerlist=session.createQuery("from Customer").getResultList();
		session.getTransaction().commit();
		session.close();
		return customerlist;
	}

}
