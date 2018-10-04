package com.niit.ProjectBackend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Config.SpringConfig;
import com.niit.DAO.CategoryDAO;
import com.niit.domain.Category;

public class CategoryApp {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		CategoryDAO cdao=(CategoryDAO)context.getBean("categoryDAO");
        /*Category c=new Category();
        c.setCategory("Womens Clothing");
        c.setDescription("Tops,Tshirts,Pants,Shoes etc");
       
        cdao.save(c);*/
		cdao.delete(44);
        System.out.println("deleted");
	}

}
