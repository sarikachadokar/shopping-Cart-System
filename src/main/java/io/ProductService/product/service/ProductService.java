package io.ProductService.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;



import io.ProductService.product.dto.Product;
import io.ProductService.product.repository.ProductRepository;




@Service
public class ProductService {

	private ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public String addProduct(Product product) {
	if(product.getPrice()== 0 && product.getDiscount()>0) {
		throw new OfferNotValidException("no discount allowed at 0 product price");
	}
		//Logger.info("adding product");
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

	public Product productById(String id) {
		return productRepository.findById(id).get();

	}

	public String updateProduct(Product product) {
		// TODO Auto-generated method stub

		productRepository.save(product);
		return "Successfully!! updated the product";
	}

	public String deleteProductById(String id) {
		productRepository.deleteById(id);
		return "products deleted";
		
	}
}
