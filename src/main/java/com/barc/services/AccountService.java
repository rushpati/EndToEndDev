package com.barc.services;

import org.springframework.stereotype.Service;

import com.barc.entities.Account;

@Service
public class AccountService {


	public void SaveBalance(Account account) {
		System.out.println(" form service " + account);
		
	}
	
}
