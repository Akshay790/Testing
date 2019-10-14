package webappliction;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MakeMyTrip {
	public static void main (String[] args){
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");//launch browser
		
		WebDriver driver = new ChromeDriver();//crrate object
		
		driver.get("https://www.makemytrip.com"); //launch browser
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("//*[@id='SW']/div[2]/div[1]/ul/li[6]/div/p")).click();//click on create account and login link 
		 
		driver.findElement(By.xpath("//*[@id='SW']/div[2]/div[2]/div[2]/section/div[2]/p/span[2]/a")).click();//click on create account
		
		driver.findElement(By.id("emailOrPhone")).sendKeys("akshaydesai790@gmail.com");//user name
		
		driver.findElement(By.id("password")).sendKeys("Akshaydesai790@");
		
		driver.findElement(By.xpath("//*[@id='SW']/div[2]/div[2]/div[2]/section/form/div[2]/div/a")).click();//show password
		
		driver.findElement(By.cssSelector("#SW > div.landingContainer > div.headerOuter > div.modal.displayBlock.modalLogin.modalCreateAccount.personal > section > form > div.btnContainer.appendBottom25 > button")).click();
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		//LOGIN 
		driver.findElement(By.xpath("//*[@id='SW']/div[2]/div[2]/div[2]/section/div[2]/p/span[2]/a")).click();
		
	 //	driver.findElement(By.className("pushRight modalResetBtn font12 appendRight5")).click();
		
		driver.findElement(By.linkText("Reset Password")).click();
		
		//driver.findElement(By.name("resetEmailPass")).sendKeys("akshaydesai790@gmail.com");
		
		//driver.findElement(By.xpath("//*[@id='SW']/div[2]/div[2]/div[2]/section/form/div[2]/button/span")).click();
		
		driver.findElement(By.xpath("//*[@id='SW']/div[2]/div[2]/div[2]/section/p/a")).click();
		
		driver.findElement(By.id("username")).sendKeys("akshaydesai790@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Akshaydesai790@");
		
		driver.findElement(By.cssSelector("#SW > div.landingContainer > div.headerOuter > div.modal.displayBlock.modalLogin.dynHeight.personal > section > form > div.btnContainer.appendBottom25 > button > span")).click();
		
	
		
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[1]/label/span")).click();
		
		WebElement menu =driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		Actions actions = new Actions(driver);//move and select pune city from drop down menu
		actions.moveToElement(menu).perform();
		driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-4']/div/div[1]/p[1]")).click();
		
		
		WebElement menu1 = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(menu1).perform();
		driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-17']/div/div[1]/p[2]")).click();
		
		WebElement menu3 = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[1]/div/div[1]/p/span[2]"));
		Actions actions3=new Actions(driver);//select date start
		actions3.moveToElement(menu3).perform();
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[7]/div/p[2]")).click();
		
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[4]/div/label/span")).click();
		WebElement menu4 = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div"));
		Actions actions4=new Actions(driver);//select return date
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[2]/div/p")).click();
		
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[5]/label/p[1]")).click();
		
		WebElement Adults = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[5]/div[1]/div/p[1]"));
		Actions actions5= new Actions(driver);//select Adults 
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[5]/div[1]/div/ul[1]/li[3]")).click();
		
		WebElement child =driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[5]/div[1]/div/div/div[1]/p"));
		Actions actions6= new Actions(driver);
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[5]/div[1]/div/div/div[1]/ul/li[1]"));
		
		WebElement TravelClass = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[5]/div[1]/div/p[2]"));
		Actions actions7=new Actions(driver);
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[5]/div[1]/div/ul[2]/li[4]")).click();
		
		driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div > div.fsw.widgetOpen > div.fsw_inner.interNational > div.fsw_inputBox.flightTravllers.inactiveWidget.activeWidget > div.travellers > button")).click();
		
		
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[6]/label/span")).click();
		Actions actions8= new Actions(driver);//select travelling for
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[6]/ul/li[3]")).click();
		
		driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div > div.fsw > p > a")).click();
	}
	
	
	

}
