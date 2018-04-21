package com.online.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.online.shoppingbackend.dao.CategoryDAO;
import com.online.shoppingbackend.dto.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is desc. for television");
		category.setImageURL("television_url");

		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("Laptop");
		category.setDescription("This is desc. for Laptop");
		category.setImageURL("Laptop_url");

		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Mobile");
		category.setDescription("This is desc. for mobile");
		category.setImageURL("mobile_url");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category: categories)
		{
				if(category.getId()==id)
					return category;
		}
		return null;	
	}

}
