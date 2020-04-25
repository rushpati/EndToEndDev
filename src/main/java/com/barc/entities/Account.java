package com.barc.entities;

public class Account {

	private long accountNo;
	private String accHolderName;
	private String address;
	private String ifscCode;
	private Double balance;
	
	
	public Account(long accountNo, String accHolderName, String address, String ifscCode, Double balance) {
		super();
		this.accountNo = accountNo;
		this.accHolderName = accHolderName;
		this.address = address;
		this.ifscCode = ifscCode;
		this.balance = balance;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accHolderName=" + accHolderName + ", address=" + address
				+ ", ifscCode=" + ifscCode + ", balance=" + balance + "]";
	}
	
}
