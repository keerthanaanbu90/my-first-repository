package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Book_my_show {
public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer - AK\\eclipse-workspace\\Seleninum_project1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/trichy");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement cl = driver.findElement(By.xpath("//img[@alt='Pathu Thala']"));
		cl.click();
		
		WebElement ce = driver.findElement(By.xpath("(//h1[text()='Pathu Thala']//following::span[text()='Book tickets'])[1]"));
		ce.click();
		
		WebElement cr = driver.findElement(By.xpath("(//a[@onclick='BMS.Misc.fnBusy(true);'])[2]"));
		cr.click();
		
		WebElement cd = driver.findElement(By.xpath("//a[text()='LA CINEMA MARIS COMPLEX RGB LASER: TRICHY']//following::a[@data-date-time='11:10 AM']"));
		cd.click();
		
		WebElement cg = driver.findElement(By.xpath("(//span[text()='Terms & Conditions']//following::div[text()='Accept'])[1]"));
		cg.click();

		WebElement sd = driver.findElement(By.xpath("//li[@id='pop_2']"));
		sd.click();
		
		WebElement cx = driver.findElement(By.xpath("//div[@class='btn-bar']//following::div[@id='proceed-Qty']"));
		cx.click();
		//WebDriverWait wait =new WebDriverWait(driver,10);
		WebElement cz = driver.findElement(By.xpath("(//div[text()='A']//following::a[text()=                            24                        ])[1]"));
		cz.click();
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(cz));
		WebElement cs = driver.findElement(By.xpath("(//a[@id='btmcntbook']//following::span[text()='Rs.280.00'])[1]"));
		cs.click();
}



}
