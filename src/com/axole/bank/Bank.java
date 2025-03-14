package com.axole.bank;

import com.axole.bank.Account;

class Bank{
	public static void main(String args[]){
		Account account = new Account("Axole", "789", 5000d);

		account.display();
		account.deposit(500D);

		account.display();
		account.withdraw(2569d);

		account.display();

	}
}
