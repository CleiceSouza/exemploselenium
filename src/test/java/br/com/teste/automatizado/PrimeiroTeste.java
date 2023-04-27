package br.com.teste.automatizado;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimeiroTeste {
	
	
	@Test
	public void preencherFormulario(){
		System.setProperty("webdriver.chrome.drive", "src\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://demo.automationtesting.in/Register.html");
		browser.manage().timeouts().implicitlyWait(Duration.ofMillis(700));
		browser.manage().window().maximize();
		
		WebElement firstname = browser.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")); 
		firstname.click();
		firstname.sendKeys("Márcia");
		
		WebElement lastName = browser.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		lastName.click();
		lastName.sendKeys("Brown");
		
		WebElement address = browser.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		address.click();
		address.sendKeys("Vila Conceição, 349 Bairro: Condor");
		
		WebElement email = browser.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		email.click();
		email.sendKeys("caleb_89@gmail.com");
		
		WebElement phone = browser.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		phone.click();
		phone.sendKeys("95989721291");
		
		boolean radioButton = browser.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]")).isSelected();
		if (radioButton == false) {
			WebElement radioGender = browser.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
			radioGender.click();
		}
		

		WebElement checkBox = browser.findElement(By.id("checkbox2"));
		checkBox.click();
		
       
        
		WebElement skills = browser.findElement(By.id("Skills"));
		Select selectSkills = new Select(skills);
		selectSkills.selectByVisibleText("Java");
		
		WebElement country = browser.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		country.click();
		WebElement countryText = browser.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		countryText.sendKeys("Japan", Keys.ENTER);
		
		WebElement year = browser.findElement(By.id("yearbox"));
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("1990");
		
		WebElement month = browser.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("April");
		
		WebElement day = browser.findElement(By.id("daybox"));
		Select selectDay = new Select(day);
		selectDay.selectByVisibleText("11");
		
		WebElement password = browser.findElement(By.id("firstpassword"));
		password.click();
		password.sendKeys("12345");
		
		WebElement passwordConfirm = browser.findElement(By.id("secondpassword"));
		passwordConfirm.click();
		passwordConfirm.sendKeys("12345");
		
		
		WebElement upload = browser.findElement(By.id("imagesrc"));
		upload.sendKeys("C:\\Users\\CLEICE SOUZA\\Desktop\\upload.txt");
	
		
		WebElement submit = browser.findElement(By.id("submitbtn"));
		submit.click();
		
		
	}

}
