import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class YandexTest {
    @Test
    void yandexTest() {
        Configuration.pageLoadStrategy = "eager";
        open("https://ya.ru");
    }
}