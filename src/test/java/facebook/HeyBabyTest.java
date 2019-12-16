package facebook;

import org.junit.Test;
import org.openqa.selenium.By;

public class HeyBabyTest extends BaseTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private ProfilePage profilePage;
    private FriendsPage friendsPage;
    private AboutPage aboutPage;
    private KozlovskyiVolodymyrPage kozlovskyiVolodymyrPage;

    @Test
    public void testHeyBaby() {
        loginPage = new LoginPage(driver);
        loginPage.inputEmail(user.getEmail());
        loginPage.inputPassword(user.getPassword());
        homePage = loginPage.pressLoginButton();

//        homePage.search("Volodymyr Kozlovskyi");



        profilePage = homePage.clickProfileButton();
        friendsPage = profilePage.clickFriendsButton();
        friendsPage.clickVova();
////        aboutPage = profilePage.clickAbout();
////        aboutPage.clickMarriedTo();
//        friendsPage = profilePage.clickFriendsButton();
////        driver.switchTo().frame(driver.findElement(By.cssSelector("//*[@id=\"u_0_z\"]")));
//        friendsPage.clickFriendButton(11);
//////        driver.switchTo().defaultContent();
//        driver.get("https://www.facebook.com/KozlovskyiVolodymyr?fref=profile_friend_list&hc_location=friends_tab");


    }
}
