package config;

import org.aeonbits.owner.ConfigFactory;

public enum AuthorizationConfigReader {
    Instance;
    public static final AuthorizationConfig authorizationConfig =
            ConfigFactory.create(
                    AuthorizationConfig.class,
                    System.getProperties()
            );
    public AuthorizationConfig read() {
        return authorizationConfig;
    }
}
