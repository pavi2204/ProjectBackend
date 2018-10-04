package com.niit.DAO;

import java.util.List;

import com.niit.domain.Cart;
import com.niit.domain.Product;

public interface CartDAO {
void save(Cart cart);
void delete(int id);
List<Cart> cartlist();
public Cart getCart(int id);
}
