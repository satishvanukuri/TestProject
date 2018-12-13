package Flex8Test;
import Flex8Genericlib.*;
import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flex8MemTest {
	

		WebDriver driver ;
	    Login Loginpage;
		 WaitStatement ws;
	   Logout lg;
			
			
			
	@BeforeClass
			
			
			public void configBeforeclass(){
				
				
				driver = Browser.getBrowser();

				ws = PageFactory.initElements(driver,WaitStatement.class);
	           Loginpage = PageFactory.initElements(driver,Login.class);
	           lg = PageFactory.initElements(driver,Logout.class);
	          // LogouttoTPL = PageFactory.initElements(driver,Logout.class);
			}
			
			@BeforeMethod
			
			public void Flex8Login() throws InterruptedException 		{
				
		Loginpage.logintoMember();
		

			
			}
			
	//@Test(priority=1)
		
		public void MyProfile()
		{
		    driver.findElement(By.id("FirstName")).clear();
			driver.findElement(By.id("FirstName")).sendKeys("Vishal");
			
			driver.findElement(By.id("LastName")).clear();
			driver.findElement(By.id("LastName")).sendKeys("kumar");
			
			Select sel = new Select(driver.findElement(By.id("Gender")));
			sel.selectByIndex(0);
			
			driver.findElement(By.id("btnSave")).click();
			
		}
	
	
	//@Test(priority=1)
	
	public void MyContact()
	{
		driver.findElement(By.xpath("//*[@id='tab2']/a")).click();
		ws.waitForPageToLoad();
	    driver.findElement(By.id("Address")).clear();
		driver.findElement(By.id("Address")).sendKeys("Texas");
		
		driver.findElement(By.id("City")).clear();
		driver.findElement(By.id("City")).sendKeys("Palno",Keys.TAB,Keys.ARROW_DOWN);
		
		driver.findElement(By.id("ZipCode")).clear();
		driver.findElement(By.id("ZipCode")).sendKeys("75201",Keys.TAB,Keys.ARROW_DOWN);
		
		
		driver.findElement(By.id("HomePhoneNumber")).clear();
		driver.findElement(By.id("HomePhoneNumber")).click();
		driver.findElement(By.id("HomePhoneNumber")).sendKeys("897-896-5462");
		
		driver.findElement(By.id("CellPhoneNumber")).clear();
		driver.findElement(By.id("CellPhoneNumber")).click();
		driver.findElement(By.id("CellPhoneNumber")).sendKeys("897-896-5462");
		
		driver.findElement(By.id("PhysicianName")).clear();
		driver.findElement(By.id("PhysicianName")).sendKeys("Adam");
		
		driver.findElement(By.id("PhysicianPhone")).clear();
		driver.findElement(By.id("PhysicianPhone")).click();
		driver.findElement(By.id("PhysicianPhone")).sendKeys("897-896-5462");
		
		
		driver.findElement(By.id("EmerContactname")).clear();
		driver.findElement(By.id("EmerContactname")).sendKeys("Adam");
		
		driver.findElement(By.id("EmerContactRelationship")).clear();
		driver.findElement(By.id("EmerContactRelationship")).sendKeys("Adam");
		
		driver.findElement(By.id("EmerHomephone")).clear();
		driver.findElement(By.id("EmerHomephone")).click();
		driver.findElement(By.id("EmerHomephone")).sendKeys("897-896-5462");
		
		driver.findElement(By.id("EmerCellPhone")).clear();
		driver.findElement(By.id("EmerCellPhone")).click();
		driver.findElement(By.id("EmerCellPhone")).sendKeys("897-896-5462");
		
		driver.findElement(By.id("EmerEmailAddress")).clear();
		driver.findElement(By.id("EmerEmailAddress")).sendKeys("897-896-5462");
		
		
		driver.findElement(By.id("btnSave_contact")).click();
		
	}

//@Test(priority=1)
	
	public void MyScreening() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='tab3']/a")).click();
		ws.waitForPageToLoad();
		WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
		   wait.until(ExpectedConditions.visibilityOf(
	    driver.findElement(By.xpath("//*[@id='profile3']/form/div[1]/div[1]/div[1]/div/div")))).click();
	    driver.findElement(By.xpath("//*[@id='profile3']/form/div[1]/div[1]/div[1]/div/div/input")).sendKeys("Heart",Keys.ARROW_DOWN,Keys.ENTER);
	    
	    driver.findElement(By.id("ListOfMedications")).sendKeys("List Of Medications");
	    
	    driver.findElement(By.xpath("//span[3]")).click();
	    
	    //driver.findElement(By.id("btnSave_screening")).click();
	    
	}
	
	
	
//@Test(priority=1)
	
	public void MyAssessment() 
	{
		driver.findElement(By.xpath("//*[@id='tab4']/a")).click();
		for(int i=0;i<21;i++)
		{
			WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
			   wait.until(ExpectedConditions.visibilityOf(
		driver.findElement(By.xpath("//*[@id='profile4']/form/div[1]/div[1]/div[2]/span/span/span/span[1]/span")))).click();
		}
			   for(int j=0;j<19;j++)
				{
			   WebDriverWait wait1 = new WebDriverWait(Browser.driver, 20);
			   wait1.until(ExpectedConditions.visibilityOf(
		driver.findElement(By.xpath("//*[@id='profile4']/form/div[1]/div[1]/div[3]/span/span/span/span[1]/span")))).click();
			 
			   
		}
			   
			   driver.findElement(By.id("btnSave_assessment")).click();
	
		}
	
	
//@Test(priority=1)
	
	public void MyGoal() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id='tab5']/a")).click();
		
			WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
			   wait.until(ExpectedConditions.visibilityOf(
		driver.findElement(By.xpath("//*[@id='profile5']/form/div[1]/div[1]/div[1]/span/span")))).click();
		Thread.sleep(3000);
					   
			   
			   WebDriverWait wait1 = new WebDriverWait(Browser.driver, 20);
			   wait1.until(ExpectedConditions.visibilityOf(
		driver.findElement(By.xpath("//*[@id='TrackFieldID_listbox']/li[3]")))).click();
			 
			   
			   
			   
			   WebDriverWait wait2 = new WebDriverWait(Browser.driver, 20);
			   wait2.until(ExpectedConditions.visibilityOf(
		driver.findElement(By.xpath("//*[@id='profile5']/form/div[1]/div[1]/div[2]/span/span")))).click();
		Thread.sleep(3000);
					   
			   
			   WebDriverWait wait3 = new WebDriverWait(Browser.driver, 20);
			   wait3.until(ExpectedConditions.visibilityOf(
		driver.findElement(By.xpath("//*[@id='TrainingLocationTypeID_listbox']/li[4]")))).click();
			   
			   
			   
			   
			   WebDriverWait wait4 = new WebDriverWait(Browser.driver, 20);
			   wait4.until(ExpectedConditions.visibilityOf(
		driver.findElement(By.xpath("//*[@id='profile5']/form/div[1]/div[2]/div[3]/span/span")))).click();
		Thread.sleep(3000);
					   
			   
			   WebDriverWait wait5 = new WebDriverWait(Browser.driver, 20);
			   wait5.until(ExpectedConditions.visibilityOf(
		driver.findElement(By.xpath("//*[@id='EatingHabitID_listbox']/li[3]")))).click();
			   
			   
			   
			   driver.findElement(By.id("btnSave_goals")).click();
			   
			   
			   }
	
	
	
	
	
//@Test(priority=1)
	
	public void MyInbox() 
	{
	driver.findElement(By.linkText("Inbox")).click();
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='profile1']/div[1]/div/div[2]/div/a")).click();
	  
	driver.findElement(By.id("Communication_CommunicationMessage")).sendKeys("Hi Player");
	
	
	driver.findElement(By.xpath("html/body/div/div/form/div/div/div[1]/div/div/button")).click();
	
	driver.findElement(By.xpath("html/body/div/div/form/div[1]/div/div[1]/div/div/button")).click();
	
	}
	

	
//@Test(priority=1)

public void MyWorkouts()
{
driver.findElement(By.linkText("My PROS")).click();
ws.waitForPageToLoad();
driver.findElement(By.linkText("Contact")).click();


driver.findElement(By.id("Communication_CommunicationMessage")).sendKeys("Hi Player");


driver.findElement(By.xpath("html/body/div/div/form/div/div/div[1]/div/div/button")).click();



}
	
	
	
 //  @Test(priority=11)

    public void WorkOutVideosSearch() throws InterruptedException	{
	
    driver.findElement(By.linkText("Workout Videos")).click();

    ws.waitForPageToLoad();
    
    driver.findElement(By.xpath("//*[@id='gridWO']/div[1]/div/div/div[2]/span/span")).click();
    
    Thread.sleep(5000);
    
     driver.findElement(By.xpath("//*[@id='wocategories_option_selected']")).click();

    
}
	
//@Test(priority=12)

public void WorkOutVideoSteps() throws InterruptedException 	{
	
driver.findElement(By.linkText("Workout Videos")).click();

ws.waitForPageToLoad();

driver.findElement(By.linkText("Steps")).click();
Thread.sleep(4000);
driver.navigate().refresh();



}
	
//@Test(priority=13)

public void WorkOutVideo() throws InterruptedException 	{
	
driver.findElement(By.linkText("Workout Videos")).click();

ws.waitForPageToLoad();

driver.findElement(By.linkText("Video")).click();
Thread.sleep(4000);
driver.navigate().refresh();



}	
	





//@Test(priority=40)

public void virtualtrainingplans() 	{
	
driver.findElement(By.id("virtualtrainingplans")).click();
	ws.waitForPageToLoad();
	
driver.findElement(By.linkText("Download Template")).click();

FirefoxProfile firefoxProfile = new FirefoxProfile();

firefoxProfile.setPreference("browser.download.folderList", 2);

firefoxProfile.setPreference("browser.download.manager.showWhenStarting", false);

firefoxProfile.setPreference("browser.download.dir", "D://");

firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv/xls/xlsx");

firefoxProfile.setPreference("browser.helperApps.neverAsk.openFile",

    "text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");

firefoxProfile.setPreference("browser.helperApps.alwaysAsk.force", false);

firefoxProfile.setPreference("browser.download.manager.alertOnEXEOpen", false);

firefoxProfile.setPreference("browser.download.manager.focusWhenStarting", false);

firefoxProfile.setPreference("browser.download.manager.useWindow", false);

firefoxProfile.setPreference("browser.download.manager.showAlertOnComplete", false);

firefoxProfile.setPreference("browser.download.manager.closeWhenDone", false);




}
	
	
//@Test(priority=41)

public void TrainingTemplates() {
	
driver.findElement(By.linkText("Coach Training Templates")).click();
	ws.waitForPageToLoad();
	
	
}
		
	

	
	
	
	
	
//@Test(priority=42)

public void Testimonies() {
	
	driver.findElement(By.id("testimonies")).click();
	ws.waitForPageToLoad();
	
	driver.findElement(By.id("Description")).sendKeys("Description");
	driver.findElement(By.id("btnTestimony")).click();
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod

    public void Logout() {
		
		
	lg.Logout();
}




@AfterClass 



public void close(){



	driver.quit();


}			
}
