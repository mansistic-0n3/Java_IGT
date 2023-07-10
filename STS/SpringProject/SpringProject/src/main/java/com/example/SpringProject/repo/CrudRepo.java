package com.example.SpringProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringProject.model.Product;

public interface CrudRepo extends JpaRepository<Product, Integer>{

	
	
}
