package com.patika.project.firstCase.Entities;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Products {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="productname")
	private String productname;
	
	@Column(name="price")
	private int price;
	
	@Column(name="expirationdate")
	private String expirationdate;

	public Products(int id, String productname, int price, String expirationDate) {
		super();
		this.id = id;
		this.productname = productname;
		this.price = price;
		this.expirationdate = expirationDate;
	}
	public Products() {
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getExpirationDate() {
		return expirationdate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationdate = expirationDate;
	}
}
