package steps;


import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.BasePages;

import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {

    BasePages basePages = new BasePages();

    @Step("Открытие главной страницы")
    public BaseSteps openMain() {
        open("https://mbrus.ru/");
        return this;
    }

    @Step("Выбираем в главном меню нужный раздел и нажимаем на него")
    public BaseSteps selectDesiredSectionInMainMenu(String text) {
        basePages.mainMenu(text).click();
        return this;
    }

    @Step("Выбираем в под меню нужный раздел и нажимаем на него")
    public BaseSteps selectDesiredSectionISubMenu(String text) {
        basePages.subMenu(text).click();
        return this;
    }


    @Step("Проверка работы раздела сайта 'автомобили в наличии'")
    public void checkingOperationTheCarsInStockSectionTheWebsite() {
        basePages.siteTitle().shouldBe(Condition.text("Автомобили в наличии"));
    }
}
