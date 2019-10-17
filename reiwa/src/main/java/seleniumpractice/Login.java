package seleniumpractice;



import static org.junit.Assert.assertNotNull;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login {

	

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver = null;
		utilities.setup("chrome");
		utilities.setup("Firefox");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
	
		
		By log=By.linkText("Login");
		utilities.onClick(driver, log);
		By email=By.xpath("//input[@type='text' and @id='ctl00_uxContentHolder_ucMyAccount_ucMyAccountLogin_txtLoginEmail']");
		By password=By.id("ctl00_uxContentHolder_ucMyAccount_ucMyAccountLogin_txtLoginPassword");
		By login=By.id("ctl00_uxContentHolder_ucMyAccount_ucMyAccountLogin_btnLogin");
		
		utilities.dosendkeys(driver,email,"harshilsheth@outlook.com");
		utilities.dosendkeys(driver, password, "Sheth02@");
		utilities.onClick(driver, login);
	
	}
	

}
