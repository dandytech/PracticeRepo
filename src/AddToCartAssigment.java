import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartAssigment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\QA-Testing\\chromedriver_win32\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		ChromeDriver driver = new ChromeDriver(options);
	
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

		//Explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		System.out.println(driver.findElement(By.xpath("//div[@class='modal-body']")).getText());

		driver.findElement(By.id("okayBtn")).click();
		
		WebElement options2 = driver.findElement(By.xpath("//select[@class='form-control']"));
		 
		Select option = new Select(options2);
		
		option.selectByIndex(2);
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class='btn btn-info']")));
		
		List <WebElement> product = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		
		for (int i=0; i< product.size(); i++)
		{
			product.get(i).click();
		}
		
		Thread.sleep(3000); //to observe the cart content
		
		driver.findElement(By.partialLinkText("Checkout")).click();
	}
 

}


