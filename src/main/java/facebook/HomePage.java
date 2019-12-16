package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "._1vp5")
    private WebElement profileButton;

    @FindBy(css = "._1frb")
    private WebElement searchField;

    public ProfilePage clickProfileButton() {
        wait.until(ExpectedConditions.elementToBeClickable(profileButton));
        profileButton.click();
        return new ProfilePage(driver);
    }

    public void search(String searchInput) {
        searchField.sendKeys(searchInput);
    }

}
