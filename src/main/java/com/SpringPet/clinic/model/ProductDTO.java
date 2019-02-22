package com.SpringPet.clinic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;

	private String name;
	private String price;
	private String available;

	public ProductDTO()
	{
		//default constructor
	}
	public ProductDTO( String name, String price, String available) {
		super();
//		this.productId = productId;
		this.name = name;
		this.price = price;
		this.available = available;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

}
