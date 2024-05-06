package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDef {
	WebDriver driver;
	
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    
	}
	@When("User enters credentials")
	public void user_enters_credentials() {
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.cssSelector("input[name='username'")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
	
	}
	@Then("Should display success msg")
	public void should_display_success_msg() {
		boolean isDisp = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isDisp);
		driver.close();
		
	}

}
