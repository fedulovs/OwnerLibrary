package owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import owner.TestBase;
import owner.config.WebTestConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTests extends TestBase {

    private WebTestConfig config;

    @Test
    public void apiTest() {
        config = ConfigFactory.create(WebTestConfig.class, System.getProperties());
        assertThat(config.browser()).isEqualTo("https://github.com");
        assertThat(config.browserVersion()).isEqualTo("123");
        assertThat(config.webDriver()).isEqualTo("123");
    }

    @Test
    public void titleTest() {
        config = ConfigFactory.create(WebTestConfig.class, System.getProperties());
        System.out.println(config.baseUrl() + "" + config.webDriver() + "" + config.browser() + "" + config.browserVersion());
    }
}
