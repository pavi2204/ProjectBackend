package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.DAO.OrderDAO;
import com.niit.domain.Product;
import com.niit.domain.order;

public class OrderDAOImpl implements OrderDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(order o) 
	{
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	session.save(o);
	session.getTransaction().commit();
	session.close();
		
	}

	@Override
	public void delete(int id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.delete(getorder(id));
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void update(order o) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.update(o);
		session.getTransaction().commit();
		session.close();	
	}


	@Override
	public List<order> orderlist() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<order> orderList=session.createQuery("from order").getResultList();
		session.getTransaction().commit();
		session.close();
		return orderList;
	}

	@Override
	public order getorder(int id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		order o=session.get(order.class, id);
		session.getTransaction().commit();
		session.close();
		return null;
	}

}
