package com.niit.DAO;

import java.util.List;

import com.niit.domain.Product;

public interface ProductDAO 
{
void save(Product p);
void delete(int id);
void update(Product p);
List<Product> productlist();
public Product getProduct(int id);
}
