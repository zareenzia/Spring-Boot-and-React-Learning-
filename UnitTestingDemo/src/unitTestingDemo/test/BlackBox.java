package unitTestingDemo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import unitTestingDemo.SystemUnderTest;

public class BlackBox {
	
	SystemUnderTest test=new SystemUnderTest();
	
	@Before
	public void start()
	{
		System.out.println("The testing Started");
	}
	
	@Test
	public void checkValue0()
	{
		test.doIncrement();
		assertEquals(0, test.getCounter());
	}
	
	@Test
	public void checkValue1()
	{
		test.doIncrement();
		assertEquals(1, test.getCounter());
	}
	
	@Test
	public void checkValue2()
	{
		test.doIncrement();
		assertEquals(2, test.getCounter());
	}
	
	@After
	public void end()
	{
		System.out.println("The Testing Ends");
	}

}
