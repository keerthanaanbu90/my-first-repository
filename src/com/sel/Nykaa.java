package com.sel;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer - AK\\eclipse-workspace\\Seleninum_project1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='emailMobile']")).sendKeys("8675634974");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		Thread.sleep(2000);
		//WebElement fill = driver.findElement(By.xpath("//input[@type='number']"));
		WebElement fill1 = driver.findElement(By.xpath("//input[@name='otpValue']"));
		fill1.click();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the otp");
		String next = sc.next();
		Thread.sleep(2000);
		fill1.sendKeys(next);
		//fill.click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//span[text()='Nykaa user']"))
		Actions ac=new Actions(driver);
		Thread.sleep(3000);
	  WebElement hair=driver.findElement(By.xpath("//a[text()='hair']"));
	  ac.moveToElement(hair).build().perform();
	  
	  WebElement opt=driver.findElement(By.xpath("(//a[text()='Hair Color'])[1]"));
	  opt.click();
	  String s1=driver.getWindowHandle();
	  String s2="";
	  Set<String>windowHandles=driver.getWindowHandles();
	  
	  for(String title:windowHandles) {
		  if(!title.equals(s1)) {
			  s2=title;
			  driver.switchTo().window(title);
		  }
	  }
	  
	  WebElement color=driver.findElement(By.xpath("//div[text()='BBLUNT Salon Secret High Shine Creme Hair Colour']"));
	  color.click();
	  	Set<String>windowHandles1=driver.getWindowHandles();

	  for(String title2:windowHandles1) {
		  if(!title2.equals(s1)&& !title2.equals(s2)) {
			  driver.switchTo().window(title2);
	 }
	  }
	  WebElement bag = driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]"));
	  bag.click();
	  
		WebElement cart = driver.findElement(By.xpath("//span[@class='cart-count']"));
		cart.click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement pro = driver.findElement(By.xpath("//span[text()='Proceed']"));
		pro.click();
		driver.switchTo().defaultContent();
		 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Pincode']")).sendKeys("620007");
		
		driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']")).sendKeys("flat no 5,mullai nagar");
		
		driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']")).sendKeys("Wireless Road Airport,Trichy");
		
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("8675634974");
		driver.findElement(By.xpath("//button[text()='Ship to this address']")).click();
	}

}
