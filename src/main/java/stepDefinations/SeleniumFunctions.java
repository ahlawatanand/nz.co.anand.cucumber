package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions {
	
	public static WebDriver driver = null;
	public static String baseURL = "https://trello.com/";
	
		public void homepageDisplayed(){
			System.setProperty("webdriver.chrome.driver", "C:/Users/Anand/drivers/chrome/chromedriver.exe");
			driver = new ChromeDriver();
//			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(baseURL);
			driver.findElement(By.cssSelector("a[class^=global-header-section-button][href*=login]")).click();
		}
	
		public void clickLogin(String username, String password){
			driver.findElement(By.cssSelector("input[id=user]")).sendKeys(username);
			driver.findElement(By.cssSelector("input[id=password]")).sendKeys(password);
	//		String atext = driver.findElement(By.cssSelector("input[id=login]")).getAttribute("value");
			driver.findElement(By.cssSelector("input[id=login]")).click();
		}
		public String checkErrorMessage() throws InterruptedException{
// 			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("p.error-message")));
			String innerText = driver.findElement(By.cssSelector("p.error-message")).getAttribute("innerText");
			driver.close();
			return innerText;
		}
	
}
