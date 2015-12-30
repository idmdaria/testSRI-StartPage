package test;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class check2ndText {
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
  public void testUntitled() throws Exception {
    driver.get(baseUrl);
    try {
        assertEquals("From database design/architecture to programming and administration, we work with all major platforms including Oracle 9i and 10g, MySQL, MS SQL, Sybase, Informix and more.", driver.findElement(By.xpath("//*[@id='row-2']/div/div/div[2]/p[3]")).getText());
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
