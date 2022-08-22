package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args) {
		
		//Launch a Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
				
		//Visit a page
		wd.get("https://rahulshettyacademy.com/angularpractice/");
				
		//Check checkbox
		wd.findElement(By.xpath("//*[@id=\"exampleCheck1\"]")).click();


	}

}
