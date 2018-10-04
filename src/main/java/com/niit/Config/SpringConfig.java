package com.niit.Config;



import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import com.niit.domain.Cart;
import com.niit.domain.Category;
import com.niit.domain.Customer;

import com.niit.domain.Product;
import com.niit.domain.Supplier;
import com.niit.domain.order;


@Configuration
@ComponentScan("com.niit")
public class SpringConfig 
{
	@Bean
	public DataSource getdataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/Information");
		dataSource.setUsername("root");
		dataSource.setPassword("pavan2204");
		return dataSource;
	}
	
	@Bean
	public SessionFactory sessionFactory()
	{
		LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(getdataSource());
		Properties p=new Properties();
		p.put("hibernate.show_sql","true");
	    p.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
	    
	    p.put("hibernate.hbm2ddl.auto", "update");
	    builder.addProperties(p);
	    builder.addAnnotatedClass(Customer.class);
	    builder.addAnnotatedClass(Product.class);
	    builder.addAnnotatedClass(Category.class);
	    builder.addAnnotatedClass(Supplier.class);
	    builder.addAnnotatedClass(order.class);
	    builder.addAnnotatedClass(Cart.class);
	    
		return builder.buildSessionFactory();
		
	}
}
