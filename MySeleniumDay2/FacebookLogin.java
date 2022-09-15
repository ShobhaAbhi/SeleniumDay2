package MySeleniumDay2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//form[@class='_9vtf']/div[5]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Abhiram");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S K");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9164260329");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Testleaf@22");
		//Dropdown to select perticular date
		WebElement date =driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(date);
		day.selectByIndex(5);
		
		//Dropdown to select perticular month
		WebElement birthday = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(birthday);
		month.selectByIndex(4);
		
		//Dropdown to select perticular year
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select calender = new Select(year);
		calender.selectByValue("2019");
		
		WebElement radio = driver.findElement(By.xpath("//input[@value=1]"));
		radio.click();
}
}