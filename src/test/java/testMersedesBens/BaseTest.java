package testMersedesBens;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


public class BaseTest {
    @BeforeAll
    public static void setUP() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.browser = "CHROME";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://mbrus.ru";
    }

    @AfterEach
    public void addAttachments() {

    }

}
