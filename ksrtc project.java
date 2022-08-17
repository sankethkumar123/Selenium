package StepDefination;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login2 {
WebDriver driver;
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1076923\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\resources\\chromedriver.exe");
	this.driver = new ChromeDriver();
	this.driver.manage().window().maximize();
	this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	driver.get("https://www.ksrtc.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}

   @Given("user is on login page")
public void user_is_on_login_page() {
	driver.get("https://ksrtc.in/oprs-web/login/show.do");
	System.out.println("Inside Step - user is on login page");
	
}


    @When("user enters username and password")
public void user_enters_username_and_password() throws Exception{
	Thread.sleep(3000);
	System.out.println("Inside Step - user enters username and password");
	driver.findElement(By.id("#userName")).sendKeys("sruthiveggalam2@gmail.com");
driver.findElement(By.cssSelector("#bookingsForm > div > div > div > div:nth-child(3) > label")).sendKeys("MONIKA3@2622");

	
}



}
