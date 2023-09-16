package com.example.demo.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Salesman_Det {
    @Id
	private int salesman_id;
	private String Salesman_details;
	public int getSalesman_id() {
		return salesman_id;
	}
	public void setSalesman_id(int salesman_id) {
		this.salesman_id = salesman_id;
	}
	public String getSalesman_details() {
		return Salesman_details;
	}
	public void setSalesman_details(String salesman_details) {
		Salesman_details = salesman_details;
	}
	
	
}
