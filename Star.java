package bestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Star extends BaseForBestBuy{
	WebDriver dr=openBrowser();
	@Test
	public void getText() {
	String text=dr.findElements(By.xpath("//*[@style=\"transform:translate3d(-0px, 0, 0)\"]/li/div/a")).get(1).getText();
	System.out.println("text is"+text);
	}

}
