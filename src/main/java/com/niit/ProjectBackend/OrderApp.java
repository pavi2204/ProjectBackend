package com.niit.ProjectBackend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Config.SpringConfig;
import com.niit.DAO.OrderDAO;
import com.niit.domain.order;

public class OrderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
 OrderDAO odao=(OrderDAO)context.getBean("orderdao");
 order o=new order();
 o.setName("Iphone XS");
 o.setPrice(100000);
 odao.save(o);
 System.out.println("saved");
	}

}
