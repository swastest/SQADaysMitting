package cucumber.steps;

import cucumber.config.TestDataConfig;
import cucumber.pages.PersonalAriaPage;
import io.cucumber.java.en.Then;

public class PersonalAriaPageDef {
    PersonalAriaPage personalAriaPage = new PersonalAriaPage();
    @Then("Проверка личного кабинета")
    public void checkPersonalAriaHeaders() {
        personalAriaPage.checkHeadersPersonalAria(TestDataConfig.headersPersonalAria);
    }
}
