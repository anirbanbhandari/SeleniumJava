package day02;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Practice01 {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Select dropdownSkill = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		dropdownSkill.selectByValue("Analytics");
		screenShot("skill");
		//can we take individual screenshot of the dropdown ??
		
	}
	
	public static void screenShot(String fileName) throws IOException{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/"+fileName+".png");
		FileUtils.copyFile(src, des);
	}

}
