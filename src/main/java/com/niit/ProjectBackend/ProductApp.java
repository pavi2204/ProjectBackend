package com.niit.ProjectBackend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Config.SpringConfig;
import com.niit.DAO.ProductDAO;
import com.niit.domain.Category;
import com.niit.domain.Product;

public class ProductApp 
{

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		ProductDAO pdao=(ProductDAO)context.getBean("productdao");
		Product p=new Product();
		Category c=new Category();
		p.setProductname("Toys");
		p.setCompany("All");
		p.setPrice(500);
		c.setId(18);
		p.setCategory(c);
		pdao.save(p);
		//pdao.delete(24);
                
        System.out.println("saved");
	}

}
