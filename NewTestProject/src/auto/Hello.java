package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-JarFile\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		//or
		System.setProperty("webdriver.gecko.driver","D:\\Selenium-JarFile\\chromedriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.manage().window().maximize();

	}

}
