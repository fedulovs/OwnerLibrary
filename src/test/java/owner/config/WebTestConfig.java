package owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebTestConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("version")
    @DefaultValue("93")
    int browserVersion();

    @Key("webDriver")
    @DefaultValue("")
    URL webDriver();





// Имя браузера
//
// Версия браузера
//
// Локальный или удаленный (RemoteWebDriver)
}
