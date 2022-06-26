package com.cg.ThirdQuestion;

public interface BankAccountRepository {
	public double getBalance(long accountId);
	public double updatebalance(long accountId,double newBalance);
	
}
