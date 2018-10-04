package com.niit.DAO;

import java.util.List;

import com.niit.domain.Supplier;

public interface SupplierDAO 
{
void save(Supplier s);
void delete(int id);
void update(Supplier s);
List<Supplier> supplierlist();
public Supplier getsupplier(int id);
}
