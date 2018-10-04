package com.niit.DAO;

import java.util.List;

import com.niit.domain.Category;

public interface CategoryDAO
{
void save(Category c);
void delete(int id);
void update(Category c);
List<Category> categorylist();
public Category getcategory(int id);
}
