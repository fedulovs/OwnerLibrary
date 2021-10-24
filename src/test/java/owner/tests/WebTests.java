package owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import owner.config.WebTestConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTests {

    private WebTestConfig config;

    @Test
    public void apiTest() {
        config = ConfigFactory.create(WebTestConfig.class, System.getProperties());
        assertThat(config.browser()).isEqualTo("https://github.com");
        assertThat(config.browserVersion()).isEqualTo("123");
        assertThat(config.webDriver()).isEqualTo("123");
    }
}
