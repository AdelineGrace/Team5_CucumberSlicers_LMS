package POM_LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Class_PageObject {

	By Class = By.xpath("//button[@type='button'][text()='Class']");
	
	By Tree = By.xpath("//a[text()='Tree']");
	By Overview = By.xpath("//a[text()='Overview of Trees']");
	By Try = By.xpath("//a[text()='Try here>>>']");
	By Box = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By Run = By.xpath("//button[@type='button'][text()='Class']");
	By Output = By.xpath("//pre[@id='output']");
	By Box2 = By.xpath("//div[@class='code-area']");
			
	 WebDriver driver;
		
		public Class_PageObject(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public void Click_Class() throws InterruptedException
		{
			driver.findElement(Class).click();
			Thread.sleep(1000);
		
}}
