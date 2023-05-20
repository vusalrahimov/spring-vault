package io.desofme.vault.controller;

import io.desofme.vault.property.Currency;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/currency")
@RequiredArgsConstructor
public class CurrencyController {

    private final Currency currency;

    @GetMapping("/list")
    public List<String> getAll() {
        return currency.getCurrencies();
    }

}