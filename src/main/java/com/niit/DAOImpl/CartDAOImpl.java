package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.CartDAO;
import com.niit.domain.Cart;
import com.niit.domain.Product;

@Repository(value="cartdao")

public class CartDAOImpl implements CartDAO{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(Cart cart) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(cart);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void delete(int id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.delete(getCart(id));
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Cart> cartlist() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<Cart> cartlist=session.createQuery("from Cart").getResultList();
		session.getTransaction().commit();
		session.close();
		return cartlist;
	}

	@Override
	public Cart getCart(int id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Cart ca=session.get(Cart.class, id);
		session.getTransaction().commit();
		session.close();
		return ca;
		
	}

}
