package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Program1 {

	public static void main(String[] args) {
		
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Test2");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
	}

}
