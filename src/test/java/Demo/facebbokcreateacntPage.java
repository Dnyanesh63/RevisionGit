package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebbokcreateacntPage 
{
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(5000);
	  driver.get("https://www.facebook.com/"); 
	 
	  System.out.println("hi new line added in facebookteamaccountpage");
  }
}
