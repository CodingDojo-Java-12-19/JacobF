package com.codingdojo.productsandcategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.productsandcategories.models.Category;
import com.codingdojo.productsandcategories.models.Product;
import com.codingdojo.productsandcategories.services.MainService;

@Controller
public class MainController {
	private final MainService service;
	public MainController(MainService s) {
		this.service = s;
	}
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	//Products
	@RequestMapping("/products")
	public String productIndex(Model model) {
		List<Product> products = service.getProducts();
		model.addAttribute("products", products);
		return "products/productIndex.jsp";
	}
	@RequestMapping("/products/{id}")
	public String productShow(@PathVariable("id") Long id, Model model) {
		Product product = service.getProduct(id);
		List<Category> categories = service.findCategoriesNotInProduct(product);
		model.addAttribute("product", product);
		model.addAttribute("categories", categories);
		return "products/productShow.jsp";
	}
	@RequestMapping("/products/new")
	public String productFormPage(@ModelAttribute("product") Product product) {
		return "products/productForm.jsp";
	}
	@PostMapping("/products")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "products/productForm.jsp";
		}
		service.createProduct(product);
		return "redirect:/products";
	}
	@PostMapping("/products/{id}")
	public String addCategoryToProduct(@PathVariable("id") Long id, @RequestParam("category") Long categoryId) {
		Product product = service.getProduct(id);
		Category category = service.getCategory(categoryId);
		service.addCategoryToProduct(product, category);
		return "redirect:/products/" + product.getId();
	}
	
	//Categories
	@RequestMapping("/categories")
	public String categoryIndex(Model model) {
		List<Category> categories = service.getCategories();
		model.addAttribute("categories", categories);
		return "categories/categoryIndex.jsp";
	}
	@RequestMapping("/categories/{id}")
	public String categoryShow(@PathVariable("id") Long id, Model model) {
		Category category = service.getCategory(id);
		List<Product> products = service.findProductsNotInCategory(category);
		System.out.println(products.size());
		model.addAttribute("category", category);
		model.addAttribute("products", products);
		return "categories/categoryShow.jsp";
	}
	@RequestMapping("/categories/new")
	public String categoryFormPage(@ModelAttribute("category") Category category) {
		return "categories/categoryForm.jsp";
	}
	@PostMapping("/categories")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "categories/categoryForm.jsp";
		}
		service.createCategory(category);
		return "redirect:/categories";
	}
	@PostMapping("/categories/{id}")
	public String addProductToCategory(@PathVariable("id") Long id, @RequestParam("product") Long productId) {
		Category category = service.getCategory(id);
		Product product = service.getProduct(productId);
		service.addProductToCategory(category, product);
		return "redirect:/categories/" + category.getId();
	}
}
