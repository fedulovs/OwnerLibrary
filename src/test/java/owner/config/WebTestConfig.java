package owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${remote}.properties"})
public interface WebTestConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("version")
    @DefaultValue("93")
    int browserVersion();

    @Key("baseUrl")
    @DefaultValue("https://ya.ru")
    String baseUrl();

    @Key("webDriver")
    @DefaultValue("221")
    String webDriver();
}
