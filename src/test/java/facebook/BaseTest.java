package facebook;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    protected WebDriver driver;
    protected User user;

    @Before
    public void start() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "/Users/elena/Downloads/chromedriver-2");
        driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");

        user = new User("kozlovskaja.elena@gmail.com", "1228807FlV");
    }

    @After
    public void finish() {
//        driver.quit();
    }
}
