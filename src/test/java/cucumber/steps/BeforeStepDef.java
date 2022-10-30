package cucumber.steps;

import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class BeforeStepDef {
    @Given("Открыть сайт {string}")
    public void openMaimPage(String arg0) {
        open(arg0);
    }
}
