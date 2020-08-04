package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoHome {

	public final static String url= "http://thedemosite.co.uk/index.php";
	
	private WebDriver driver;
	
	//2
		@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")
		private WebElement AddUserpage;
		
		//3
		@FindBy (xpath="/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
		private WebElement Loginpage;
		
		
		
		//7 
		
		
	//1
	public DemoHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void navtoAddUser() {
		AddUserpage.click();
	}
	
	public void navtoLogin() {
		Loginpage.click();
	}
}
