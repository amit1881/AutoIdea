package SeleniumIntegration.AutoIdea;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.TestHelper;
import utility.GlobalObject;

public class Login {
	

	public static void DoLogin(WebDriver driver){
		
		  //driver=new FirefoxDriver();
		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      //Launch application
	      driver.navigate().to("http://idea.socialsofttest.com/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	     //driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("anuj@ravabe.com");
	      TestHelper.emailAddress(driver).sendKeys("anuj@ravabe.com");
	      
	      //driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Anuj123456");
	      TestHelper.password(driver).sendKeys("Anuj123456");
	   
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id='login-form']/button")).click();
	      
	   
		
	}
	/*
	public static void main(String args[]){
		Login ob=new Login();
		ob.DoLogin();
	}
	*/
}
