package MySeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("http://leaftaps.com/opentaps/control/main");
		chrome.manage().window().maximize();
		chrome.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		chrome.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		chrome.findElement(By.xpath("//input[@value='Login']")).click();
		chrome.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		chrome.findElement(By.xpath("//a[text()='Leads']")).click();
		chrome.findElement(By.xpath("//a[text()='Find Leads']")).click();
		chrome.findElement(By.xpath("//span[text()='Phone']")).click();
		chrome.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		chrome.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("9");
		chrome.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
		chrome.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String id = chrome.findElement(By.xpath("//a[text()='10588']")).getText();
		chrome.findElement(By.xpath("//a[text()='10588']")).click();
		System.out.println(id);
		chrome.findElement(By.xpath("//a[text()='Delete']")).click();
		chrome.findElement(By.xpath("//a[text()='Find Leads']")).click();
		chrome.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys("10588");
		chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String display =chrome.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(display);
		chrome.close();
		
		
		
		
	}

}
