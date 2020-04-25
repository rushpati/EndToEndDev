package com.barc.daos;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.barc.entities.Account;

@Repository
public class AccountDao {

	private Map<Integer, Integer> accountNubmer = new HashMap<Integer, Integer>();
	private Map<Long,Account> accountinfo = new HashMap<Long, Account>();
	
	// suppose this is in database 
	public void accNumbers() {
		accountNubmer.put(1, 101);
		accountNubmer.put(2, 102);
		accountNubmer.put(3, 103);
		accountNubmer.put(4, 104);
	}
	
	
	public boolean Savebalance(Account account) {
		if(accountNubmer.containsKey(account.getAccountNo())) {
			accountinfo.put(account.getAccountNo(), account);
			finalresult();
			return true;
		}
		return  false;
	}
	
	public void finalresult() {
		System.out.println(accountinfo.toString());
	}
	
}
