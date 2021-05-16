package Testing_SAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitharth Kadam\\Downloads\\Exe Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:C:\\Users\\Hitharth Kadam\\Downloads\\HomePage (2)\\HomePage\\mainhomepage.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(4000);
		String at = driver.getTitle();
		String et = "Smart Attendance Management System";
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test Failure");
		}
		driver.close();
	}

}
