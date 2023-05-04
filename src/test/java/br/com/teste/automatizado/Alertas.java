package br.com.teste.automatizado;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alertas {
	
	@Test
	public void caixaDeAlerta(){
		WebDriver browser = new ChromeDriver();
		System.setProperty("webdriver.chrome.drive", "src\\drivers\\chromedriver_win32\\chromedriver.exe");
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(Duration.ofMillis(700));
		
		browser.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement buttonAlert1 = browser.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		buttonAlert1.click();
		String texto = browser.switchTo().alert().getText();
		browser.switchTo().alert().accept();
		System.out.println(texto);
		
		WebElement alert = browser.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alert.click();
		WebElement buttonAlert2 = browser.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		buttonAlert2.click();
		browser.switchTo().alert().dismiss();
		boolean message = browser.getPageSource().contains("You Pressed Cancel");
		System.out.println(message);
		
		WebElement alert1 = browser.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alert1.click();
		WebElement buttonAlert3 = browser.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		buttonAlert3.click();
		String texto1 = browser.switchTo().alert().getText();
		browser.switchTo().alert().accept();
		System.out.println(texto1);
		boolean message1 = browser.getPageSource().contains("Hello Automation Testing user How are you today");
		System.out.println(message1);
		
		
		
		
	}

}
