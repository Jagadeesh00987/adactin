package com.jaga;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		/*WebElement register = driver.findElement(By.className("//a[contains(text(),'New User Register Here')]"));
        register.click();*/

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("VarunMatthew");

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("varun@123456789");
		
		WebElement loginBuutn = driver.findElement(By.id("login"));
		loginBuutn.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s1=new Select(location);
		s1.selectByIndex(2);

		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hotels);
		s2.selectByIndex(1);

		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s3= new Select(roomType);
		s3.selectByIndex(1);

		WebElement number = driver.findElement(By.id("room_nos"));
		Select s4= new Select(number);
		s4.selectByIndex(2);

		WebElement numberRoom = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(numberRoom);
		s5.selectByIndex(2);

		WebElement child = driver.findElement(By.id("child_room"));
		Select s6 = new Select(child);
		s6.selectByIndex(2);

		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();

		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
		radiobtn.click();

		WebElement con = driver.findElement(By.id("continue"));
		con.click();

		WebElement name = driver.findElement(By.id("first_name"));
		name.sendKeys("jagadeesh");

		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("singaravel");

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("india");

		WebElement ccNumber = driver.findElement(By.id("cc_num"));
		ccNumber.sendKeys("1234567890234567");

		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select s8= new Select(ccType);
		s8.selectByIndex(1);

		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		Select s9= new Select(expMonth);
		s9.selectByIndex(12);

		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select s10= new Select(expYear);
		s10.selectByIndex(12);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
        cvv.sendKeys("2344");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();

		
	 TakesScreenshot ts = (TakesScreenshot)driver;
	 File src =ts.getScreenshotAs(OutputType.FILE);
		 File des = new File("C:\\Users\\JTM\\eclipse-workspace\\Selenium\\Screenshot\\jaga.png");
		FileUtils.copyFile(src,des);
		 
	}

}
