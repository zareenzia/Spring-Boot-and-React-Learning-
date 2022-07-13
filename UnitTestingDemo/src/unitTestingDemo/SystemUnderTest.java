package unitTestingDemo;

public class SystemUnderTest {
	
	private int counter = 0;
	 
    private void increment(){
	      counter++;
	}

    public int getCounter()
    {
    	return counter;
    }
    
    public void doIncrement()
    {
    	increment();
    }
}
