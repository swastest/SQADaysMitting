package cucumber.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class PersonalAriaPage {
    private ElementsCollection headerPersonalAria = $$("ul.main-menu li");

    public void checkHeadersPersonalAria(String[] headers){
        for(int i=0; i<headerPersonalAria.size(); i++){
            this.headerPersonalAria.get(i).shouldHave(text(headers[i]));
        }
    }
}
