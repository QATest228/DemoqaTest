import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJunitTest {

    @Test
    void test() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        open("https://duckduckgo.com/");
        $("[name=q]").setValue("милена").pressEnter();
        $(".react-results--main").shouldHave(text("Текст"));
    }
}