package bestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseForBestBuy {
	WebDriver dr;
	
public WebDriver openBrowser() {
	dr=new ChromeDriver();
	dr.get("https://www.bestbuy.com/");
	dr.manage().window().maximize();
	dr.findElement(By.xpath("//*[@class=\"c-close-icon  c-modal-close-icon\"]")).click();
	return dr;
}
@AfterClass
public void tearDown() {
	dr.quit();
}
}
