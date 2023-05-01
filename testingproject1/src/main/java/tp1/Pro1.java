package tp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pro1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver drive=new ChromeDriver();	
		drive.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		drive.manage().window().maximize();
		WebElement fname=drive.findElement(By.id("input-firstname"));
		fname.sendKeys("Thamiselvan");
		WebElement lname=drive.findElement(By.id("input-lastname"));
		lname.sendKeys("T");
		WebElement Email=drive.findElement(By.id("input-email"));
		Email.sendKeys("joker@gmail.com");
		WebElement Password=drive.findElement(By.id("input-password"));
		Password.sendKeys("alwaysjoker");
		Thread.sleep(5000);
		WebElement Subscribe=drive.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]"));
		Subscribe.click();
		Thread.sleep(3000);
		WebElement Continue=drive.findElement(By.xpath("/html/body/main/div[2]/div/div/form/div/div/button"));
		Continue.click();
	}

}
