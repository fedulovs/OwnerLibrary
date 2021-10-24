package owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import owner.config.ApiTestConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiTests {

    private ApiTestConfig config;

    @Test
    public void apiTest() {
        config = ConfigFactory.create(ApiTestConfig.class, System.getProperties());
        assertThat(config.getBaseUrl()).isEqualTo("https://github.com");
        assertThat(config.getToken()).isEqualTo("123");
    }
}
