package com.example.demo.service;

import com.example.demo.entity.Salesman;


public interface SalesmanAddService {
	

	Salesman addSalesman(Salesman salesman);

	Salesman update(String productid , Salesman student);

	
	void Delete(String product );

}
