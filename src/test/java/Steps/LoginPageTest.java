package Steps;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest extends BaseClass{

@Given("user is on login page")
public void user_is_on_login_page() {
	   BaseClass.initialization();
}
@When("user enter username and password")
public void user_enter_username_and_password() {
	  driver.findElement(By.name("username")).sendKeys("Admin");
	   driver.findElement(By.name("password")).sendKeys("admin123"); 
}
@Then("user clickon login button")
public void user_clickon_login_button() {
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
}

}
