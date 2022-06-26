package com.cg.ThirdQuestion;

public class BankAccount {
 private  int accountid;
 private String accountHolderName;
 private String accountType;
 private float accountbalance;
 
public int getAccountid() {
	return accountid;
}
public void setAccountid(int accountid) {
	this.accountid = accountid;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public float isAccountbalance() {
	return accountbalance;
}
public void setAccountbalance(float accountbalance) {
	this.accountbalance = accountbalance;
}
public BankAccount(int accountid, String accountHolderName, String accountType, float accountbalance) {
	super();
	this.accountid = accountid;
	this.accountHolderName = accountHolderName;
	this.accountType = accountType;
	this.accountbalance = accountbalance;
}
public BankAccount() {
	super();
	
}
 
 
}
