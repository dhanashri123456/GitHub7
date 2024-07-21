package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void initialization() {
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(55));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
