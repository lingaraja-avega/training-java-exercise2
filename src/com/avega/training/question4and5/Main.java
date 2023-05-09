package com.avega.training.question4and5;

import javax.naming.InsufficientResourcesException;
import javax.security.auth.login.AccountNotFoundException;

public class Main {

	public static void main(String[] args) {

		BankAccount bankAccount1 = new BankAccount("7316", "Lingesh");
		BankAccount bankAccount2 = new BankAccount("7317", "Kavya");
		BankAccount bankAccount3 = new BankAccount("7318", "Gokul");
		BankAccount bankAccount4 = new BankAccount("7318", "Bhavani");
		BankAccount[] totalBankAccounts = { bankAccount1, bankAccount2, bankAccount3, bankAccount4 };
		Bank bank = new Bank();
		bank.setBankAccount(totalBankAccounts);
//		System.out.println(bank.transferMoney("7316", "7317", 1500));
//		System.out.println(bank.withdraw("7317", 500));
		
		try {
			bank.transferMoney("7316", "7317", 500);
		} catch (AccountNotFoundException | InsufficientResourcesException e) {
			e.printStackTrace();
		}
		
	}

}
