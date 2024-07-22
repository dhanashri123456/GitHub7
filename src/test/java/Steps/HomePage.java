package Steps;

import org.junit.Assert;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePage extends BaseClass{
	@When("user is on home page and validate home page title")
	public void user_is_on_home_page_and_validate_home_page_title() {
		String title=driver.getTitle();
	   Assert.assertEquals(title, "OrangeHRM");
	}

	@Then("validate home page url")
	public void validate_home_page_url() {
		String url=driver.getCurrentUrl();
		   Assert.assertEquals(url.contains("orangehrm"), true);
	}
}
