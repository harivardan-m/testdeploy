package Testing_SAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitharth Kadam\\Downloads\\Exe Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8000/home");
		driver.manage().window().maximize();
		String nav1 = driver.getTitle();
		System.out.println(nav1);
		Thread.sleep(4000);
		driver.findElement(By.linkText("Contact Us")).click();
		String nav2 = driver.getTitle();
		System.out.println(nav2);
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		String at = driver.getTitle();
		System.out.println(at);
		String et = "Smart Attendance Management";
		if(at.contains(et))
		{
			System.out.println("Test Successful - Navigation complete");
		}
		else
		{
			System.out.println("Test Failure");
		}
		driver.close();
	}

}
