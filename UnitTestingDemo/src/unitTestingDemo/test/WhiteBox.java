package unitTestingDemo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import unitTestingDemo.SystemUnderTest;

public class WhiteBox {
	SystemUnderTest test=new SystemUnderTest();
	
	@Before
	public void start()
	{
		System.out.println("Started the testing");
	}
	
	@Test
	public void testIncriment()
	{
		test.doIncrement();
		assertEquals(1,test.getCounter());
	}
	
	@Test
	public void testCounter()
	{
		assertEquals(0,test.getCounter());
	}
	
	@After
	public void end()
	{
		System.out.println("The test Ended");
	}
	

}
