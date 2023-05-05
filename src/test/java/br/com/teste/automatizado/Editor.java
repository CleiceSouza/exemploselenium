package br.com.teste.automatizado;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editor {
	
	@Test
	public void editorTeste(){
		System.setProperty("webdriver.chrome.drive", "src\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://demo.automationtesting.in/CKEditor.html");
		browser.manage().timeouts().implicitlyWait(Duration.ofMillis(700));
		browser.manage().window().maximize();
		
		WebElement buttonNegrito = browser.findElement(By.cssSelector("#cke_35"));
		buttonNegrito.click();
		WebElement editor = browser.findElement(By.cssSelector("#cke_1_contents"));
		editor.click();
		editor.sendKeys("Testes", Keys.ENTER);

		
		
	}

}
