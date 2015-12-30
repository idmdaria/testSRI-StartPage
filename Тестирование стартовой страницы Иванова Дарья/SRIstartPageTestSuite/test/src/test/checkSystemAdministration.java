package test;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkSystemAdministration {
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
    driver.findElement(By.linkText("System Administration")).click();
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
