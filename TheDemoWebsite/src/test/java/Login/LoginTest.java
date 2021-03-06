package Login;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {

	    private WebDriver driver;

	    @Before
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1366, 768));

	    }

	    @Test
	    public void test() throws InterruptedException {
	        driver.get(DemoHome.url);
	        DemoHome Website = new DemoHome(driver);
	        DemoAddUser DemoAddUserpage = PageFactory.initElements(driver, DemoAddUser.class);
	        DemoLogin DemoLoginpage = PageFactory.initElements(driver,DemoLogin.class);
	        
	        Website.navtoAddUser();
	        DemoAddUserpage.AddUser();
	        
	        Website.navtoLogin();
	        DemoLoginpage.LoginUser();
	        DemoLoginpage.LoginStatus();
	        Thread.sleep(15000);

	    }

		@After
	    public void tearDown() {
	        driver.close();
	    }
	}


