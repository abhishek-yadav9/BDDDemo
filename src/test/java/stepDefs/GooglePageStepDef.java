package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDef {
	
	WebDriver driver;
	@Given("User is on Google home page")
	public void user_is_on_google_home_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		 
	
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
		WebElement srchBox = driver.findElement(By.className("gLFyf"));
		  srchBox.sendKeys("Java Tutorial");
		  srchBox.submit();
	}
	@Then("Should display Java Tutorial page")
	public void should_display_java_tutorial_page() {
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	}
	
	
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		WebElement srchBox = driver.findElement(By.className("gLFyf"));
		  srchBox.sendKeys("Selenium Tutorial");
		  srchBox.submit();
	}
	@Then("Should display Selenium Tutorial page")
	public void should_display_selenium_tutorial_page() {
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	}

}
