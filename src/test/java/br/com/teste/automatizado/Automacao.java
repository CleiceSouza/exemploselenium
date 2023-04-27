package br.com.teste.automatizado;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automacao {
	
	@Test
	public void pesquisarGoogle() {
		System.setProperty("webdriver.chrome.drive", "src\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
	
		navegador.get("https://www.google.com/");
		navegador.findElement(By.id("APjFqb")).click();
		navegador.findElement(By.id("APjFqb")).sendKeys("planta coleus", Keys.ENTER);
		navegador.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		navegador.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/a/h3")).click();
		
	}

}
