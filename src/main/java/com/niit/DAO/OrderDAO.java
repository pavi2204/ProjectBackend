package com.niit.DAO;

import java.util.List;

import com.niit.domain.order;

public interface OrderDAO 
{
void save(order o);
void delete(int id);
void update(order o);
public order getorder(int id);
List<order> orderlist();

}
