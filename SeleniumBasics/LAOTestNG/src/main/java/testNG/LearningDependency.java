package testNG;

import org.testng.annotations.Test;

public class LearningDependency {

  @Test
  public void learnDriving()
  {
	  System.out.println("A person should learn to drive the vehicle");
  }
	
  @Test(dependsOnMethods = "learnDriving")
  public void applyLicense() {
	  System.out.println("A person should apply license once he/she learnt to drive the vehicle");
  }
  
  
  @Test(dependsOnMethods = "applyLicense")
  public void driveVehicle()
  {
	  System.out.println("A person can drive the vehicle once he/she learns to drive it");
  }
}
