package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".inputtext.login_form_input_box")
    private List<WebElement> loginFields;

    @FindBy(css = "input[id=\"u_0_2\"")
    private WebElement loginButton;

    @FindBy(css = "body > div._n8._3qx.uiLayer._3qw > div._3ixn")
    private WebElement allowNotifications;



    public void inputEmail(String email) {
        loginFields.get(0).sendKeys(email);
    }

    public void inputPassword(String password) {
        loginFields.get(1).sendKeys(password);
    }

    public HomePage pressLoginButton() {
        loginButton.click();
        return new HomePage(driver);
    }


}
