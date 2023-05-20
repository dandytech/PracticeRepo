import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\QA-Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\QA-Testing\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		//Microsoft Edge
		//System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
		//WebDriver driver2 = new EdgeDriver();

		driver.get("https://dandytech.netlify.app");
		
		driver.get("https://dandy-nitad.netlify.app");
		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close(); // closes only the window in test

		//driver.quit(); //closes all the associated tabs and windows in test



	}

}
