package DDemoMaven.MavenDemo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

	WebDriver driver;
@Before	
public void setup() throws Exception{
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","/Users/sonyparepally/jars/geckodriver");
driver=new FirefoxDriver();
}
@Test
public void openApp() throws Exception{
driver.get("http://automationpractice.com/index.php");
Thread.sleep(3000);
driver.findElement(By.linkText("Sign in")).click();
driver.findElement(By.name("email")).sendKeys("sahithi.parepally93@gmail.com");
driver.findElement(By.name("passwd")).sendKeys("Pram@123");
driver.findElement(By.id("SubmitLogin")).click();
WebDriverWait Wait=new WebDriverWait(driver,20);
Wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign out")));
driver.findElement(By.linkText("Sign out")).click();
}
		// TODO Auto-generated method stub

	}
