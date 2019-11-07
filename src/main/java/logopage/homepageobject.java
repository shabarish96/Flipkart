package logopage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobject extends basepage {

	public homepageobject () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dresstab;
	
	public WebElement getdresstab() {
		return dresstab;
	}
	
	public void clickdresstab() {
	dresstab.click();
		
	}
}
