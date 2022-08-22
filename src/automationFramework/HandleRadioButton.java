package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {

	public static void main(String[] args) {
		//Launch a Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		//Visit a page
		wd.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Check a radio button
		wd.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[6]/div[1]/label")).click();

	}

}
