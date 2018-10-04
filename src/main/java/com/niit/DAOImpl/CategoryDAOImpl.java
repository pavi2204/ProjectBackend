package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.CategoryDAO;
import com.niit.domain.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO
{
	@Autowired
     SessionFactory sessionFactory;
	@Override
	public void save(Category c) {
		Session session=sessionFactory.openSession();
		try {
		session.beginTransaction();
		
		session.save(c);
		session.getTransaction().commit();
		session.close();
	}catch(Exception e) {
		e.printStackTrace();
	}}

	@Override
	public void delete(int id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();		
		session.delete(getcategory(id));		
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void update(Category c) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.update(c);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public List<Category> categorylist() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<Category> categorylist=session.createQuery("from Category").getResultList();
		session.getTransaction().commit();
		session.close();
		return categorylist;
		
	}

	@Override
	public Category getcategory(int id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Category c=session.get(Category.class, id);
		session.getTransaction().commit();
		session.close();
		return c;
	}

}
