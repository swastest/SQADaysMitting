package cucumber.steps;

import cucumber.pages.MainPage;
import io.cucumber.java.en.When;

public class MainPageDef {
    MainPage mainPage = new MainPage();

    @When("Нажать на кнопку Личный кабинет")
    public void clickMenuLogin() {
        mainPage.clickMenuLoginButton();
    }
}
