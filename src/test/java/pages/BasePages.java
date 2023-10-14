package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class BasePages {

    public SelenideElement mainMenu(String text) {
        return $x("//span[@class='n103-00__text' and text() = '" + text + "']");
    }

    public SelenideElement subMenu(String text) {
        return $x("//a[contains(@class, 'section-title') and text() = '" + text + "']");
    }

    public SelenideElement siteTitle() {
        return $("div[class='headline']");
    }

}
