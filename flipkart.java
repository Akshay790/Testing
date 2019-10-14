package webappliction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public final class flipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//create object
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.partialLinkText("New")).click();
		
	//	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9404244638");
	//	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/button")).click();//enter the mobile number
		
	//	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();//request to otp
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.name("q")).sendKeys("mobile");
	/* What is bug in search application ?
		1.give the any input in text filed to search(use any symbol)they search it.  
		*/
		driver.findElement(By.cssSelector("#container > div > div._3ybBIU > div._1tz-RS > div._3pNZKl > div.Y5-ZPI > form > div > button > svg")).click();
		
		Select price = new Select(driver.findElement(By.cssSelector("#container > div > div.t-0M7P._2doH3V > div._3e7xtJ > div > div:nth-child(1) > div > div > div > section._1MCcAi.D_NGuZ > div._3Uy12X > div._1qKb_B > select")));
		price.selectByValue("25000");
		
		List<WebElement> price1 = price.getOptions();
		for(WebElement ele : price1)
			{
				System.out.println(ele.getText());	
					
			}
		
		List<WebElement> checkbox1 = driver.findElements(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div/div/section[4]/div[2]/div/div[1]/div/div/label/div[2]"));
		
		for( WebElement ele : checkbox1)
		{
			if(!ele.isSelected())
			{
				ele.click();
			}
		}
		
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div/div/section[4]/div[2]/div/div[1]/div/div/label/div[2]"));
		
		if(checkbox.isDisplayed())
		{
			if(checkbox.isEnabled())
			{
				if(checkbox.isSelected()==true)
				{
					
					System.out.println("THE CHECK BOX SELEcted");
				}
				else
				{
					 System.out.println("THE CHECKBOX IS NOT SELECTED");
				}
			}
		}
		
	

	}

}
