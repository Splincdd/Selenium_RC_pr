//import junit.framework.TestCase;

//import java.awt.Robot;

import com.thoughtworks.selenium.*;
//import java.util.regex.Pattern;

public class Login extends SeleneseTestCase {

	protected Selenium selenium;
	
public void setUp() throws Exception {
		
		
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://google.com");

				 

				selenium.start();	
	
//Robot robot = new Robot();
	

}

public void tearDown() throws Exception {
		super.tearDown();
	selenium.stop();
}

	public void test1() throws Exception {
		selenium.open("/");
		
	
	selenium.type("q", "Best Test");
	selenium.click("btnG");
	
	}
	
	public void test2() throws Exception {
		selenium.open("/");
	
	
	selenium.type("q", "Best Test");
	selenium.click("//btnG");
	
	}

	public void test3() throws Exception {
		selenium.open("/");
	
	
	selenium.type("q", "Best Test");
	selenium.click("//btnG");
	

	selenium.type("111", "Best Test");
	selenium.click("//btnG");
	}
}





