package com.barc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.barc.entities.Account;
import com.barc.services.AccountService;

@RestController
public class AccountController {

	
	@Autowired
	private AccountService accountService;
	
	
	//{"accountNo":"123456789","accHolderName":"Rushikesh","address":"Latur","ifscCode":"IFSC0012","balance":"20000"}
	@RequestMapping(value = "/creditbal/{account}" ,method = RequestMethod.POST )
	public ResponseEntity<Account> creditBalance(@RequestBody Account account) {
		System.out.println(account);
		accountService.SaveBalance(account);
		return new ResponseEntity<Account>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/save" )
	public void saveBalance() {
		System.out.println("hii");
	}
}
