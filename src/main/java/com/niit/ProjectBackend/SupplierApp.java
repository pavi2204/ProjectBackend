package com.niit.ProjectBackend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Config.SpringConfig;
import com.niit.DAO.SupplierDAO;
import com.niit.domain.Supplier;


public class SupplierApp {

	public static void main(String[] args) 
	{
         ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
         SupplierDAO sdao=(SupplierDAO)context.getBean("supplierdao");
         Supplier s=new Supplier();
         s.setSuppliername("Khadims");
         s.setAddress("Nagarbhavi");
         sdao.save(s);
         System.out.println("saved..");
	}

}
