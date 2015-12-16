package SeleniumIntegration.AutoIdea;

import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.TestHelper;

public class AddClient {

	public static void main(String args[]){
		
		WebDriver driver=new FirefoxDriver();
		Login.DoLogin(driver);
		//TestHelper.backDrop(driver).click();
		Set<String> windowId = driver.getWindowHandles();    // get  window id of current window
        Iterator<String> itererator = windowId.iterator();   

        String mainWinID = itererator.next();
        //String  newAdwinID = itererator.next();

        driver.switchTo().window(mainWinID);
		
		
		
	}
}
