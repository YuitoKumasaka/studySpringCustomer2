package com.example.service;

import com.example.domain.*;
import com.example.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public Customer Sava(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
