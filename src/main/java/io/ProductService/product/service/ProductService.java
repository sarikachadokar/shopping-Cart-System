package io.ProductService.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import io.ProductService.product.dto.Product;

@Service
public class ProductService {

	private ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public String addProduct(Product product) {
		productRepository.save(product);

		return "success";

	}

	public List<Product> listAllProduct() {
		return productRepository.findAll();

	}

	public List<Product> productCategoryList(String category) {
		// TODO Auto-generated method stub
		return productRepository.findByCategory(category);
	}

	public Product productById(Integer id) {
		return productRepository.findById(id).get();

	}

	public String updateProduct(Product product) {
		// TODO Auto-generated method stub

		productRepository.save(product);
		return "Successfully!! updated the product";
	}

	public String deleteProductById(Integer id) {
		productRepository.deleteById(id);
		return "product deleted";
	}
}
