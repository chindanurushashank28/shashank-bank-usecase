package com.example.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.model.Customer_master;
import com.example.userservice.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	@GetMapping("/")
	public String hello() {
		return "welcome";
	}
	@PostMapping("/addUser")
	public Customer_master addCustomer(@RequestBody Customer_master customer) {
		userService.addCustomer(customer);
		return customer;
	}
	@DeleteMapping("/deletecustomer/{custid}")
	public void deleteCustomer(@PathVariable(name="custid") String custid) {
		userService.deleteCustomer(custid);
	}

}