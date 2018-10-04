package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.ProductDAO;
import com.niit.domain.Product;
@Repository(value="productdao")
public class ProductDAOImpl implements ProductDAO 
{
   @Autowired
	SessionFactory sessionFactory;
    
	@Override
	public void save(Product p) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void delete(int id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.delete(getProduct(id));
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void update(Product p) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();
		session.close();	
		
	}

	@Override
	public List<Product> productlist() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<Product> productlist=session.createQuery("from Product").getResultList();
		session.getTransaction().commit();
		session.close();
		return productlist;
	}

	@Override
	public Product getProduct(int id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Product p=session.get(Product.class, id);
		session.getTransaction().commit();
		session.close();
		return p;
	}

}
