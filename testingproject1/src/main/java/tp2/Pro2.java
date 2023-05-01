package tp2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pro2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver drive=new ChromeDriver();	
		drive.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		drive.manage().window().maximize();
		WebElement Rname=drive.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		Rname.sendKeys("Vicky");
		WebElement Remail=drive.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		Remail.sendKeys("joker1@gmail.com");
		WebElement Name=drive.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		Name.sendKeys("Thamiz");
		WebElement Email=drive.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		Email.sendKeys("joker@gmail.com");
		Thread.sleep(1000);
		WebElement Giftto=drive.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
		Giftto.click();
		WebElement Message=drive.findElement(By.xpath("//*[@id=\"input-message\"]"));
		Message.sendKeys("Ellarum Santhosama Irunga");
		WebElement Amount=drive.findElement(By.xpath("//*[@id=\"input-amount\"]"));
		Amount.sendKeys("5");
		Thread.sleep(3000);
		WebElement Continue=drive.findElement(By.xpath("//html/body/main/div[2]/div/div/form/div[8]/div/button"));
		Continue.click();
	}

}
