package tp5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pro5 {

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
		List<WebElement> prods=drive.findElements(By.xpath("//h2[@itemprop=\"name\"]"));
		for(int i=0;i<prods.size();i++) {
			System.out.println(prods.get(i).getText());
		}
		Thread.sleep(5000);
		drive.close();
	}

}
