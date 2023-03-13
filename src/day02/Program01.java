package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Program01 {

	public static void main(String[] args) {
		
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 
		 driver = new ChromeDriver(options);
		 driver.get("https://demo.automationtesting.in/Register.html");	
		 Select dropdownSkill = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		 dropdownSkill.selectByIndex(4);
		 
		 
		 Select dropdownYear = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		 dropdownYear.selectByValue("1926");
		 
		 
		 Select dropdownMonth = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		 dropdownMonth.selectByVisibleText("March");
	}

}
