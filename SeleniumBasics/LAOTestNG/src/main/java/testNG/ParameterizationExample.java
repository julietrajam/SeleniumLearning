package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	@Test
	@Parameters("Name")
	public void nameDisp(String name)
	{
		System.out.println("My Name is"+name);
	}

}
