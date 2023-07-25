import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class YandexTest {
    @Test
    void yandexTest() {
        Configuration.pageLoadStrategy = "eager";
       //edit for ya.ru open("https://www.google.com/");
    }
}