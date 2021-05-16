package Testing_SAM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitharth Kadam\\Downloads\\Exe Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:C:\\Users\\Hitharth Kadam\\Downloads\\HomePage (2)\\HomePage\\mainhomepage.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		String title = driver.getTitle();  
		int titleLength = driver.getTitle().length();
		Thread.sleep(4000);
		System.out.println("Title of the page is : " + title);  
		System.out.println("Length of the title is : "+ titleLength);
		String url = driver.getCurrentUrl();
		String url1 = "file:///C:/Users/Hitharth%20Kadam/Downloads/HomePage%20(2)/HomePage/mainhomepage.html";	
		if(url.equalsIgnoreCase(url1))
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


