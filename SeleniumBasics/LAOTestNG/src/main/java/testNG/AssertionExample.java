package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	String name="Juliet";
	
	Boolean value=true;
	
	@Test
	public void checkName()
	{
		Assert.assertEquals(name, "Juliet");
	}
	
	@Test
	public void checkBooleanValue()
	{
		Assert.assertTrue(true);
	}

}
