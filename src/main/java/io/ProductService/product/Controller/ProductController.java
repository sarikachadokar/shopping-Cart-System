package io.ProductService.product.Controller;



import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import io.ProductService.product.dto.Product;
import io.ProductService.product.service.ProductService;


@RestController
@RequestMapping("/v1")
public class ProductController {
	private static final org.slf4j.Logger logger= LoggerFactory.getLogger(ProductController.class); //changed
	private ProductService productService;
	public ProductController(ProductService productService) {
		this.productService=productService;
	}
	@PostMapping("/addProduct")
	ResponseEntity<Product> addProduct(@RequestBody Product product){
		String status=productService.addProduct(product);
		logger.info("Product added status-{}",status);
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
		
	}
	@GetMapping("/productList")
	List<Product> productList(){
		return productService.listAllProduct();
		
	}
@GetMapping("/productList/{category}")	
public List<Product> productCategoryList(@PathVariable String category){
	return productService.productCategoryList(category);
}

@GetMapping("/product/{id}")
Product productById(@PathVariable Integer id){
	return productService.productById(id);
}

@PutMapping("/productUpdate")
String updateProduct(@RequestBody Product product) {
	return productService.updateProduct(product);
}
@DeleteMapping("/product/{id}")
String deleteProductById(@PathVariable Integer id) {
	return productService.deleteProductById(id);
}
}
