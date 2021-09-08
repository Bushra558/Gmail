package stepdef;

import org.openqa.selenium.By;
import io.cucumber.core.cli.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	WebDriver driver= null;
    
	@Given("user is on the Google search page")
	public void user_is_on_the_google_search_page() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selinium\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
	    
	}

	@When("user opens Gmail")
	public void user_opens_gmail() {
		driver.get("https://mail.google.com/");
	    
	}

	@And("user provides {string} ")
	public void user_provides_and(String string1, String string2) {
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("bushra.zafar306@gmail.com");  
		driver.findElement(By.xpath("//div[@class=\"VfPpkd-RLmnJb\"]")).click();
		
	}
	
	@And("user provides {string}")
	public void user_provides(String string) {
		driver.findElement(By.xpath("//div[@class=\"i9lrp mIZh1c\"]")).sendKeys("Bushr@0896");
	}

	@Then("login should be successfull")
	public void login_should_be_successfull() {
	    System.out.println("login successfull");
	}

}
