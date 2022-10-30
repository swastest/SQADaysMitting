package cucumber.steps;

import cucumber.pages.SingInPage;
import io.cucumber.java.en.Then;

public class SingInPageDef {
    SingInPage singInPage = new SingInPage();
    @Then("Ввести в поле логин номер телефона {string}")
    public void inputLogin(String phone) {
        singInPage.inputLoginPhone(phone);
    }

    @Then("Ввести в поле пароль {string}")
    public void inputPassword(String pass) {
        singInPage.inputLoginPassword(pass);
    }

    @Then("Нажать на кнопку Войти")
    public void clickSingInButton() {
        singInPage.clickSubmitButton();
    }

    @Then("Проверка ошибки {string}")
    public void checkErrorMessage(String arg0) {
        singInPage.checkErrorAuthMessage(arg0);
    }
}
