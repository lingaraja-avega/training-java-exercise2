package com.avega.training.question4and5;

public class BankAccount {
	
	public static int STARTING_AMOUNT = 1000; 
		
	
	private String accountNumber;
	private String accountName;
	private int banlance = STARTING_AMOUNT;

	public BankAccount() {

	}

	public BankAccount(String accountNumber, String accountName) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public void setBanlance(int  balance) {
		this.banlance = balance;
	}

	public int getBanlance() {
		return banlance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountName=" + accountName + ", balace=" + banlance +"]" ;
	}
	
	

}
