package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.SupplierDAO;
import com.niit.domain.Supplier;
@Repository(value="supplierdao")
public class SupplierDAOImpl implements SupplierDAO
{
	 @Autowired
     SessionFactory sessionFactory;
	@Override
	public void save(Supplier s) {
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	session.save(s);
	session.getTransaction().commit();
	session.close();
	}

	@Override
	public void delete(int id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.delete(getsupplier(id));
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void update(Supplier s) {
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	session.update(s);
	session.getTransaction().commit();
	session.close();
	}

	@Override
	public List<Supplier> supplierlist() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<Supplier> supplierlist=session.createQuery("from Supplier").getResultList();
		session.getTransaction().commit();
		session.close();
		return supplierlist;
	}

	@Override
	public Supplier getsupplier(int id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Supplier s=session.get(Supplier.class, id);
		session.getTransaction().commit();
		session.close();
		return s;
	}

}
