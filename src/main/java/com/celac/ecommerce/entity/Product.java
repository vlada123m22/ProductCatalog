package com.celac.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;import jakarta.persistence.Table;

/** Created by user on 8/5/2015. */
@Entity
@Table(name = "products")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "product_name")
  private String productName;

  @Column(name = "product_stock_quantity")
  private int productStock;

  @Column(name = "product_price")
  private double productPrice;

  @Column(name = "product_Description")
  private String productDescription;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

  public Product() {}

  public Product(
      String productName, int productStock, double productPrice, String productDescription) {
    this.productName = productName;
    this.productStock = productStock;
    this.productPrice = productPrice;
    this.productDescription = productDescription;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getProductStock() {
    return productStock;
  }

  public void setProductStock(int productStock) {
    this.productStock = productStock;
  }

  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }

  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
