package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups= {"Apple"})
	public void Apple1()
	{
		System.out.println("Apple Testing1");
	}
	
	@Test(groups= {"Apple"})
	public void Apple2()
	{
		System.out.println("Apple Testing2");
	}
	
	@Test(groups= {"OnePlus"})
	public void OnePlus1()
	{
		System.out.println("OnePlus Testing1");
	}
	
	@Test(groups= {"OnePlus"})
	public void OnePlus2()
	{
		System.out.println("OnePlus Testing2");
	}
	
	@Test(groups= {"Xiaomi"})
	public void Xiaomi1()
	{
		System.out.println("Xiaomi Testing1");
	}
	
	@Test(groups= {"Xiaomi"})
	public void Xiaomi2()
	{
		System.out.println("Xiaomi Testing2");
	}
	
	@Test(groups= {"Vivo"})
	public void Vivo1()
	{
		System.out.println("Vivo Testing1");
	}
	
	@Test(groups= {"Vivo"})
	public void Vivo2()
	{
		System.out.println("Vivo Testing2");
	}
	
	
	
	
	

}
