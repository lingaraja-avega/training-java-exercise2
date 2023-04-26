package com.avega.training.question4and5;

import java.util.Arrays;

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

	public boolean checkAccount(String accountNo) {
		boolean isAccountNumber = false;
		for (BankAccount account : bankAccount) {
			if (account.getAccountNumber().equals(accountNo)) {
				isAccountNumber = true;
				break;
			}

		}
		if (isAccountNumber)
			return true;
		else
			return false;
	}

	public int getBalance(String accountNo) {
		for (BankAccount account : bankAccount) {
			if (account.getAccountNumber().equals(accountNo)) {
				return account.getBanlance();
			}
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
			System.out.println(getBalance(accountNo));
			return true;
		} else
			return false;
	}
	
	
	public int withdraw(String accountNo, int amount) {
		for (BankAccount account : bankAccount) {
			if (account.getAccountNumber().equals(accountNo)) {
				if(account.getBanlance() >= amount) {
					account.setBanlance(account.getBanlance() - amount);
					System.out.println(amount + " is withdraw");
					return amount;
				} else 
					System.out.println("Insufficient Balance");
			}
		}
		return 0;
	} 

	public void transferMoney(String fromAccount, String toAccount, double amount) {
		boolean isMyAccount = false;


		for (BankAccount account : bankAccount) {
			if (account.getAccountNumber().equals(fromAccount)) {
				if (account.getBanlance() >= amount) {
					int myAccountBalance = account.getBanlance() - (int) amount;
					account.setBanlance(myAccountBalance);
					isMyAccount = true;
				} else {
					System.out.println("You not have sufficient balance!");
					break;
				}
			}
		}

		for (BankAccount tranferAccount : bankAccount) {
			if (tranferAccount.getAccountNumber().equals(toAccount) && isMyAccount) {
				int tranferAccountBalance = tranferAccount.getBanlance() + (int) amount;
				tranferAccount.setBanlance(tranferAccountBalance);
				System.out.println(tranferAccount.getAccountName() + " account balace is " +tranferAccount.getBanlance());
			}
		}

		

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
