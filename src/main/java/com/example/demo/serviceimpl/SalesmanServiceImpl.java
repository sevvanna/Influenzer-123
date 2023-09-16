package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Salesman;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.SalesmanRepo;
import com.example.demo.service.*;
@Service
public class SalesmanServiceImpl  implements SalesmanAddService{
	@Autowired
	SalesmanRepo salesmanrepo;
	
	@Override
	public Salesman addSalesman(Salesman salesman) {
		// TODO Auto-generated method stub
		return  salesmanrepo.save(salesman);
	}

	@Override
	public Salesman update(String productid, Salesman student) {
       
		Salesman s1 = salesmanrepo.findById(productid);
		
		if(s1!=null) {
			s1.setSalesman_ID(s1.getSalesman_ID());
			s1.setQty(s1.getQty());
			s1.setCost(s1.getCost());
		
		return salesmanrepo.save(s1);
		} 
		else
		{
			throw new ResourceNotFoundException();
		}
		
	}

	@Override
	public void Delete(String productid) {
		
Salesman s2 = salesmanrepo.findById(productid);
		
		if(s2!=null) {
			salesmanrepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
		
	}

}
