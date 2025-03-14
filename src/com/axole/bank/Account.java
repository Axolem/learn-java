package com.axole.bank;

class Account{
	private String userName;
	private String accountNo;
	private double accountBalance;

	public Account(String name, String accountNo, double balance){
		this.userName = name;
		this.accountNo = accountNo;
		this.accountBalance = balance;
	}

	public void display(){
		System.out.println("Account Holder: " + userName);
        	System.out.println("Account Number: " + accountNo);
        	System.out.println("Current Balance: R" + accountBalance);
	}

	public void deposit(double amount){
		if (amount <= 0){
			System.out.println("\n[ERROR]: You can not deposit balance less than R1.00");
			return;
		}

		accountBalance += amount;
	}

	public void withdraw(double amount){
		if (amount <= 0){                                                                                                               System.out.println("\n[ERROR]: You can not withdarw balance less than R1.00");
                        return;                                                                                                         }

		double newBalance = accountBalance - amount;

		if (newBalance < 0){
			System.out.println("\n[ERROR]: You can not withdarw more than your balance");
                        return;
		}
                                                                                                                                        accountBalance = newBalance; 
	}

}

