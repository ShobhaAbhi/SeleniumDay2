package MySeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundInput {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/input.xhtml");
	driver.manage().window().maximize();
	//Type your name
	driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Shobha");
	//Append Country to this City.
	driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("Dubai");
	//Verify if text box is disabled
	boolean Disable = driver.findElement(By.xpath("//form[@id='j_idt88']/div[3]/div[1]")).isEnabled();
	if (Disable) {
	System.out.println("text box is disabled");
	}
	else
	{
		System.out.println("text box is not disabled");
	}
	//Clear the typed text.
	driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
	//Retrieve the typed text.
	String retrive=driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value");
	System.out.println(retrive);
	//Type email and Tab. Confirm control moved to next element.
	WebElement move= driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
	move.sendKeys("shobhashivakumarkittada@gmail.com");
	move.sendKeys(Keys.TAB);
	System.out.println(move);
	//Type about yourself
	driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("I'm shobha");
	//Text Editor
	driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']")).sendKeys("Selenium");
	//Just Press Enter and confirm error message*
	driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
	//String error= driver.findElement(By.xpath("//h1[text()='An Error Occurred:']")).getAttribute("value");
	//System.out.println(error);
	
	//need to work on Click and Confirm Label Position Changes
	
	//Type your name and choose the third option
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Shobha");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//li[contains(@class,'ui-autocomplete-item ui-autocomplete-list-item')])[3]")).click();
	//Type your DOB (mm/dd/yyyy) and confirm date chosen
	driver.findElement(By.xpath("//button[@aria-label='Show Calendar']")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath(("//span[text()='September']"))).sendKeys("Jul");
	driver.findElement(By.xpath("//a[text()='6']")).click();
	
	
	}
}
