package cucumber.steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before
    public void openMainPage(){
        open("https://liveinclean.test.itbrick.ru");
    }
}
