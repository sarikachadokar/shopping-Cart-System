package io.ProductService.product.service;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import io.ProductService.product.dto.Product;
@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {
    @Query("{'Category.name':?0}")   //0 is index of name 
	List<Product> findByCategory(String category);


}
