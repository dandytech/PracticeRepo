import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\QA-Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//To wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Locators
		
		// 1. id 
		driver.findElement(By.id("inputUsername")).sendKeys("Daniel");
		
		// // 2. name 
		driver.findElement(By.name("inputPassword")).sendKeys("Dandytech@2022");
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		
		// 3. className 
		driver.findElement(By.className("submit")).click();
		
		// 4. cssSelector  Syntax: tagName.className
		String text = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(text);
		
		// 5. linkText  
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// 6. xpath  syntax: //tagName[@attribute = 'value']
		driver.findElement(By.xpath("//input[@placeholder = 'Name']")).sendKeys("Daniel");
		driver.findElement(By.xpath("//input[@placeholder = 'Email']")).sendKeys("123daniel");
		driver.findElement(By.xpath("//input[@placeholder = 'Phone Number']")).sendKeys("+2347065123746");
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		//Login again after password reset  
		
		//driver.findElement(By.className("go-to-login-btn")).click();
		
		//driver.findElement(By.id("inputUsername")).sendKeys("Daniel");
		//driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.id("chkboxOne")).click();
		//driver.findElement(By.id("chkboxTwo")).click();
		//driver.findElement(By.className("submit")).click();
		
		//driver.close();
	}

}
