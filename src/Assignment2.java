import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\QA-Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("(//input[@name='name'] )[1]")).sendKeys("Daniel");
		
		driver.findElement(By.xpath("//input[@name='email'] ")).sendKeys("dannkwo@gmail.com");;
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Dandytech@2023");;
		
		driver.findElement(By.id("exampleCheck1")).click(); 
		
		//static dropdown for gender
		WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
		Select sex = new Select(gender);
		sex.selectByIndex(0);
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("03/05/1992");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//capture and print alert message
		String success = driver.findElement(By.className("alert")).getText();
		System.out.println(success);

	}

}
