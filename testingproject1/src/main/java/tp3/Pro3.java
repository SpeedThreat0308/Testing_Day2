package tp3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pro3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver drive=new ChromeDriver();	
		drive.navigate().to("https://j2store.net/free/");
		drive.manage().window().maximize();
		Thread.sleep(5000);
		WebElement clothing=drive.findElement(By.linkText("Clothing (5)"));
		clothing.click();
		Thread.sleep(5000);
		drive.navigate().back();
		Thread.sleep(5000);
		drive.navigate().forward();
		Thread.sleep(5000);
		drive.close();
	}

}
