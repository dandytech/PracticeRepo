import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\QA-Testing\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		 driver.findElement(By.id("divpaxinfo")).click(); 
		
		   /*int i=1;

		 while(i<5)

		 {

		 driver.findElement(By.id("hrefIncAdt")).click();//4 times

		 i++;

		 }*/

		 
		 for(int i = 0; i<3; i++) //select CHILD 3 times
		 {
			 Thread.sleep(1000);
			 driver.findElement(By.id("hrefIncChd")).click();
		 }
		 
		driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
