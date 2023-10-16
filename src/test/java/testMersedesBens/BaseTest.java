package testMersedesBens;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attachments;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


public class BaseTest {

    Attachments attachments = new Attachments();
    @BeforeAll
    public static void setUP() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.browser = "CHROME";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://mbrus.ru";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }

    @AfterEach
    public void addAttachments() {
        attachments.takeScreenshot();
        attachments.pageSource();
    }

}
