package com.zareen.AOP_practice.aopdemo.DAO;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public void addAccount() {
		System.out.println(getClass()+":ADDING a membership Account");
	}
	
	public Boolean addSillyAccount() {
		System.out.println(getClass()+": DoingSilly Account");
		return true;
	}
	
	public void goToSleep() {
		System.out.println(getClass()+": Going to sleep");
	}


}

