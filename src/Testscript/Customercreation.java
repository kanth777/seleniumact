package Testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Genericlib.Baseclass;

public class Customercreation extends Baseclass {
	
	@Test
	public void createCustomer() throws IOException {
		
		
        String customerName=du.getdataFromExcelsheet("Sheet1", 0, 1);
		int num=cu.getRandomNum();
		customerName = customerName+num;
		
		
		driver.findElement(By.id("container_tasks")).click();
		
		driver.findElement(By.className("ellipsis")).click();
		
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(customerName);
		
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("good");
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		cu.explicitWait(driver,By.cssSelector(".titleEditButtonContainer>title"),customerName);
	    String actualcustomername=driver.findElement(By.cssSelector(".titleEditButtonContainer>title")).getText();
		System.out.println(actualcustomername);
	}
}





