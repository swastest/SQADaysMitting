package cucumber.steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {
 //   @Before
    public void openMainPage(){
        open("https://liveinclean.test.itbrick.ru");
    }

    @After
    public void tearDown(){
        WebDriverRunner.getWebDriver().quit();
    }

    @AfterStep
    public void makeScreenshot(){
        Selenide.screenshot(System.currentTimeMillis() + "step");
    }
}
