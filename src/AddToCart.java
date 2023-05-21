import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {

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
	
		
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

			// Brocolli - 1 Kg

			// Brocolli, 1 kg

			
			// format it to get actual vegetable name
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			
			// convert array into array list for easy search
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			
			// check whether name you extracted is present in arrayList or not-
			if (itemsNeededList.contains(formattedName))

			{
				j++;

				// click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

}