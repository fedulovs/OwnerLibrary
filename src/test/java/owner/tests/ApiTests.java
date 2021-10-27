package owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import owner.config.ApiTestConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiTests {

    private ApiTestConfig config;

    // Getting properties from config
    @Test
    public void apiTestHiddenConfig() {
        config = ConfigFactory.create(ApiTestConfig.class, System.getProperties());
        assertThat(config.getBaseUrl()).isEqualTo("https://github.com");
        assertThat(config.getToken()).isEqualTo("123");
    }

    // Getting properties from local file
    @Test
    public void apiTestSystemProperties() {
        System.setProperty("baseUrl", "https://github.com");
        System.setProperty("token", "123");
        assertThat(System.getProperty("baseUrl")).isEqualTo("https://github.com");
        assertThat(System.getProperty("token")).isEqualTo("123");
    }
}
