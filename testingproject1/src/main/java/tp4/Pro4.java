package tp4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pro4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver drive=new ChromeDriver();	
		drive.navigate().to("https://j2store.net/free/");
		drive.manage().window().maximize();
		String actualUrl=drive.getCurrentUrl();
		String expectedUrl="https://j2store.net/free/";
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Url Matched");
		}
		else {
			System.out.println("Url did not match");
		}
		Thread.sleep(5000);
		WebElement clothing=drive.findElement(By.linkText("Clothing (5)"));
		clothing.click();
		Thread.sleep(5000);
		String clothingactURL=drive.getCurrentUrl();
		String clothingexpected="https://j2store.net/free/index.php/shop?filter_catid=11";
		if(clothingactURL.equals(clothingexpected)) {
			System.out.println("Url matched");
		}
		else {
			System.out.println("Url not matched");
		}
		drive.close();
	}

}
