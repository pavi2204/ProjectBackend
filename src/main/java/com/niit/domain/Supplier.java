package com.niit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier 
{
@Id
@GeneratedValue

private int id;
private String Suppliername;
private String Address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSuppliername() {
	return Suppliername;
}
public void setSuppliername(String suppliername) {
	Suppliername = suppliername;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
}
