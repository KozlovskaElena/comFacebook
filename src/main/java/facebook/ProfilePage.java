package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProfilePage extends BasePage {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "._6-6")
    private List<WebElement> profileFolders;

    /*
    0 - TimeLine;
    1 - About
    2 - Friends
    3 - Photos
    4 - Archive
    5 - More
     */

    public FriendsPage clickFriendsButton() {
        wait.until(ExpectedConditions.visibilityOfAllElements(profileFolders));
        profileFolders.get(2).click();
        return new FriendsPage(driver);
    }

    public AboutPage clickAbout() {
        wait.until(ExpectedConditions.visibilityOfAllElements(profileFolders));
        profileFolders.get(1).click();
        return new AboutPage(driver);
    }
}
