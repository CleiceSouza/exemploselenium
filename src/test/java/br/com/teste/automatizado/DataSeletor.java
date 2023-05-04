package br.com.teste.automatizado;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataSeletor {
	
	@Test
	public void selecionadordata() throws InterruptedException {
		System.setProperty("webdriver.chrome.drive", "src\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://demo.automationtesting.in/Datepicker.html");
		browser.manage().timeouts().implicitlyWait(Duration.ofMillis(700));
		browser.manage().window().maximize();
		
		WebElement calendar1 = browser.findElement(By.className("imgdp"));
		calendar1.click();
		Thread.sleep(2000);
		browser.findElement(By.cssSelector("#ui-datepicker-div > div > a.ui-datepicker-prev.ui-corner-all")).click();
		browser.findElement(By.xpath("//tbody/tr[2]/td[4]/a[1]")).click();
		
		WebElement calendar2 = browser.findElement(By.cssSelector("#datepicker2"));
		calendar2.click();
		WebElement month = browser.findElement(By.cssSelector("body:nth-child(2) > div.datepick-popup:nth-child(7)"));
		month.click();
		WebElement year = browser.findElement(By.cssSelector("div.datepick-popup:nth-child(7) div.datepick div.datepick-month-row div.datepick-month div.datepick-month-header:nth-child(1) > select.datepick-month-year:nth-child(2)"));
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("2022");
		WebElement day = browser.findElement(By.cssSelector("div.datepick-popup:nth-child(7) div.datepick div.datepick-month-row div.datepick-month table:nth-child(2) tbody:nth-child(2) tr:nth-child(3) td:nth-child(3) > a.dp1649775600000"));
		day.click();
	}

}
