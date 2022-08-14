package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class itestListners implements ITestListener {
  @Test
  public void one() {
	System.out.println("its one ");
  }


public void onTestStart(ITestResult result) {
System.out.println(result.getName());
System.out.println(result.getStatus());
System.out.println(result.getInstanceName());
System.out.println("its onTestStart ");
}


public void onTestSuccess(ITestResult result) {

	System.out.println(result.getName());
	System.out.println(result.getStatus());
	System.out.println(result.getInstanceName());
	System.out.println("its onTestSuccess ");
}


public void onTestFailure(ITestResult result) {
	System.out.println(result.getName());
	System.out.println(result.getStatus());
	System.out.println(result.getInstanceName());
	System.out.println("its onTestFailure ");
}

public void onTestSkipped(ITestResult result) {
	System.out.println(result.getName());
	System.out.println(result.getStatus());
	System.out.println(result.getInstanceName());
	System.out.println("its onTestSkipped ");
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println(result.getName());
	System.out.println(result.getStatus());
	System.out.println(result.getInstanceName());
	System.out.println("its onTestFailedButWithinSuccessPercentage ");
}


public void onStart(ITestContext context) {
	
	System.out.println(context.getName());
	System.out.println(context.getStartDate());
	System.out.println("its onStart ");
}


public void onFinish(ITestContext context) {
	System.out.println(context.getName());
	System.out.println(context.getStartDate());
	System.out.println("its onFinish ");
}
}
