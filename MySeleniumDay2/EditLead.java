package MySeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		chrome.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Demo");
		chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement text =chrome.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		text.click();
		System.out.println("Page title is : " + chrome.getTitle());
		chrome.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
		chrome.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		chrome.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Testleaf");
		chrome.findElement(By.xpath("//input[@value='Update']")).click();
		String confirm = chrome.findElement(By.id("viewLead_companyName_sp")).getText();
		
		
		if (confirm=="Testleaf"){
			System.out.println("Company name has changed to Testleaf");
		}
		else
		{
			System.out.println("not changed to Testleaf");
		}
		chrome.close();
		}
		
		
	}


