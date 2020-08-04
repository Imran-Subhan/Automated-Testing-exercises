package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoLogin {
	
	@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
	private WebElement username;
	
	@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
	private WebElement password;
	
	@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
	private WebElement testLogin;
	
	@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	private WebElement CheckStatus;
	
	public DemoLogin(WebDriver driver) {
		
	}
	
	public void LoginUser() { 
		username.sendKeys("root");
		password.sendKeys("2020");
		testLogin.click();
		
	}
	public void LoginStatus() { 
		CheckStatus.isDisplayed();
		}
	}
	
