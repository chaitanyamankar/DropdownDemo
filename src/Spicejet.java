import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\1 CRM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ARROW_DOWN);
		
		}
	
		driver.findElement(By.id("ctl00_mainContent_ddl_Child")).sendKeys(Keys.ARROW_DOWN);
		
		
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		/*for (int j = 0; j < 3; j++) {
			driver.findElement(By.id("ctl00_mainContent_ddl_Child")).sendKeys(Keys.ARROW_DOWN);
		
		}
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click(); */
		
		
		
		
	}

}
