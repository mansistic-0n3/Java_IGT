package com.example.SpringProject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringProject.model.Product;
import com.example.SpringProject.services.CrudService;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class CrudRestController {

	@Autowired
	private CrudService service;
	
	@GetMapping("")
	public String entrypage() {
		return "Welcome to Spring MVC Application";
	}
	
	@GetMapping("/getProd")
    public List<Product> fetchProductList(){
        List<Product> products=new ArrayList<>();
        //Logic TO Fetch
         products =service.fetchProductList();
        return products;
    }
	
	@GetMapping("/getProd/{id}")
	public Product fetchProductListById(@PathVariable int id){ 
		return service.fetchProductListById(id).get();
	}
	
	@PostMapping("/addProd")
	public Product saveProductList(@RequestBody Product product){ 
		
		return service.saveProductToBD(product);
		
	}
	
	@DeleteMapping("/deleteProd/{id}")
	public String deleteProductListById(@PathVariable int id){ 
		return service.deleteProductListById(id);
		
	
	}
	
	@PutMapping("/updateRecord")
    public Product updateProductList(@RequestBody Product product){ 

        return service.saveProductToBD(product);    
    }
	
}
