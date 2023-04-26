package com.example.userservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userservice.model.Customer_master;

@Repository
public interface UserDao extends JpaRepository<Customer_master, String> {

}
