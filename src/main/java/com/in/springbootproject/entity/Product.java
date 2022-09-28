package com.in.springbootproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_tab")
public class Product {
     @Id
     @Column(name="pid")
    private Integer prodId;
    @Column(name="pname")
    private String prodName;
    @Column(name="pcost")
    private Double prodCost;

    public Product() {
    }

    public Product(Integer prodId, String prodName, Double prodCost) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodCost = prodCost;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Double getProdCost() {
        return prodCost;
    }

    public void setProdCost(Double prodCost) {
        this.prodCost = prodCost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodCost=" + prodCost +
                '}';
    }
}
