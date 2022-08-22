package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {

		//Launch a Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
				
		//Visit a page
		wd.get("https://rahulshettyacademy.com/angularpractice/");
				
		//Check dropdown
		WebElement ddwon = wd.findElement(By.id("exampleFormControlSelect1"));
		Select select = new Select (ddwon);
		
		select.selectByValue("Male");

		
		 


	}

}
