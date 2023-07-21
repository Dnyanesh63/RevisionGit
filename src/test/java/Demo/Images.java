package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Images 
{
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(5000);
	  driver.get("https://pixabay.com/images/search/nature/");
	  
  }
}
