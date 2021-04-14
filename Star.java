package bestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Star extends BaseForBestBuy{
	WebDriver dr=openBrowser();
	@Test
	public void getText() {
	String text=dr.findElements(By.xpath("//*[@style=\"transform:translate3d(-0px, 0, 0)\"]/li/div/a")).get(1).getText();
	System.out.println("text is"+text);
	
	WebElement element=	dr.findElement(By.id("gh-search-input"));
		try{Actions ac=new Actions(dr);
		ac.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
		element.sendKeys("iphone11promax");
		dr.findElement(By.xpath("//*[@class=\"header-search-button\"]")).click();
		}catch(Exception ex) {
			
			
		}
	}

}
