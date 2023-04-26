package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.model.Account_master;

@Repository
public interface AccountDoa extends JpaRepository<Account_master,String> {
	
	

}