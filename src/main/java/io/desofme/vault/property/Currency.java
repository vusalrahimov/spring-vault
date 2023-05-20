package io.desofme.vault.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "top")
public class Currency {

    private List<String> currencies;

}