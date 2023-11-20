package config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class WebConfigProject {
    private final WebConfig webConfig;

    public WebConfigProject(WebConfig webConfig) {
        this.webConfig = webConfig;
    }

    public void webConfig() {
        Configuration.baseUrl = webConfig.baseUrl();
        Configuration.browser = webConfig.browser();
        Configuration.browserVersion = webConfig.browserVersion();
        Configuration.browserSize = webConfig.browserSize();
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 10000;

        if (webConfig.isRemote()) {
            Configuration.remote = webConfig.remoteUrl();

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;
        }
    }
}
