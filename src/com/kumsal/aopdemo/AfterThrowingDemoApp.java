package com.kumsal.aopdemo;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kumsal.aopdemo.doa.AccountDAO;
import com.kumsal.aopdemo.doa.MamberShipDAO;

public class AfterThrowingDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				   new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDao=context.getBean("accountDAO", AccountDAO.class);
		List<Account> theAccounts=null;
		
		try {
			boolean tripWire=true;
			theAccounts=theAccountDao.findAcounts(tripWire);
		} catch (Exception e) {
			System.out.println("Main Program caught exception :"+e);
		}
		
		System.out.println("Main progaram afterThrowing");
		System.out.println(theAccounts);
		System.out.println("end of list ");
		
		context.close();
	}

}
