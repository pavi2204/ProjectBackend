package com.niit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart
{
@Id
@GeneratedValue
private int cartid;
private int productid;
private String email;
@Column(name="cartPrice")
private Double cartPrice;
@Column(name="cartQuantity")
private int cartQuantity;
private String cartImage;
private String cartProductName;
public int getCartid() {
	return cartid;
}
public void setCartid(int cartid) {
	this.cartid = cartid;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Double getCartPrice() {
	return cartPrice;
}
public void setCartPrice(Double cartPrice) {
	this.cartPrice = cartPrice;
}
public int getCartQuantity() {
	return cartQuantity;
}
public void setCartQuantity(int cartQuantity) {
	this.cartQuantity = cartQuantity;
}
public String getCartImage() {
	return cartImage;
}
public void setCartImage(String cartImage) {
	this.cartImage = cartImage;
}
public String getCartProductName() {
	return cartProductName;
}
public void setCartProductName(String cartProductName) {
	this.cartProductName = cartProductName;
}
}
