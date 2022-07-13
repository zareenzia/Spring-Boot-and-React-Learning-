package com.zareen.AOP_practice.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zareen.AOP_practice.aopdemo.DAO.AccountDAO;
import com.zareen.AOP_practice.aopdemo.DAO.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO theMembershipDAO =context.getBean("membershipDAO",MembershipDAO.class);
			
		Account myAccount=new Account();
		theAccountDAO.addAccount(myAccount,true);
		theAccountDAO.doWork();
		theMembershipDAO.addAccount();
		theMembershipDAO.addSillyAccount();
		theMembershipDAO.goToSleep();
		context.close();

	}

}
