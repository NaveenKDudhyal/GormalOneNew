package GORMALONE_LLP_ASSESSMENT_ROUND_TestCases;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import GORMALONE_LLP_ASSESSMENT_ROUND_Test_Base.TestBase;

public class GORMALONE_LLP extends TestBase
{
	
	@Test(priority = 1)
	public void GORMALONE() throws InterruptedException
	{
		WebElement SName = driver.findElement(By.xpath("//input[@id='txtOriginGeneral']"));
		SName.click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//div[text()='Cameron Highlands'])[2]"))).click().build().perform();
		Actions act1 = new Actions(driver);
		act1.moveToElement(driver.findElement(By.xpath("(//div[text()='Kuala Lumpur'])[2]"))).click().build().perform();
		
		String EY = "2022";
		String EM = "November";
		String ED = "20";
		
		WebElement datePicker = driver.findElement(By.xpath("//input[@id='txtDepartDateBooking']"));
		datePicker.click();
		
		while(true)
		{
			String CY = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String CM = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if(CM.equals(EM) && CY.equals(EY))
			{
				List <WebElement> DaysList = driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				for(WebElement e:DaysList)
				{
					String CD = e.getText();
					
					if(CD.equals(ED))
					{
						e.click();
						break;
					}
				}
				break;
			}
			else
			{
				WebElement next = driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
				next.click();
			}
		}
		
		WebElement SeacrhBusBTN = driver.findElement(By.xpath("//input[@id='btnBusSearchNewGeneral']"));
		SeacrhBusBTN.click();
		
		WebElement selectBtn = driver.findElement(By.xpath("(//a[text()='Select'])[14]"));
		selectBtn.click();
		
		
		driver.findElement(By.xpath("//div[text()='10']")).click();
		driver.findElement(By.xpath("//div[text()='11']")).click();
		driver.findElement(By.xpath("//div[text()='13']")).click();
		driver.findElement(By.xpath("//div[text()='14']")).click();
		driver.findElement(By.xpath("//div[text()='15']")).click();
		driver.findElement(By.xpath("//div[text()='16']")).click();
		
		WebElement Proceed = driver.findElement(By.xpath("//input[@value='Proceed']"));
		Proceed.click();
		
		WebElement FullName = driver.findElement(By.xpath("//input[@class='payment_textName form-control pay-form-control']"));
		FullName.sendKeys("Naveen Dudhyal");
		
		WebElement PhoneNumber = driver.findElement(By.xpath("//input[@class='payment_txtPhoneLogin form-control pay-form-control']"));
		PhoneNumber.sendKeys("9527449088");
		
		WebElement Email = driver.findElement(By.xpath("//input[@class='payment_txtEmail form-control pay-form-control']"));
		Email.sendKeys("naveendydhyal777@gmail.com");
		
		WebElement Next = driver.findElement(By.xpath("//a[@class='btn btn-orange']"));
		Next.click();
		Thread.sleep(5000);
		
		WebElement ProceedPayment = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/section/div[2]/div[4]"));
		ProceedPayment.click();
		Thread.sleep(3000);
		
	    String AlertText = driver.findElement(By.xpath("//div[text()='Please select a payment method']")).getText();
		System.out.println(AlertText);
		
	}
//		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[4]/td[1]/a")).click();;
		
//		WebElement SBus = driver.findElement(By.xpath("//input[@id='btnBusSearchNewGeneral']"));
//		SBus.click();
//	
//		driver.findElement(By.xpath("(//a[text()='Select'])[3]")).click();
//		
//		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[2]/div[3]/div/div[2]/div/div[1]/div[3]/div/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[5]/td[1]/div")).click();
//		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[2]/div[3]/div/div[2]/div/div[1]/div[3]/div/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td[1]/div")).click();
//		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[2]/div[3]/div/div[2]/div/div[1]/div[3]/div/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[2]/div")).click();
//	
//		driver.findElement(By.xpath("//input[@class='seatproceed']")).click();
//			
//	
//		driver.findElement(By.xpath("//input[@class='payment_textName form-control pay-form-control']")).sendKeys("Naveen Dudhyal");
//		driver.findElement(By.xpath("//input[@class='payment_txtPhoneLogin form-control pay-form-control']")).sendKeys("9527449087");
//		driver.findElement(By.xpath("//input[@class='payment_txtEmail form-control pay-form-control']")).sendKeys("naveendudhyal777@gmail.com");
//		
//		driver.findElement(By.xpath("//a[text()='Next']")).click();
	
	

}
