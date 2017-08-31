package com.cgm.builder;

import com.cgm.entity.Account;

public class AccountBuilder {

	public static Account andreiAccount() {
		Account account = new Account();
		account.setUsername("andrei");
		account.setPassword("andrei");
		account.setFullName("Andrei Nicau");
		account.setAge(21);
		return account;
	}
	
}
