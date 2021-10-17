package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCreate {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		WebElement FirstName = driver.findElement(By.name("firstname"));
		FirstName.sendKeys("elakki");
		Thread.sleep(2000);
		WebElement SurName = driver.findElement(By.xpath("//input[@name='lastname']"));
		SurName.sendKeys("selvan");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("elakkiyaselvan@gmail.com");
		Thread.sleep(2000);
		WebElement EmailConfirm = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		EmailConfirm.sendKeys("elakkiyaselvan@gmail.com");
		Thread.sleep(2000);
		WebElement NewPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		NewPassword.sendKeys("Suriselvan1998@");
		Thread.sleep(2000);
		
        WebElement date = driver.findElement(By.id("day"));
        Select dropdown = new Select(date);
        dropdown.selectByVisibleText("21");
        Thread.sleep(2000);
        
        WebElement month = driver.findElement(By.id("month"));
        Select dropdown1 = new Select(month);
        dropdown1.selectByIndex(1);
        Thread.sleep(2000);
        
        WebElement year = driver.findElement(By.id("year"));
        Select dropdown2 = new Select(year);
        dropdown2.selectByValue("1998");
        Thread.sleep(2000);
        
        WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();
        Thread.sleep(2000);
        
        WebElement signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
        signup.click();
        
	}

}
