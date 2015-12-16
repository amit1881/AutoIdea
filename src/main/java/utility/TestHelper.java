package utility;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class TestHelper {

	private static WebElement element=null;
	
	   
	   /*
	    * Login Page
	    */
	   //email address text box
	   public static WebElement emailAddress(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='email']"));
		   return element;
	   }
	   //password text box
	   public static WebElement password(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='password']"));
		   return element;
	   }
	   //remember check box
	   public static WebElement rememberEmail(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='login-form']/div[3]/label/input"));
		   return element;
	   }
	   //login button
	   public static WebElement login(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='login-form']/button"));
		   return element;
	   }
	   //Lost your password link
	   public static WebElement passwordLink(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[2]/div[2]/a"));
		   return element;
	   }
	   //signup link
	   public static WebElement signupLink(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/p/a"));
		   return element;
	   }
	   /*
	    * Signup Page
	    */
	   //first name text box
	   public static WebElement firstName(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='signup-form']/div[1]/input"));
		   return element;
	   }
	   //second name text box
	   public static WebElement lastName(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='signup-form']/div[2]/input"));
		   return element;
	   }
	  //confirm password text box
	   public static WebElement confirmPassword(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='confirm_password']"));
		   return element;
	   }
	   //Choose your timezone
	   public static void selectTimeZone(WebDriver driver)
	   {
	   Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='time-zone']")));
	   dropdown.selectByValue("Asia/Kolkata");;
	   }
	   //Terms and conditions check box
	   public static WebElement acceptTerms(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='signup-form']/div[8]/p/input"));
		   return element;
	   }
	   
	   //signup button
	   public static WebElement  signup(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='sign_up']"));
		   return element;
	   }
	   
	   /*
	    * Modal backdrop
	    */
	   public static WebElement backDrop(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='myModal']/div[1]"));
		   return element;
	   }
	   
	    
}
