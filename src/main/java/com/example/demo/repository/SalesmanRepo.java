package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Salesman;


@Repository
public interface SalesmanRepo extends JpaRepository<Salesman, Integer>{
	
       @Query(value =  "select * from Salesman where  Product_ID =?" , nativeQuery = true)
		Salesman findById(String product_Id);


}
