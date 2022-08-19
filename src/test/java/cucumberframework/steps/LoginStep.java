package cucumberframework.steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStep {
	
	WebDriver driver;

	@Before
	public void setup() {
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		System.setProperty("webdriver.gecko.driver","/Users/oksanakazimirova/Downloads/geckodriver");
		this.driver = new FirefoxDriver();
	}
	
@Given("User navigates to the Stackoverflow website")
public void user_navigates_to_the_stackoverflow_website() {
	 this.driver.get("http://stackoverflow.com"); 
}

@Given("User clicks on the Login button")
public void user_clicks_on_the_login_button() {
	this.driver.findElement(By.xpath("/html/body/header/div/ol[2]/li[3]/a")).click();
	}

@Given("User enters valid username")
public void user_enters_valid_username() {
	this.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("webdriveruniversity2@mail.com");
}

@Given("User enters valid password")
public void user_enters_valid_password() {
	this.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Yellow321!");;
}

@When("User clicks on the Submit")
public void user_clicks_on_the_submit() {
	this.driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
}
  

@Then("User is taken to home page successfully")
public void user_is_taken_to_home_page_successfully() {
	System.out.println("user_is_taken_to_home_page_successfuly ");     
	WebElement askQuestionButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[1]/div/a")); ///html/body/div[3]/div[2]/div[1]/div[1]/div/a
	assertEquals(true, askQuestionButton.isDisplayed());
	driver.close();
	
}
}

