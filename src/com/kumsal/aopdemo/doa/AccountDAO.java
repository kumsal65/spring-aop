package com.kumsal.aopdemo.doa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.kumsal.aopdemo.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	public List<Account> findAcounts(boolean tripWire){
		
		if (tripWire) {
			throw new RuntimeException("No soup for you!!");
		}
		List<Account> theAccounts=new ArrayList<Account>();
		Account temp1=new Account("Kumsal", "Silver");
		Account temp2=new Account("Yahya", "Platinium");

		theAccounts.add(temp2);
		theAccounts.add(temp1);
		return theAccounts;
	}
	
	public void addAccount(Account theAccount,boolean vipFlag){
		
		System.out.println(getClass()+" :DOING MY DB WORK: ADDING AN ACCOUNT");
		
	}
	public boolean doWork(){
		System.out.println(getClass()+" :doing work");
		return false;
	}
	public String getName() {
		System.out.println(getClass()+" : getname doing work");
		return name;
	}
	public void setName(String name) {
		System.out.println(getClass()+" :setname doing work");
		this.name = name;
	}
	public String getServiceCode() {
		System.out.println(getClass()+" getservice gt:doing work");
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		System.out.println(getClass()+" setservice gt:doing work");
	}


	
}
