package example;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void a() {
		Reporter.log("Test a", true);
	}
	@Test
	public void b() {
		Reporter.log("Test b", true);
	}
	@Test
	public void c() {
		Reporter.log("Test c", true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Login", true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Logout", true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("launching the browser", true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("closing the browser", true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("DB connect", true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("DB disconnect", true);
	}
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("start the server", true);
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("stop the server", true);
	}	
}
