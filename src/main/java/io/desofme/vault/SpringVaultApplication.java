package io.desofme.vault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import io.desofme.vault.property.Currency;

@SpringBootApplication
@EnableConfigurationProperties(Currency.class)
public class SpringVaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringVaultApplication.class, args);
    }

}
