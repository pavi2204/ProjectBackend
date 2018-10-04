package com.niit.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Product 
{
@Id
@GeneratedValue

private int id;
private String productname;
private String company;
private float price;
@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="category_id")
private Category category;
private String imgName;


public String getImgName() {
	return imgName;
}
public void setImgName(String imgName) {
	this.imgName = imgName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}



}
