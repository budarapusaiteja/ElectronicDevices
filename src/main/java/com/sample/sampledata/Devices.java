package com.sample.sampledata;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Devices {
	@Id
	private Integer id;
	private String name;
	private String category;
	private double price;
	public Devices(Integer id, String name, String category, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Devices [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	public Devices() {
		
	}
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
