package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube{
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer - AK\\eclipse-workspace\\Seleninum_concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@autocapitalize='none']")).sendKeys("tamil songs");
		Robot ac=new Robot();
		ac.keyPress(KeyEvent.VK_ENTER);
		ac.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		// 1 SONG
		//driver.findElement(By.xpath("(//div[@class='style-scope ytd-video-renderer']//following::yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")).click();
		//2 SONG
		
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//WebElement song = driver.findElement(By.xpath("//a[@title='Vaa Vaathi Full Video Song | Vaathi Movie | Dhanush, Samyuktha | GV Prakash Kumar | Venky Atluri']"));
		
		//js.executeScript("arguments[0].scrolIntoView();", song);
		
		driver.findElement(By.xpath("//a[@title='Vaa Vaathi Full Video Song | Vaathi Movie | Dhanush, Samyuktha | GV Prakash Kumar | Venky Atluri']")).click();
		
	}
}
