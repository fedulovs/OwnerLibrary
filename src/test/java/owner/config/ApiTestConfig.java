package owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:apiTest.properties"})
public interface ApiTestConfig extends Config {

    @Key("baseUrl")
    String getBaseUrl();

    @Key("token")
    String getToken();
}
