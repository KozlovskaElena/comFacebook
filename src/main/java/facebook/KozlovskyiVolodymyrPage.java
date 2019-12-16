package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KozlovskyiVolodymyrPage extends BasePage {

    public KozlovskyiVolodymyrPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[id=\"u_ps_fetchstream_5_0_b\"]")
    private WebElement message;

    public void clickMessageField() {
        message.click();
    }
}
