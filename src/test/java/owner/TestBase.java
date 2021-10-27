package owner;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import owner.config.WebTestConfig;


public class TestBase {
    @BeforeAll
    static void setup() {
        WebTestConfig config = ConfigFactory.create(WebTestConfig.class, System.getProperties());
        Configuration.remote = String.valueOf(config.webDriver());
        Configuration.startMaximized = true;
        Configuration.browser = config.browser();
    }
}
