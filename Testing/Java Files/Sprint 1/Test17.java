package Testing_SAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitharth Kadam\\Downloads\\Exe Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8000/accounts/login/?next=/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("trisila");
		Thread.sleep(2500);
		driver.findElement(By.name("password")).sendKeys("project123");
		Thread.sleep(2500);
		driver.findElement(By.cssSelector("body > div > div > div.card-body > form > button")).click();
		Thread.sleep(5000);
		String at = driver.getTitle();
		System.out.println(at);
		String et = "Homepage";
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful - Teacher Login Successful");
		}
		else
		{
			System.out.println("Test Failure - Teacher Login Failure");
		}
		driver.close();
	}

}
