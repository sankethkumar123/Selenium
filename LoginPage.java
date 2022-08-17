package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {
	WebDriver driver;
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1076923\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		
		driver.get("https://www.ksrtc.in/");
		driver.get("https://ksrtc.in/oprs-web/login/show.do");
		
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).click();
		
	}
	
	

	
	
	
	
	
	
	
	
	
   
		

}
