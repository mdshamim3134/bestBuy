package bestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MultiOptionHandle extends BaseForBestBuy  {
	WebDriver dr=openBrowser();
 
@Test
public void elementsHandle() {
	dr.findElement(By.xpath("//*[@class=\"cart-label\"]")).click();
	try {
//		dr.findElement(By.xpath("//a[contains(text(),\"Continue Shopping\")]")).click();
	dr.findElement(By.xpath("//*[@title=\"Remove\"]")).click();
	dr.navigate().back();
	}catch(Exception e) {
		for(int i=0;i<=1;i++) {
			
		
		dr.navigate().back();
		
		
	}}
}
}
