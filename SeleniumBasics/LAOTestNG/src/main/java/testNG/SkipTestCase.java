package testNG;

import org.testng.annotations.Test;

public class SkipTestCase {

	@Test(priority=0)
	public void driveCar()
	{
		System.out.println("Start the car");
	}
	
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("Apply First Gear");
	}
	
	@Test(priority=2)
	public void putSecondGear() {
		System.out.println("Apply Second Gear");
	}

	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("Apply Third Gear");
	}

	@Test(priority=4)
	public void applyBreak()
	{
		System.out.println("Apply Break");
	}

	@Test(priority=5,enabled=false)
	public void turnMusicOn()
	{
		System.out.println("Music turned on");
	}
	
	@Test(priority=6)
	public void putNeutralGear()
	{
		System.out.println("Apply Neutral Gear");
	}
	
	@Test(priority=6)
	public void stopCar()
	{
		System.out.println("Stop the car");
	}
	
}
