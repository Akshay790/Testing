package webappliction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mahatender {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();//create object
			
			driver.get("https://mahatenders.gov.in/nicgep/app");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			driver.findElement(By.id("DirectLink_20")).click();//click and open registration form
			driver.findElement(By.name("EmailId")).sendKeys("akshaydesai790@gmail.com");
			driver.findElement(By.name("Email")).sendKeys("akshaydesai790@gmail.com");
			driver.findElement(By.id("Mobile")).sendKeys("123456789");
			
			
			driver.findElement(By.name("CompanyName")).click();
			driver.findElement(By.name("privilegeYes")).click();
			
			Select DropDown = new Select(driver.findElement(By.name("privilegeType")));
			DropDown.selectByVisibleText("MSME");
		
			
			
			driver.findElement(By.id("RegNumber")).sendKeys("123456789");
			driver.findElement(By.id("RegisteredAddress")).sendKeys("Satara");
			driver.findElement(By.id("CorporateAddress")).sendKeys("SATARA");
			
			WebElement radiobut = driver.findElement(By.name("bidderType"));
				
			if (radiobut.isDisplayed())
			{
				if(radiobut.isEnabled())
				{
					if(radiobut.isSelected()==true)
					{
						System.out.println("RADIO BUTTON IS SELECTED");
					}
					else 
					{
						System.out.println("RADIO BUTTON IS NOT SELECTED");	
					}
					}
				}
			driver.findElement(By.name("city")).sendKeys("SATARA");
			
			Select DropDown1 = new Select(driver.findElement(By.name("StatesName")));
			DropDown1.selectByIndex(27);
			
			List<WebElement>Dropdown = DropDown1.getOptions();
			
			for(WebElement ele : Dropdown)
			{
				System.out.println(ele.getText());
			}
			
			driver.findElement(By.name("PostalCode")).sendKeys("415002");
			driver.findElement(By.id("PanNumber")).sendKeys("AESTG2458A");
			
			Select year = new Select(driver.findElement(By.name("EstablishYear")));
			year.selectByVisibleText("2016");//year select
			
			List<WebElement>Year = year.getOptions();
			for(WebElement ele : Year)
			{
				System.out.println(ele.getText());//display year
			}
			
			driver.findElement(By.id("BusinessNatures")).sendKeys("CIVIL");
			
			Select status = new Select(driver.findElement(By.id("LegalStatus")));
			status.selectByIndex(4);
			List<WebElement> Status1 = status.getOptions();
			for(WebElement ele : Status1)
			{
				System.out.println(ele.getText());
			}
			
			
			Select category = new Select(driver.findElement(By.id("BidderCategory")));
			category.selectByIndex(2);
			
			Select Title = new Select(driver.findElement(By.id("title")));
			Title.selectByIndex(2);
			
			List<WebElement> Title1 = Title.getOptions();
			for(WebElement ele : Title1)
			{
				System.out.println(ele.getText());
			}
			
			
			driver.findElement(By.name("ContactName")).sendKeys("Akshay desai");
			
			WebElement date = driver.findElement(By.name("dateOfBirth"));
			Actions action = new Actions(driver);
			action.moveToElement(date).perform();
			driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[2]/a/img")).click();
				
			Select MM = new Select(driver.findElement(By.xpath("//*[@id='Body']/div[2]/div[1]/table/tbody/tr/td[2]/select")));
			MM.selectByIndex(1);
			
			Select YY = new Select(driver.findElement(By.xpath("//*[@id='Body']/div[2]/div[1]/table/tbody/tr/td[3]/select")));
			YY.selectByVisibleText("1996"); 
			
			WebElement DD = driver.findElement(By.xpath("//*[@id='Body']/div[2]/div[2]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(DD).perform();
			driver.findElement(By.xpath("//*[@id='Body']/div[2]/div[2]/table/tbody/tr[3]/td[4]")).click();

			
			driver.findElement(By.name("Designation")).sendKeys("MD");
			
			
			
			
		}
	}
			
			
			

	

