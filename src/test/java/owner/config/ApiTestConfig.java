package owner.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({"file:/Users/s.fedulov/Documents/apiTest.properties",
        "classpath:apiTest.properties"
})
public interface ApiTestConfig extends Config {

    @Key("baseUrl")
    String getBaseUrl();

    @Key("token")
    String getToken();
}
