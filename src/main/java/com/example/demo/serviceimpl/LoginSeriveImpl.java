package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Salesman_Det;
import com.example.demo.repository.LoginRepo;
import com.example.demo.service.LoginService;

@Service
public class LoginSeriveImpl implements LoginService{

	@Autowired
	LoginRepo loginrepo;	
	// TODO Auto-generated method stub
		

	@Override
	public Salesman_Det login(int Id, String name) {
		Salesman_Det user= loginrepo.findByUsernameandPassword(Id, name);
		return user;
	}
	}

