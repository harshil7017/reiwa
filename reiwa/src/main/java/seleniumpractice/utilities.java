package seleniumpractice;

import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;



public class utilities {
static WebElement element;
static WebDriver driver;
	public static void setup(String brower) throws InterruptedException
	{
		
		if(brower.equals("chrome"))
		{
			
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				WebDriverWait wait=new WebDriverWait(driver,10);	
				driver.get("https://reiwa.com");
				String Expectedtext=driver.getCurrentUrl();
				System.out.println(Expectedtext);					
		}
		
		else if(brower.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			driver.get("https://reiwa.com");
		}
	}
	public static WebElement getElement(WebDriver driver,By locator)
	{
		
		WebElement element=driver.findElement(locator);
		return element;
		
	}
	public static void dosendkeys(WebDriver driver,By locator,String value)
	{
		WebElement test = getElement(driver, locator);
		test.sendKeys(value);
	}
	public static void onClick(WebDriver driver,By locator)
	{
		WebElement test1=getElement(driver, locator);
		test1.click();
	}
	
}
