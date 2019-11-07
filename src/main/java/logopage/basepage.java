package logopage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basepage {

	public static WebDriver driver;
	public String browser = "chrome";

	public basepage() {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome2.42\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 

		}
	

	public boolean elementFound(WebElement element) {
		boolean res = false;
		try {
			res = element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public void setText(WebElement element, String name) {
		if (name != null) {
			element.click();
			element.clear();
			element.sendKeys(name);
		}
		
	}
	public String getTitlte() {
		return driver.getTitle();
	}
}