package io.ProductService.product.dto;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection="product")
public class Product {
	@Id
	private String id;
	@NotNull(message=" name should not be null")
	private String name;
	@NotNull(message="product Categary should not be null")
	private Category category;
	@Min(0)
	private double price;
	
	private String currency;
	@Max(100)
	private double discount;
	private String discountDescription;
	private List<String> imageURLs;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
