package com.codingdojo.productsandcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.productsandcategories.models.Category;
import com.codingdojo.productsandcategories.models.Product;
import com.codingdojo.productsandcategories.repositories.CategoryRepository;
import com.codingdojo.productsandcategories.repositories.ProductRepository;

@Service
public class MainService {
	private final ProductRepository pRepo;
	private final CategoryRepository cRepo;
	public MainService(ProductRepository pRepo, CategoryRepository cRepo) {
		this.pRepo = pRepo;
		this.cRepo = cRepo;
	}
	//Products Services
	public List<Product> getProducts() {
		return pRepo.findAll();
	}
	public Product getProduct(Long id) {
		return pRepo.findById(id).orElse(null);
	}
	public Product createProduct(Product p) {
		return pRepo.save(p);
	}
	public List<Product> findProductsNotInCategory(Category category) {
		return pRepo.findByCategoriesNotContains(category);
	}
	public Product addCategoryToProduct(Product p, Category c) {
		List<Category> categories = p.getCategories();
		if(!categories.contains(c)) {
			categories.add(c);
		}
		p.setCategories(categories);
		return pRepo.save(p);
	}
	//Categories Services
	public List<Category> getCategories() {
		return cRepo.findAll();
	}
	public Category getCategory(Long id) {
		return cRepo.findById(id).orElse(null);
	}
	public Category createCategory(Category c) {
		return cRepo.save(c);
	}
	public List<Category> findCategoriesNotInProduct(Product product) {
		return cRepo.findByProductsNotContains(product);
	}
	public Category addProductToCategory(Category c, Product p) {
		List<Product> products = c.getProducts();
		if(!products.contains(p)) {
			products.add(p);
		}
		c.setProducts(products);
		return cRepo.save(c);
	}
}
