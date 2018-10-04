package com.niit.ProjectBackend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Config.SpringConfig;
import com.niit.DAO.CustomerDAO;
import com.niit.domain.Customer;


public class CustomerApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        CustomerDAO cdao=(CustomerDAO)context.getBean("customerdao");
        Customer c=new Customer();
        c.setName("Sharan Krishna");
        c.setEmail("moosharan@gmail.com");
        c.setMobilenumber("9087128744");
        c.setUsername("cowboy");
        c.setPassword("shirley");
        cdao.save(c);
        System.out.println("New User saved...");
    }
}
