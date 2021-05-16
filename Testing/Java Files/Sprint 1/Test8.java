package Testing_SAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitharth Kadam\\Downloads\\Exe Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8000/home");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(4000);
		String at = driver.getCurrentUrl();
		String et = "http://127.0.0.1:8000/home/about/";
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Running Server - Test Successful");
		}
		else
		{
			System.out.println("Running Server - Test Failure");
		}
		driver.close();
	}

}
