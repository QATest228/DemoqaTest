import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void FillFormTest() {
        open("/text-box");
        $("#userName").setValue("Vaqif");
        $("#userEmail").setValue("vaqifyusibli@gmail.com");
        $("#currentAddress").setValue("Malta");
        $("#permanentAddress").setValue("Baku");
        $("#submit").click();

        $("#output #name").shouldHave(text("Vaqif"));
        $("#output #email").shouldHave(text("vaqifyusibli@gmail.com"));
        $("#output #currentAddress").shouldHave(text("Malta"));
        $("#output #permanentAddress").shouldHave(text("Baku"));
    }
}
