package miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Adactin_Hotel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\eclipse-workspace\\Miniproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("logiammu");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password .sendKeys("logi2405");
		
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
		
		WebElement select = driver.findElement(By.xpath("//select[@id='location']"));
		Select s =new Select(select);
		s.selectByIndex(2);
		
		WebElement select_hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(select_hotel);
		s1.selectByIndex(2);
		
		WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2 = new Select(roomtype);
		s2.selectByIndex(1);
		
		WebElement roomno = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3 = new Select(roomno);
		s3.selectByIndex(4);
		
		WebElement datepick = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		datepick.sendKeys("29/11/2021");
		
		WebElement datepick1 = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		datepick1.sendKeys("30/11/2021");
		
		WebElement adultroom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(2);
		
		WebElement childroom = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(childroom);
		s5.selectByIndex(3);
		
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
		submit.click();
		
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
		
		WebElement continue1 = driver.findElement(By.id("continue"));
		continue1.click();
		
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("jayanthi");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("malai");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("chenni");
		
		WebElement num = driver.findElement(By.id("cc_num"));
		num.sendKeys("67474834848943949498");
		
		WebElement card = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(card);
		s6.selectByIndex(4);
		
		WebElement exp = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(exp);
		s7.selectByIndex(5);
		
		WebElement expmonth = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(expmonth);
		s8.selectByIndex(5);
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("240");
		
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		
	
		
		
	}
	
	
	
}
