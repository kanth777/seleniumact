package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Genericlib.Baseclass;

public class Dropdown extends Baseclass {

	@Test
	public void handleDropdown ()
	{
		driver.findElement(By.cssSelector(".popup_menu_button.popup_menu_button_settings ")).click();
		driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']")).click();
		WebElement topGrpLvl=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
		cu.getselectByVisibleText(topGrpLvl,"Product Line");
		String  msg=driver.findElement(By.id("FormModifiedTextCell")).getText();
		System.out.println(msg);	
	}
}



