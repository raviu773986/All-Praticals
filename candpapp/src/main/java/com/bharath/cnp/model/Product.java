package com.bharath.cnp.model;

import java.math.BigDecimal;

public class Product {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCoupanCode() {
		return coupanCode;
	}
	public void setCoupanCode(String coupanCode) {
		this.coupanCode = coupanCode;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", coupanCode=" + coupanCode + "]";
	}
	private int id;
	private String name;
	private String description;
	private BigDecimal price;
	private String coupanCode;
	

}
