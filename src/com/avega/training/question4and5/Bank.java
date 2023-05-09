package com.avega.training.question4and5;

import java.util.Arrays;

import javax.naming.InsufficientResourcesException;
import javax.security.auth.login.AccountNotFoundException;

public class Bank {

	private BankAccount[] bankAccount;

	public Bank() {

	}

	public Bank(BankAccount[] bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	public BankAccount[] getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount[] bankAccount) {
		this.bankAccount = bankAccount;
	}

	public BankAccount checkAccount(String accountNo) throws AccountNotFoundException {
		BankAccount accountAccount = null;
		boolean isAccountNumber = false;
		for (BankAccount account : bankAccount) {
			if (account.getAccountNumber().equals(accountNo)) {
				isAccountNumber = true;
				accountAccount = account;
				break;
			}

		}
		if (isAccountNumber)
			return accountAccount;
		else
			throw new AccountNotFoundException("You entered account is not avaiable in the bank");
	}

	public int getBalance(String accountNo) {
		try {
			BankAccount account = checkAccount(accountNo);
			return account.getBanlance();
		} catch (AccountNotFoundException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public boolean deposit(String accountNo, double amount) {
		boolean isAccountNumber = false;
		for (BankAccount account : bankAccount) {
			if (account.getAccountNumber().equals(accountNo)) {
				int totalAmount = account.getBanlance() + (int) amount;
				account.setBanlance(totalAmount);
				isAccountNumber = true;
				break;
			}
		}
		if (isAccountNumber) {
			System.out.println("Balance: " + getBalance(accountNo));
			return true;
		} else
			return false;
	}

	public int withdraw(String accountNo, int amount) throws InsufficientResourcesException, AccountNotFoundException {
		BankAccount account = checkAccount(accountNo);
		int balance = getBalance(accountNo);
		if (balance >= amount) {
			account.setBanlance(account.getBanlance() - amount);
			return amount;
		} else {
			throw new InsufficientResourcesException("Amount is greater than bank balance");
		}
	}

	public void transferMoney(String fromAccount, String toAccount, double amount)
			throws AccountNotFoundException, InsufficientResourcesException {
		BankAccount sendAccount = checkAccount(fromAccount);
		withdraw(sendAccount.getAccountNumber(), (int) amount);
		BankAccount recAcc = checkAccount(toAccount);
		deposit(recAcc.getAccountNumber(), amount);
	}

	@Override
	public String toString() {
		return "Bank [bankAccount=" + Arrays.toString(bankAccount) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(bankAccount);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		return Arrays.equals(bankAccount, other.bankAccount);
	}

}
