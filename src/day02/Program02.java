package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Program02 {

	public static void main(String[] args) {
		
		WebDriver driver;	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		//driver.get("https://demo.automationtesting.in/Register.html");
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
		
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		//driver.manage().window().fullscreen();
		
		
		driver.navigate().refresh();
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.close();
		
		driver.quit();

	}

}
