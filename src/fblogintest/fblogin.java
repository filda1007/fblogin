package fblogintest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class fblogin {
WebDriver driver;
	
  @Test(priority=1)
  public void first()
        {
	    //INVALID USERNAME AND INVALIDPASSWORD
	    WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.sendKeys("rodrigues815@gmail");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("fildapass");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		}
		
		
		/*@Test(priority=3)
		public void Third()
		{
		//INVALID USERNAME AND VALID PASSWORD
	    driver.get("https://www.facebook.com/");
		WebElement uname = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		uname.sendKeys("rodrigue815@gmail");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("fildajoel1002");
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		}*/
		
		
		@Test(priority=2)
		public void second() 
		{
		//VALID USERNAME AND INVALID PASSWORD
		driver.get("https://www.facebook.com/");
		WebElement uname1 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		uname1.sendKeys("rodriguesr815@gmail.com");
		WebElement pass1 = driver.findElement(By.name("pass"));
		pass1.sendKeys("fildajoel2");
		WebElement logbt = driver.findElement(By.name("login"));
		logbt.click();
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		}
		
		@Test(priority=3)
		public void fourth()
		{
		//VALID USERNAME AND VALID PASSWORD
		driver.get("https://www.facebook.com/");
		WebElement uname2 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		uname2.sendKeys("rodriguesr815@gmail.com");
		WebElement pass2 = driver.findElement(By.name("pass"));
		pass2.sendKeys("fildajoel1002");
		WebElement logbutton = driver.findElement(By.name("login"));
		logbutton.click();
		try {
			Thread.sleep(8000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
        }
  @BeforeTest
  public void beforeTest() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	 driver.close();
  }

}
