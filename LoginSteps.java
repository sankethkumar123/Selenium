package StepDefination;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1076923\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
//	@Given("user navigates to login page")
//	public void user_navigates_to_login_page() {
//	
//		driver.get("https://ksrtc.in/oprs-web/login/show.do");
//	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
//		driver.get("https://ksrtc.in/oprs-web/login/show.do");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='/oprs-web/login/show.do']")).click();
		System.out.println("Inside Step - user is on login page");
		
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password()  throws Exception{
		//Thread.sleep(3000);
	    System.out.println("Inside Step - user enters username and password");
	    driver.findElement(By.xpath("/html/body/main/section/div/div/div/div/form/div/div/div/div[1]/input")).sendKeys("sruthiveggalam2@gmail.com");
	    driver.findElement(By.xpath("/html/body/main/section/div/div/div/div/form/div/div/div/div[2]/input")).sendKeys("Mounika@2622");
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Steps - clicks on login button");
		driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();
	}

	@Then("user should be taken to the successful login page")
	public void user_should_be_taken_to_the_successfull_login_page() throws Throwable{
		Thread.sleep(3000);
		WebElement askQuestionButton = driver.findElement(By.cssSelector(".col-md-8.main-booking-titile>h2"));
		((JavascriptExecutor)driver).executeScript("document.body.scrollIntoView", askQuestionButton);
//		Assert.assertEquals(true, askQuestionButton.isDisplayed());
		System.out.println("Inside Steps - user should be taken to the successful login page");
	}
	
	
	

	@Given("user should navigate to book your tickets now")
	public void user_should_navigate_to_book_your_tickets_now() {
		System.out.println("Inside Steps - user should navigate to book your tickets now");
		
	}

	@And("user enters Leaving From")
	public void user_enters_leaving_from() throws Throwable{
		//Thread.sleep(3000);
		WebElement askQuestionButton = driver.findElement(By.cssSelector(".col-md-8.main-booking-titile>h2"));
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400);");
		System.out.println("Inside steps - user enters leaving from");
		
		
//		 WebElement element = driver.findElement(By.cssSelector("#fromPlaceName"));
//		 Select sel = new Select(element);
//		 sel.selectByVisibleText("#routeSlider > div > div.carousel-item.active > div > div > ul > li:nth-child(7) > a");
		 WebElement element = driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[7]/a"));
//		 WebElement firstEle = sel.getFirstSelectedOption();
//		 System.out.println("first element = "+firstEle.getText());
		 element.click();
				
		
	}

	@And("user Enter Going to")
	public void enter_going_to() throws Throwable{
		System.out.println("Inside Steps - user enter Going to");
		
		
//		WebElement element = driver.findElement(By.cssSelector("#toPlaceName"));
//		Select sel = new Select(element);
//		sel.selectByVisibleText("#routeSlider > div > div.carousel-item.active > div > div > ul > li:nth-child(7) > a");
//		
//		WebElement firstEle = sel.getFirstSelectedOption();
//		System.out.println("first element = "+firstEle.getText());
		
		

	}

	@And("user select Date of Departure")
	public void select_date_of_departure() throws Throwable{
		System.out.println("Inside Steps - user select Date of Depaarture");
		driver.findElement(By.xpath("//tr[2]/td[@data-handler='selectDay']/a[text()='8']")).click();
		
	}

	@And("user Select Date of return")
	public void select_date_of_return() throws Throwable{
		System.out.println("Inside Steps - user select date of return");
	driver.findElement(By.xpath("//tr[2]/td[@data-handler='selectDay']/a[text()='9']")).click();
		
	}

	@Then("clicks on search for bus")
	public void clicks_on_search_for_bus() throws Throwable{
		System.out.println("Inside Steps - clicks on search for bus");
		driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg.btn-block.btn-booking")).click();
	}

	
}
