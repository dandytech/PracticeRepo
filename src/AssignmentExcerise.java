import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssignmentExcerise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\QA-Testing\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//driver.findElement(By.id("div[id='checkbox-example'] label")).click();
		//List<WebElement> options = driver.findElements(By.cssSelector("div[id='checkbox-example'] label"));
		//System.out.println(options);
	
		//Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked

		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True

		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption1")).click();

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false


		//How to get the Count of number of check boxes present in the page
		
		//int options2 = driver.findElements(By.cssSelector("input[value='checkbox']")).size();
		//System.out.println(options2);
		
		int options = driver.findElements(By.cssSelector("div[id='checkbox-example'] label")).size();
		System.out.println(options);
		
		
		driver.close();

	}

}
