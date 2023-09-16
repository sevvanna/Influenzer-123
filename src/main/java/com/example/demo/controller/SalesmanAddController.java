package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Salesman;
import com.example.demo.entity.Salesman_Det;
import com.example.demo.service.LoginService;
import com.example.demo.service.SalesmanAddService;


@RestController
@RequestMapping()
public class SalesmanAddController {
	
	@Autowired
	SalesmanAddService salesmanService;
	@Autowired
	LoginService loginservice;
	

	
	@GetMapping("/login")
	public Salesman_Det login(@RequestHeader int Id,
			@RequestHeader String name) {
		
		return loginservice.login(Id, name);  //golden java rule 
	}
	
	@PostMapping("/post")
	public Salesman addStudent(@RequestBody Salesman salesman) {
		
		return salesmanService.addSalesman(salesman);
	}
	
	@PutMapping("/update")
	public Salesman update(@RequestHeader String product_id , @RequestBody Salesman salesman ) {
		
		return salesmanService.update( product_id,salesman);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String product_id) {
		salesmanService.Delete(product_id);
		return "data deleted";
	}
	
	


}
