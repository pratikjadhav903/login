package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class login_page {
  @Test
  public void login() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\JAR FILE\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	  
	  
	  
  }
}
