package miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

WebElement location_selection = driver.findElement(By.xpath("//select[@name='location']"));
Select location = new Select(location_selection);
location.selectByIndex(8);

WebElement hotel_selection = driver.findElement(By.xpath("//select[@id='hotels'"));
Select hotel = new Select(hotel_selection);
hotel.selectByIndex(3);

WebElement room_seletion = driver.findElement(By.xpath("//select[@id= 'room_type']"));
Select room = new Select(room_seletion);
room.selectByVisibleText("Deluxe");

WebElement number_room = driver.findElement(By.xpath("//select[@class='search_combobox']")); 
Select number = new Select(number_room);
number.selectByIndex(3);

WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
checkin.sendKeys("25/11/2021");

WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_in"));
checkout.sendKeys("27/11/2021");

WebElement adult_number = driver.findElement(By.xpath("//select[@name='adult_room']"));
Select adult = new Select(adult_number);
adult.selectByIndex(3);

WebElement child_number = driver.findElement(By.xpath("//select[@id='child_room']"));
Select child = new Select(child_number);
child.selectByIndex(2);

WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
search.click();

WebElement select = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
select.click();

WebElement Continue = driver.findElement(By.xpath("//input[id='continue']"));
Continue.click();

WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
firstname.sendKeys("jayanthi");

WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
lastname.sendKeys("malai");

WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
address.sendKeys("chennai");

WebElement cc_num = driver.findElement(By.xpath("//input[@name='cc_num']"));
cc_num.sendKeys("9876543211234567");

WebElement cc_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
Select type = new Select(cc_type);
type.selectByValue("MAST");

WebElement exp_month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
Select month = new Select(exp_month);
month.selectByValue("4");

WebElement exp_year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
Select year = new Select(exp_year);
year.selectByValue("2022");

WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
cvv.sendKeys("345");

WebElement book = driver.findElement(By.xpath("//input[@type='button']"));
book.click();
Thread.sleep(3000);
