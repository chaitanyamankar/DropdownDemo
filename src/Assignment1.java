import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\\\1 CRM\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();
driver.findElement(By.cssSelector("#checkBoxOption1")).click();
System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
driver.findElement(By.cssSelector("#checkBoxOption1")).click();
System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());

System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
