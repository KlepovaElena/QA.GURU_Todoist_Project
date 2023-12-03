package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:authorization.properties",
})

public interface AuthorizationConfig extends Config{
    @Key("email")
    String getEmail();

    @Key("password")
    String getPassword();
}
