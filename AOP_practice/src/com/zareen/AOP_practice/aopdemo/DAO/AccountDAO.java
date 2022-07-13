package com.zareen.AOP_practice.aopdemo.DAO;

import org.springframework.stereotype.Component;
import com.zareen.AOP_practice.aopdemo.Account;

@Component
public class AccountDAO {
	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass()+":ADDING an Account");
	}
	
	public boolean doWork() {
		System.out.println(getClass()+": doWork( )method");
		return false;
	}
}
