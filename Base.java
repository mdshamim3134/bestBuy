package bestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	static WebDriver dr;
	
	public static void main(String[]args) throws InterruptedException {
		dr=new ChromeDriver();
		dr.get("https://www.bestbuy.com/");
		dr.findElement(By.xpath("//*[@class=\"c-close-icon  c-modal-close-icon\"]")).click();
		
		
		
	WebElement element=	dr.findElement(By.id("gh-search-input"));
		try{Actions ac=new Actions(dr);
		ac.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
		element.sendKeys("iphone11promax");
		dr.findElement(By.xpath("//*[@class=\"header-search-button\"]")).click();
		}catch(Exception ex) {
			
			
		}
		Thread.sleep(5000);
		WebElement loginBtn = dr.findElement(By.xpath("//*[@alt=\"Apple - iPhone 11 Pro Max 512GB - Gold (AT&T) - Front_Zoom\"]"));  
		String javascript = "arguments[0].scrollIntoView()";  
		JavascriptExecutor jsExecutor = (JavascriptExecutor) dr;  
		jsExecutor.executeScript(javascript, loginBtn);
		loginBtn.click();
		
	}

}
