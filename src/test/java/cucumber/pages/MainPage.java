package cucumber.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement menuLoginButton = $(".menu-item_login", 1);

    public void clickMenuLoginButton(){
        menuLoginButton.click();
    }
}
