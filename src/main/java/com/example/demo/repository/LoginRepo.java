package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Salesman_Det;

@Repository
public interface LoginRepo extends JpaRepository<Salesman_Det, Integer> { 
@Query(value =  "select * from Salesman_Det where Salesman_ID =?" , nativeQuery = true)
		Salesman_Det findByUsernameandPassword(int id,String salesman_det ); 
			// TODO Auto-generated method stub
			

		
//		@Query(value = "delete from Student where email =?" , nativeQuery = true)
//		void deleteById(String email);

		
		
		
	}
	 


