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
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class FlexTest {

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
			
	Loginpage.logintoCoach();
	

		
		}
		
@Test(priority=1)
	
	public void BasicProfile()
	{
		driver.findElement(By.id("FirstName")).sendKeys("");
		driver.findElement(By.id("LastName")).sendKeys("");
		driver.findElement(By.id("HomeNumber")).sendKeys("");
		driver.findElement(By.id("MobileNumber")).sendKeys("");
		driver.findElement(By.id("DateOfBirth")).sendKeys("");
		Select sel = new Select(driver.findElement(By.id("Gender")));
		sel.selectByIndex(1);
		
		driver.findElement(By.id("btnSubmit0")).click();
		
		
		
		
		
	}
		
		
		
	
@Test(priority=2)
	
	public void BackGroundProfile()	{
		
	driver.findElement(By.xpath("//*[@id='tab2']/a")).click();
	WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
	   wait.until(ExpectedConditions.visibilityOf(
    
			
	driver.findElement(By.id("Address1")))).sendKeys("");
	   driver.findElement(By.id("Address2")).clear();
	driver.findElement(By.id("Address2")).sendKeys("3450 Park lane");
	driver.findElement(By.id("City")).sendKeys("");
	driver.findElement(By.id("ZipCode")).sendKeys("",Keys.TAB,Keys.ARROW_DOWN,Keys.TAB,Keys.ARROW_DOWN);
	
	driver.findElement(By.id("btnSubmit1")).click();
	
	}
	
	
@Test(priority=3)
	
	public void SessionDetails()	{
		
	driver.findElement(By.xpath("//*[@id='tab4']/a")).click();
	WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
	   wait.until(ExpectedConditions.visibilityOf(
    
			
	driver.findElement(By.id("SessionDuration")))).sendKeys("1");
	   for(int i =0;i<=24;i++){
	driver.findElement(By.xpath("//*[@id='profile4']/div/div[1]/div[1]/div[2]/span/span/span/span[1]/span")).click();
	   }
	driver.findElement(By.id("SessionPlan")).sendKeys("1");
	
	
	for(int i =0;i<=10;i++){
		driver.findElement(By.xpath("//*[@id='divGroupSessionRate']/span/span/span/span[1]/span")).click();
		   }
	
	for(int i =0;i<=10;i++){
		driver.findElement(By.xpath("//*[@id='divGroupSessionAthleteCount']/span/span/span/span[1]/span")).click();
		   }
	
	
	
	
	
	Select sel = new Select(driver.findElement(By.id("Travel")));
	sel.selectByIndex(3);
	driver.findElement(By.xpath("//*[@id='profile4']/div/div[1]/div[3]/div/div/div/input")).sendKeys("Adults",Keys.ENTER);
	
	driver.findElement(By.id("btnSubmit")).click();
	
	
	}
	
	
	
	
	
@Test(priority=4)
		
		public void MyInbox()	{
			
		driver.findElement(By.linkText("My Inbox")).click();
		
	    ws.waitForPageToLoad();
				
		driver.findElement(By.xpath("//*[@id='profile1']/div[1]/div/div[2]/div/a")).click();
		  
		driver.findElement(By.id("Communication_CommunicationMessage")).sendKeys("Hi Player");
		
		
		driver.findElement(By.xpath("html/body/div/div/form/div/div/div[1]/div/div/button")).click();
		
		
		
		}
		
	
	
	
@Test(priority=5)
	
	public void MyTrainingPackage()	{
		
	driver.findElement(By.linkText("My Training Packages")).click();
	
    ws.waitForPageToLoad();
	
    driver.findElement(By.linkText("Add New")).click();
    
    driver.findElement(By.id("TrainingPackageName")).sendKeys("Bowling Package");
    
    for(int i =0;i<=10;i++){
		driver.findElement(By.xpath("//*[@id='myTabContent']/div/form/div/div[1]/div/div[1]/div[2]/div[1]/span[1]/span/span/span[1]/span")).click();
		   }
	
	for(int i =0;i<=10;i++){
		driver.findElement(By.xpath("//*[@id='myTabContent']/div/form/div/div[1]/div/div[1]/div[2]/div[2]/span[1]/span/span/span[1]/span")).click();
		   }
	
	for(int i =0;i<=2;i++){
		driver.findElement(By.xpath("//*[@id='myTabContent']/div/form/div/div[1]/div/div[1]/div[2]/div[3]/span/span/span/span[1]/span")).click();
		   }
	driver.findElement(By.id("TrainingPackageDescription")).sendKeys("I Will teach you high speed pace attack bowling with swing ");
	
	driver.findElement(By.id("btnSubmit")).click();
	}
	
	
	
@Test(priority=6)
	
	public void MyTrainingPackageEdit()	{
		
	driver.findElement(By.linkText("My Training Packages")).click();
	
    ws.waitForPageToLoad();
	
    driver.findElement(By.linkText("Edit")).click();
    
    driver.findElement(By.id("TrainingPackageName")).sendKeys("Bowling Package");
    
    for(int i =0;i<=10;i++){
		driver.findElement(By.xpath("//*[@id='myTabContent']/div/form/div/div[1]/div/div[1]/div[2]/div[1]/span[1]/span/span/span[1]/span")).click();
		   }
	
	for(int i =0;i<=10;i++){
		driver.findElement(By.xpath("//*[@id='myTabContent']/div/form/div/div[1]/div/div[1]/div[2]/div[2]/span[1]/span/span/span[1]/span")).click();
		   }
	
	for(int i =0;i<=2;i++){
		driver.findElement(By.xpath("//*[@id='myTabContent']/div/form/div/div[1]/div/div[1]/div[2]/div[3]/span/span/span/span[1]/span")).click();
		   }
	driver.findElement(By.id("TrainingPackageDescription")).sendKeys("I Will teach you high speed pace attack bowling with swing ");
	driver.findElement(By.id("btnSubmit")).click();
	
	}
@Test(priority=7)
	
	public void MyTrainingPackageDelete()	{
		
	driver.findElement(By.linkText("My Training Packages")).click();
	
    ws.waitForPageToLoad();
	
    driver.findElement(By.linkText("Delete")).click();
	
       
    Alert alert=driver.switchTo().alert();		
    		
    // Capturing alert message.    
    String alertMessage=driver.switchTo().alert().getText();	
    System.out.println(alertMessage);	
    alert.accept();
    
}
	
	
@Test(priority=8)

public void AddMyTrainingLocation()	{
	
driver.findElement(By.linkText("My Training Packages")).click();

ws.waitForPageToLoad();

driver.findElement(By.xpath("//*[@id='tab2']/a")).click();

driver.findElement(By.id("btnNewCoachLocation")).click();
 
driver.findElement(By.id("Name")).sendKeys("American Fitness Center");
driver.findElement(By.id("Addr1")).sendKeys("6301 Stonewood Dr");
driver.findElement(By.id("Addr2")).sendKeys("Street no3");
driver.findElement(By.id("City")).sendKeys("Plano");
driver.findElement(By.id("ZipCode")).sendKeys("75024",Keys.TAB,Keys.ARROW_DOWN,Keys.TAB,Keys.ARROW_DOWN);
driver.findElement(By.id("btnAddLocation")).click();
}
    
@Test(priority=9)

public void MyTrainingLocationUpdate()	{
	
driver.findElement(By.linkText("My Training Packages")).click();

ws.waitForPageToLoad();

driver.findElement(By.xpath("//*[@id='tab2']/a")).click();

driver.findElement(By.linkText("Update")).click();
driver.findElement(By.id("Name")).clear();
driver.findElement(By.id("Name")).sendKeys("American Fitness Center");
driver.findElement(By.id("Addr1")).clear();
driver.findElement(By.id("Addr1")).sendKeys("6301 Stonewood Dr");
driver.findElement(By.id("Addr2")).clear();
driver.findElement(By.id("Addr2")).sendKeys("Street no3");
driver.findElement(By.id("City")).clear();
driver.findElement(By.id("City")).sendKeys("Plano");
driver.findElement(By.id("ZipCode")).clear();
driver.findElement(By.id("ZipCode")).sendKeys("75024",Keys.TAB,Keys.ARROW_DOWN,Keys.TAB,Keys.ARROW_DOWN);
	
driver.findElement(By.id("btnAddLocation")).click();

	
	
}
@Test(priority=10)

public void MyTrainingLocationDelete()	{
	
driver.findElement(By.linkText("My Training Packages")).click();

ws.waitForPageToLoad();	
	
driver.findElement(By.linkText("Delete")).click();

Alert alert=driver.switchTo().alert();		
		  
String alertMessage=driver.switchTo().alert().getText();	
System.out.println(alertMessage);	
alert.accept();
}	
	
	
//++++++++++++++++++++++++++++++++++++++Workout videos++++++++++++++++++	
	
	
@Test(priority=11)

public void WorkOutVideosSearch() throws InterruptedException	{
	
driver.findElement(By.linkText("Workout Videos")).click();

ws.waitForPageToLoad();
driver.findElement(By.xpath("//*[@id='gridWO']/div[1]/div/div/div[2]/span/span")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='wocategories_option_selected']")).click();

driver.navigate().refresh();
}
	
@Test(priority=12)

public void WorkOutVideoSteps() 	{
	
driver.findElement(By.linkText("Workout Videos")).click();

ws.waitForPageToLoad();

driver.findElement(By.linkText("Steps")).click();

driver.navigate().refresh();



}
	
@Test(priority=13)

public void WorkOutVideo() 	{
	
driver.findElement(By.linkText("Workout Videos")).click();

ws.waitForPageToLoad();

driver.findElement(By.linkText("Video")).click();

driver.navigate().refresh();



}
//========================================================================Assign Workouts=========================	
	
@Test(priority=14)

public void AssignWorkouts() throws InterruptedException 	{
	
driver.findElement(By.linkText("Assign Workouts")).click();

ws.waitForPageToLoad();

driver.findElement(By.xpath("html/body/div[1]/div//*[@id='assignWorkoutForm']/div/div[1]/div/a")).click();



driver.findElement(By.xpath("html/body/div[1]/div//*[@id='membersList']/div[2]/div/label/span[3]")).click();

driver.findElement(By.xpath("//*[@id='assignWorkoutForm']/div/div[2]/div[1]/div/span/span")).click();
WebDriverWait wait = new WebDriverWait(Browser.driver,20);
wait.until(ExpectedConditions.visibilityOf(
driver.findElement(By.xpath("//*[@id='wocategories_listbox']/li[4]")))).click();
Thread.sleep(3000);
driver.findElement(By.id("assignWorkoutForm")).click();

Thread.sleep(4000);

WebDriverWait wait1 = new WebDriverWait(Browser.driver,20);
wait1.until(ExpectedConditions.visibilityOf(
driver.findElement(By.xpath("//*[@id='workouts_listbox']/li[4]")))).click();

driver.findElement(By.id("btnAssign")).click();
}	
	
//-------------------------------------------------------------MyMembers----------------------------------------------------------------------------

 @Test(priority=15)

public void MyMembers()  	{
	
driver.findElement(By.linkText("My Members")).click();

ws.waitForPageToLoad();
     
driver.findElement(By.id("btnNewMember")).click();

driver.findElement(By.id("FirstName")).sendKeys("Jonathan");
driver.findElement(By.id("LastName")).sendKeys("Smith");
driver.findElement(By.id("Email")).sendKeys("Smith@gmail.com");
driver.findElement(By.id("btnClose")).click();
driver.findElement(By.id("btnSave")).click();
}
	
@Test(priority=16)

public void MyMembersContact()  	{
	
driver.findElement(By.linkText("My Members")).click();

ws.waitForPageToLoad();
     
driver.findElement(By.linkText("Contact")).click();

ws.waitForPageToLoad();

driver.findElement(By.id("Communication_CommunicationMessage")).sendKeys("Hi Player");

driver.findElement(By.xpath("html/body/div/div/form/div/div/div[1]/div/div/button")).click();
}
	
@Test(priority=17)

public void MyMembersEdit()  	{
	
driver.findElement(By.linkText("My Members")).click();

ws.waitForPageToLoad();
     
driver.findElement(By.linkText("Edit")).click();
	
for(int i =0;i<=10;i++){
	driver.findElement(By.xpath(".//*[@id='memberAssesmentWin']/form/div[1]/div/div[1]/div[2]/span/span/span/span[1]/span")).click();
	   }

driver.findElement(By.id("btnSave_assessment")).click();
}


@Test(priority=18)

public void MyMembersAssign() throws InterruptedException  	{
	
driver.findElement(By.linkText("My Members")).click();

ws.waitForPageToLoad();
     
driver.findElement(By.linkText("Assign")).click();
ws.waitForPageToLoad();
driver.findElement(By.xpath("//*[@id='content']/div/div/input")).click();

driver.findElement(By.xpath("//*[@id='content']/div/div/input")).sendKeys("",Keys.ARROW_DOWN,Keys.ENTER);

driver.findElement(By.id("btnClose")).click();

driver.findElement(By.id("btnSubmitTemplate")).click();

}
  
	
//@Test(priority=19)

public void MyMembersDelete()  	{
	
driver.findElement(By.linkText("My Members")).click();

ws.waitForPageToLoad();
     
driver.findElement(By.linkText("Delete")).click();
ws.waitForPageToLoad();

}
/////////////////////////////////////////////////////////////////////Events///////////////////////////////////////////////////////

@Test(priority=20)

public void AddEventsWithInvalidDates() throws InterruptedException  	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	for(int i=0;i<2;i++)
	{
	driver.findElement(By.id("btnNewEvent")).click();
	}

	Select sel = new Select(driver.findElement(By.id("FitnessEventCategoryId")));
	sel.selectByIndex(1);
	
	driver.findElement(By.id("Title")).sendKeys("Bowling Practice");
	driver.findElement(By.id("Description")).sendKeys("Bowling for leg Spin");
	for(int i=0;i<33;i++)
	{
	driver.findElement(By.xpath("//*[@id='createFitnessEventWin']/form/div[1]/div[2]/div[1]/span[1]/span/span/span[1]/span")).click();
	
	}
	
	for(int i=0;i<33;i++)
	{
	driver.findElement(By.xpath("//*[@id='createFitnessEventWin']/form/div[1]/div[2]/div[2]/span/span/span/span[1]/span")).click();
	
	}
	
	
	
	driver.findElement(By.id("EarlyBirdCutOffDate")).sendKeys("6/1/2017");
	
	driver.findElement(By.xpath("//*[@id='createFitnessEventWin']/form/div[1]/div[3]/div[1]/div/label/span[3]")).click();
	
	driver.findElement(By.xpath("//*[@id='createFitnessEventWin']/form/div[1]/div[3]/div[2]/div/label/span[3]")).click();
	
	
	driver.findElement(By.id("StartDate")).sendKeys("6/1/2017 12:00 AM");
	
	driver.findElement(By.id("EndDate")).sendKeys("5/16/2017 12:00 AM");
	
	driver.findElement(By.xpath("//*[@id='createFitnessEventWin']/form/div[1]/div[4]/div[3]/div/div/input")).click();
	driver.findElement(By.xpath("//*[@id='createFitnessEventWin']/form/div[1]/div[4]/div[3]/div/div/input")).sendKeys("",Keys.ARROW_DOWN,Keys.ENTER);
	
	
	for(int i=0;i<12;i++)
	{
	driver.findElement(By.xpath(".//*[@id='createFitnessEventWin']/form/div[1]/div[5]/div[1]/span/span/span/span[1]/span")).click();
}
	Thread.sleep(9000);
	driver.findElement(By.id("btnAddEvent")).click();

	//driver.findElement(By.id("btnClose")).click();
	
	
	
}






 @Test(priority=21)

public void AddEventsWithvalidDates() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	for(int i=0;i<2;i++)
	{
	driver.findElement(By.id("btnNewEvent")).click();
	}

	Select sel = new Select(driver.findElement(By.id("FitnessEventCategoryId")));
	sel.selectByIndex(1);
	
	driver.findElement(By.id("Title")).sendKeys("Bowling Practice");
	driver.findElement(By.id("Description")).sendKeys("Bowling for leg Spin");
	for(int i=0;i<33;i++)
	{
	driver.findElement(By.xpath("//*[@id='createFitnessEventWin']/form/div[1]/div[2]/div[1]/span[1]/span/span/span[1]/span")).click();
	
	}
	
	for(int i=0;i<33;i++)
	{
	driver.findElement(By.xpath("//*[@id='createFitnessEventWin']/form/div[1]/div[2]/div[2]/span/span/span/span[1]/span")).click();
	
	}
	
	
	
	driver.findElement(By.id("EarlyBirdCutOffDate")).sendKeys("6/1/2017");
	
	driver.findElement(By.xpath("//*[@id='createFitnessEventWin']/form/div[1]/div[3]/div[1]/div/label/span[3]")).click();
	
	driver.findElement(By.xpath("//*[@id='createFitnessEventWin']/form/div[1]/div[3]/div[2]/div/label/span[3]")).click();
	
	
	driver.findElement(By.id("StartDate")).sendKeys("6/1/2017 12:00 AM");
	
	driver.findElement(By.id("EndDate")).sendKeys("7/16/2017 12:00 AM");
	
	driver.findElement(By.xpath("//*[@id='createFitnessEventWin']/form/div[1]/div[4]/div[3]/div/div/input")).click();
	driver.findElement(By.xpath("//*[@id='createFitnessEventWin']/form/div[1]/div[4]/div[3]/div/div/input")).sendKeys("",Keys.ARROW_DOWN,Keys.ENTER);
	
	
	for(int i=0;i<12;i++)
	{
	driver.findElement(By.xpath(".//*[@id='createFitnessEventWin']/form/div[1]/div[5]/div[1]/span/span/span/span[1]/span")).click();
}
	
	driver.findElement(By.id("btnAddEvent")).click();

	//driver.findElement(By.id("btnClose")).click();
	
}
	
	
	
	
	
@Test(priority=22)

public void AddEventsupdate() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.linkText("Update")).click();
	

	Select sel = new Select(driver.findElement(By.id("FitnessEventCategoryId")));
	sel.selectByIndex(1);
	driver.findElement(By.id("Title")).clear();
	driver.findElement(By.id("Title")).sendKeys(" High pace");
	driver.findElement(By.id("Description")).clear();
	driver.findElement(By.id("Description")).sendKeys(" and Fielding");

	driver.findElement(By.id("btnAddEvent")).click();
}
	
	
	
@Test(priority=23)

public void AddEventDelete() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.linkText("Delete")).click();
	
	Alert alert=driver.switchTo().alert();		
	  
	String alertMessage=driver.switchTo().alert().getText();	
	System.out.println(alertMessage);	
	alert.accept();
	
}
	
	
	
	

@Test(priority=24)

public void AddEventLocation() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab2']/a")).click();
	driver.findElement(By.id("btnNewEventLocation")).click();
	
	driver.findElement(By.id("LocationName")).sendKeys("American Fitness Center");
	driver.findElement(By.id("Addr1")).sendKeys("6301 Stonewood Dr");
	driver.findElement(By.id("Addr2")).sendKeys("Street no3");
	driver.findElement(By.id("City")).sendKeys("Plano");
	driver.findElement(By.id("ZipCode")).sendKeys("75024");
	driver.findElement(By.id("btnAddLocation")).click();
}


 @Test(priority=25)

           public void EventLocationUpdate() 	{
	
          driver.findElement(By.linkText("Events")).click();
	      ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab2']/a")).click();
	driver.findElement(By.linkText("Update")).click();
	
	driver.findElement(By.id("LocationName")).sendKeys(" RVP");
	driver.findElement(By.id("Addr1")).sendKeys("p");
	driver.findElement(By.id("Addr2")).sendKeys("1");
	driver.findElement(By.id("City")).sendKeys("");
	driver.findElement(By.id("ZipCode")).sendKeys("");
	driver.findElement(By.id("btnAddLocation")).click();
}

@Test(priority=26)

public void EventLocationDelete() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab2']/a")).click();
	driver.findElement(By.linkText("Delete")).click();
	
	Alert alert=driver.switchTo().alert();		
	  
	String alertMessage=driver.switchTo().alert().getText();	
	System.out.println(alertMessage);	
	alert.accept();
	
	
}
	
	
@Test(priority=27)

public void AddEventTravel() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab3']/a")).click();
	driver.findElement(By.id("btnNewTravelInfo")).click();
	driver.findElement(By.id("HotelOptions")).sendKeys("HotelOptions");
	driver.findElement(By.id("AirportOptions")).sendKeys("AirportOptions");
	driver.findElement(By.id("GroundTransportation")).sendKeys("GroundTransportation");
	driver.findElement(By.id("btnAddLocation")).click();
	
	
}
	
@Test(priority=28)

public void AddEventTravelUpdate() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab3']/a")).click();
	driver.findElement(By.linkText("Update")).click();
	driver.findElement(By.id("HotelOptions")).sendKeys("HotelOptions");
	driver.findElement(By.id("AirportOptions")).sendKeys("AirportOptions");
	driver.findElement(By.id("GroundTransportation")).sendKeys("GroundTransportation");
	driver.findElement(By.id("btnAddLocation")).click();
	
	
}
	
@Test(priority=29)

public void AddEventTravelDelete() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab3']/a")).click();
	driver.findElement(By.linkText("Delete")).click();
	
	Alert alert=driver.switchTo().alert();		
	  
	String alertMessage=driver.switchTo().alert().getText();	
	System.out.println(alertMessage);	
	alert.accept();
	
	
}
	
@Test(priority=30)

public void AdddEventCoaches() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab4']/a")).click();
	
	driver.findElement(By.id("btnNewCoach")).click();
	
	driver.findElement(By.id("FirstName")).sendKeys("Ben");
	driver.findElement(By.id("LastName")).sendKeys("Stokes");
	driver.findElement(By.id("Email")).sendKeys("Sime@gmail.com");
	driver.findElement(By.id("MobileNumber")).click();
	driver.findElement(By.id("MobileNumber")).sendKeys("8054143933");
	driver.findElement(By.id("HomeNumber")).click();
	
	driver.findElement(By.id("HomeNumber")).sendKeys("234");
	driver.findElement(By.id("AboutMe")).sendKeys("i am Expert in Cricket");
	
	Select sel =new Select(driver.findElement(By.id("Gender")));
	sel.selectByIndex(1);
	
	driver.findElement(By.id("btnAddLocation")).click();
	
}
	
@Test(priority=31)

public void EventCoachesUpdate() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab4']/a")).click();
	
	driver.findElement(By.linkText("Update")).click();
	
	driver.findElement(By.id("FirstName")).sendKeys("Ben");
	driver.findElement(By.id("LastName")).sendKeys("Stokes");
	
	driver.findElement(By.id("MobileNumber")).click();
	driver.findElement(By.id("MobileNumber")).clear();
	driver.findElement(By.id("MobileNumber")).sendKeys("8904977827");
	
	

	
	driver.findElement(By.id("btnAddLocation")).click();
	
}

@Test(priority=32)

public void EventCoachesDelete() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab4']/a")).click();
	
	driver.findElement(By.linkText("Delete")).click();
	
	Alert alert=driver.switchTo().alert();		
	  
	String alertMessage=driver.switchTo().alert().getText();	
	System.out.println(alertMessage);	
	alert.accept();
	
}

@Test(priority=33)

public void AdddEventSessionInfo() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab5']/a")).click();
	
	driver.findElement(By.id("btnNewSessionInfo")).click();
	
	driver.findElement(By.id("StartTime")).sendKeys("7/7/2017 12:00 AM");
	driver.findElement(By.id("EndTime")).sendKeys("7/28/2017 12:00 AM");
	driver.findElement(By.id("SessionDescription")).sendKeys("Session Description");
	driver.findElement(By.id("btnAddLocation")).click();
}     
@Test(priority=34)

public void EventSessionInfoupdate() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab5']/a")).click();
	
	driver.findElement(By.linkText("Update")).click();
	
	driver.findElement(By.id("StartTime")).clear();
	driver.findElement(By.id("StartTime")).sendKeys("7/8/2017 12:00 AM");
	driver.findElement(By.id("SessionDescription")).clear();
	driver.findElement(By.id("SessionDescription")).sendKeys("   Session Description");
	driver.findElement(By.id("btnAddLocation")).click();
}     	
	
@Test(priority=35)

public void EventSessionInfoDelete() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab5']/a")).click();
	
	driver.findElement(By.linkText("Delete")).click();	
	
	Alert alert=driver.switchTo().alert();		
	  
	String alertMessage=driver.switchTo().alert().getText();	
	System.out.println(alertMessage);	
	alert.accept();
	
}
	
	
	
@Test(priority=36)

public void AdddEventFAQ() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab6']/a")).click();
	
	driver.findElement(By.id("btnNewFAQ")).click();
	
	driver.findElement(By.id("Question")).sendKeys("Question");
	driver.findElement(By.id("Answer")).sendKeys("Answer");

	driver.findElement(By.id("btnAddLocation")).click();
}     
	
@Test(priority=37)

public void EventFAQUpdate() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab6']/a")).click();
	
	driver.findElement(By.linkText("Update")).click();
	
	driver.findElement(By.id("Question")).sendKeys(" Question");
	driver.findElement(By.id("Answer")).sendKeys("  Answer");

	driver.findElement(By.id("btnAddLocation")).click();
}     
	
@Test(priority=38)

public void EventFAQDelete() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab6']/a")).click();
	
	driver.findElement(By.linkText("Delete")).click();
	
	Alert alert=driver.switchTo().alert();		
	  
	String alertMessage=driver.switchTo().alert().getText();	
	System.out.println(alertMessage);	
	alert.accept();
}     

@Test(priority=39)

public void CheckEventMembers() 	{
	
driver.findElement(By.linkText("Events")).click();
	ws.waitForPageToLoad();
	
	
	driver.findElement(By.xpath("//*[@id='tab7']/a")).click();
	
	
}     	
//----------------------------------------------------------------------------virtual training plans-------------------------------------------------	

	
@Test(priority=40)

public void virtualtrainingplans() 	{
	
driver.findElement(By.id("virtualtrainingplans")).click();
	ws.waitForPageToLoad();
	
	
}
	
	
@Test(priority=41)

public void TrainingTemplates() {
	
driver.findElement(By.id("trainingtemplates")).click();
	ws.waitForPageToLoad();
	
	
}
		
	

	
	
	
	
	
@Test(priority=42)

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