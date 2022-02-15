package io.ProductService.product.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class Product {
	@Id
	private Integer id;
	private String name;
	private Category category;
	private double price;
	private String currency;
	private double discount;
	private String discountDescription;
	private List<String> imageURLs;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getDiscountDescription() {
		return discountDescription;
	}
	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public List<String> getImageURLs() {
		return imageURLs;
	}
	public void setImageURLs(List<String> imageURLs) {
		this.imageURLs = imageURLs;
	}
	

}
