package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutPage extends BasePage {

    public AboutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#js_287")
    private WebElement marriedTo;

    public void clickMarriedTo() {
        marriedTo.click();
    }
}
