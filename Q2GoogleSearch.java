package task15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium Browser Driver");
		driver.findElement(By.className("gNO89b")).click();
		driver.close();
	}

}
