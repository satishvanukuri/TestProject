package Flex8Genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Logout extends WaitStatement  {

	public  WebDriver driver;
	@Test
	
		public void Logout() {
			WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
			   wait.until(ExpectedConditions.visibilityOf(
			Browser.driver.findElement(By.xpath("html/body/header/nav/div/ul/li/div/a/img")))).click();
			  
			   Browser.driver.findElement(By.linkText("Sign Out")).click();
		}
	
	

}