package Testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Genericlib.Baseclass;
import Genericlib.Commonutility;
import Genericlib.Datautility;

public class Alerthandling extends Baseclass {
	@Test
	public void Alert() throws EncryptedDocumentException, IOException {
		Datautility du=new Datautility();
		Commonutility cu=new Commonutility();
		String customername=du.getdataFromExcelsheet("Sheet1", 0,1 );
		//WebDriver driver=new ChromeDriver();
		
		driver.findElement(By.cssSelector(".popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.id("name")).sendKeys(du.getdataFromExcelsheet("Sheet1", 0, 1));
		driver.findElement(By.cssSelector("[value='Cancel']")).click();
		String msg=cu.alerthmsg(driver);
		System.out.println(msg);
	}
}




