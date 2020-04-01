package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	public WebDriver driver;
	
//  @Test
//  public void openMyBlog() {
//	driver.get("https://the-internet.herokuapp.com/login");
//	 
//    WebElement username=driver.findElement(By.id("username"));
//    WebElement password=driver.findElement(By.id("password"));
	
//    WebElement login=driver.findElement(By.xpath("//input[@type='Login']]"));
//    username.sendKeys("tomsmith");
//    password.sendKeys("SuperSecretPassword!");
//    login.click();
//    
//    String actualUrl="https://the-internet.herokuapp.com/secure";
//    String expectedUrl= driver.getCurrentUrl();
//    
//    Assert.assertEquals(expectedUrl,actualUrl);
//    
//  }
  @Test
  public void login() {
      // TODO Auto-generated method stub
      
//      System.setProperty("webdriver.chrome.driver", "path of driver");
//      WebDriver driver=new ChromeDriver();
//      driver.manage().window().maximize();
      driver.get("http://testing-ground.scraping.pro/login");
      
      WebElement username=driver.findElement(By.id("usr"));
      WebElement password=driver.findElement(By.id("pwd"));
      WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
      
      username.sendKeys("admin");
      password.sendKeys("12345");
      login.click();
      
      String actualUrl="http://testing-ground.scraping.pro/login?mode=welcome";
      String expectedUrl= driver.getCurrentUrl();
      
      Assert.assertEquals(expectedUrl,actualUrl);
      
      
  }
  @BeforeClass
  public void beforeClass() {
      System.setProperty("webdriver.chrome.driver","F:\\chrome\\chromedriver.exe");
      driver = new ChromeDriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}