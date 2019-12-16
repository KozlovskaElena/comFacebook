package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class FriendsPage extends BasePage {

    public FriendsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".fsl.fwb.fcb")
    private List<WebElement> friendsList;

    @FindBy(css = "#pagelet_timeline_app_collection_100000348550627\\:2356318349\\:2 > ul > li:nth-child(2) > div > div > div.uiProfileBlockContent > div > div:nth-child(2) > div > an")
    private WebElement vova;

    public void clickFriendButton(int index) {
        wait.until(ExpectedConditions.elementToBeClickable(friendsList.get(index)));
        friendsList.get(index).click();
    }

    public void clickVova() {
        wait.until(ExpectedConditions.elementToBeClickable(vova));
        vova.click();
    }

}
