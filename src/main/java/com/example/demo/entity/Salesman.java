package com.example.demo.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Salesman {
	@Id
    private int Salesman_ID;
    private int Product_ID;  
    private String Product_Description; 
    private String Qty; ;
    
    private double Cost;  
    private double GST;
	public int getSalesman_ID() {
		return Salesman_ID;
	}
	public void setSalesman_ID(int salesman_ID) {
		Salesman_ID = salesman_ID;
	}
	public int getProduct_ID() {
		return Product_ID;
	}
	public void setProduct_ID(int product_ID) {
		Product_ID = product_ID;
	}
	public String getProduct_Description() {
		return Product_Description;
	}
	public void setProduct_Description(String product_Description) {
		Product_Description = product_Description;
	}
	public String getQty() {
		return Qty;
	}
	public void setQty(String qty) {
		Qty = qty;
	}
	public double getCost() {
		return Cost;
	}
	public void setCost(double cost) {
		Cost = cost;
	}
	public double getGST() {
		return GST;
	}
	public void setGST(double gST) {
		GST = gST;
	}

}
