package com.online.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.online.shoppingbackend.dao.CategoryDAO;
import com.online.shoppingbackend.dto.Category;

@Controller
public class HomeController {
	
	@Autowired
	private CategoryDAO	categoryDAO;

	@RequestMapping(value={"/","/home"})
	public ModelAndView welcome()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title","Home");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickHome","home");
		return mv;
	}
	
	@RequestMapping(value={"/about"})
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title","About Us");
		mv.addObject("userClickHome","about");
		return mv;
	}
	
	@RequestMapping(value={"show/all/products"})
	public ModelAndView listproducts()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title","Products");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickHome","listAllProducts");
		return mv;
	}
	
	@RequestMapping(value={"show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id)
	{	
		Category category = null;
		category = categoryDAO.get(id);
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title",category.getName());
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("category",category);
		mv.addObject("userClickHome","categoryProducts");
		return mv;
	}
	
	@RequestMapping(value={"/contact"})
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickHome","contact");
		return mv;
	}
	
}
