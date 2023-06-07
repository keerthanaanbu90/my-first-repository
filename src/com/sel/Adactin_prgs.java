package com.sel;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adactin_prgs {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer - AK\\eclipse-workspace\\Seleninum_project1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("sathiyadevanbalagan");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("sathiya@");
		WebElement log = driver.findElement(By.xpath("//input[@type='Submit']"));
		log.click();
		WebElement loct = driver.findElement(By.xpath("//select[@name='location']"));
		Select s=new Select(loct);
		s.selectByValue("Melbourne");
		WebElement hot = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1=new Select(hot);
		s1.selectByIndex(1);
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2=new Select(room);
		s2.selectByVisibleText("Super Deluxe");
		WebElement rm = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3=new Select(rm);
		s3.selectByIndex(1);
		WebElement re = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4=new Select(re);
		s4.selectByIndex(2);
		WebElement rw = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5=new Select(rw);
		s5.selectByIndex(1);
		WebElement sub = driver.findElement(By.xpath("//input[@type='submit']"));
		sub.click();
		WebElement click = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		click.click();
		WebElement fristn = driver.findElement(By.xpath("//input[@name='first_name']"));
		fristn.sendKeys("keerthana");
		WebElement lastn = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastn.sendKeys("Anand");
		WebElement add = driver.findElement(By.xpath("//textarea[@name='address']"));
		add.sendKeys("trichy 62007");
		
		WebElement cc = driver.findElement(By.xpath("//input[@name='cc_num']"));
		cc.sendKeys("1234 5678 9012 3456");
		WebElement card = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s6=new Select(card);
		s6.selectByIndex(2);
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s7=new Select(month);
		s7.selectByIndex(3);
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s8=new Select(year);
		s8.selectByIndex(7);
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("889");
		TakesScreenshot s10=(TakesScreenshot)driver;
		File f1 = s10.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\Acer - AK\\eclipse-workspace\\Seleninum_project1\\Screenshot\\adactin.png");
		
		FileHandler.copy(f1, f);
		
		
		
		
		
		
		
	}
	
	

}
