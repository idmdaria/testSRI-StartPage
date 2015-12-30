package slider;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fourthButton {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.sriinfotech.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }	

  @Test
  public void testHallo() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.xpath("//*[@id='row-0']/div/div/div/div/div/div/div[2]/div/div[4]/a")).click();
    
    Thread.sleep(800);
    
    driver.findElement(By.xpath("//*[@id='slideshow-1']/li[4]/div/a")).click();
    try {
      assertEquals("System Administration", driver.findElement(By.cssSelector("h1")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }


}
