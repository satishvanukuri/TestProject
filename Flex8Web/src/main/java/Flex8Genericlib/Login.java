package Flex8Genericlib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class Login extends WaitStatement{

	@FindBy(xpath="html/body/div[1]/div/div[2]/div/div/div[1]/div//*[@id='Email']")

	private WebElement Emailid;

		
		@FindBy(xpath="html/body/div[1]/div/div[2]/div/div/div[1]/div//*[@id='Password']")
		private WebElement pswEdt;
		
		@FindBy(xpath="html/body/div[1]/div/div[2]/div/div/div[1]/div//*[@id='btnSignIn']")
		private WebElement loginBtn;
		
		@Test
		public void logintoAdmin() throws InterruptedException{
			Thread.sleep(3000);
			
			
			Browser.driver.manage().window().maximize();
			Browser.driver.get(Constant.url);
			Browser.driver.findElement(By.id("Email")).click();
			
			Emailid.sendKeys(Constant.userAdmin);
			pswEdt.sendKeys(Constant.password);
			loginBtn.click();	
		}
		
		
		@Test
		public void logintoCoach() throws InterruptedException{
			Thread.sleep(3000);
			
			Browser.driver.manage().window().maximize();
			Browser.driver.get(Constant.url);
			Browser.driver.get(Constant.url);
			Emailid.sendKeys(Constant.logintoCoach);
			
			pswEdt.sendKeys(Constant.password);
			loginBtn.click();	
		}
		
		@Test
		public void logintoMember() throws InterruptedException{
			Thread.sleep(3000);
			
			Browser.driver.manage().window().maximize();
			Browser.driver.get(Constant.url);
			Emailid.sendKeys(Constant.logintoMember);
			pswEdt.sendKeys(Constant.Mempassword);
			loginBtn.click();	
		}
		

}
