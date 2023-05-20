import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WinHandlesAssignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Creating a driver object referencing WebDriver interface
		//WebDriver driver;

		// Setting webdriver.gecko.driver property
		 //System.setProperty("webdriver.gecko.driver", "C://Users//user//Desktop//QA-Testing//geckodriver-v0.32.0-win-aarch64//geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C://Users//user//Desktop//QA-Testing//chromedriver_win32//chromedriver.exe");

		// Instantiating driver object and launching browser
		//driver = new FirefoxDriver();
		//driver = new ChromeDriver();
				
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
	
		ChromeDriver driver = new ChromeDriver(options);
	

		driver.get("https://the-internet.herokuapp.com");
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@href='/windows']")).click();

		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		

		Set<String> windows = driver.getWindowHandles();

		java.util.Iterator<String> win = windows.iterator();

		String parentId = win.next();

		String childId = win.next();

		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.className("example")).getText());
		
		driver.switchTo().window(parentId);

		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		
		driver.close();
	}

}
