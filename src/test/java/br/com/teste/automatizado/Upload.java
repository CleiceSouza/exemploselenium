package br.com.teste.automatizado;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	@Test
	public void upload() {
		System.setProperty("webdriver.chrome.drive", "src\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://demo.automationtesting.in/FileUpload.html");
		browser.manage().timeouts().implicitlyWait(Duration.ofMillis(700));
		browser.manage().window().maximize();
		
		WebElement upload = browser.findElement(By.id("input-4"));
		upload.sendKeys("C:\\Users\\CLEICE SOUZA\\Desktop\\upload.txt");
		if (browser.getPageSource().contains("upload.txt")) {
			System.out.println("Upload do arquivo realizado");
		} else {
			System.out.println("Upload não realizado");
		}
		
	}
}
