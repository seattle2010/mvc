package com.test.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	public void save(String uname) {
		System.out.println("service被调用");
		System.out.println("uname = [" + uname + "]");
	}
}
