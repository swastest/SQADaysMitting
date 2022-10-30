package cucumber.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SingInPage {
    private SelenideElement phoneInput = $("[name=phone]");
    private SelenideElement passwordInput = $("[name=password]");
    private SelenideElement submitButton = $("button.button-main");
    private SelenideElement errorAuthMessage = $("div.form__notice_error");

    public void inputLoginPhone(String phone){
        this.phoneInput.setValue(phone);
    }

    public void inputLoginPassword(String password){
        this.passwordInput.setValue(password);
    }

    public void clickSubmitButton(){
        this.submitButton.click();
    }

    public void checkErrorAuthMessage(String errorText){
        this.errorAuthMessage.shouldHave(text(errorText));
    }
}
