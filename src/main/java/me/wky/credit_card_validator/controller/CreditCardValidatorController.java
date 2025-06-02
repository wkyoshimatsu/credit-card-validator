package me.wky.credit_card_validator.controller;

import me.wky.credit_card_validator.model.CardType;
import me.wky.credit_card_validator.service.CreditCardValidatorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardValidatorController {
    @PostMapping("/validate-card")
    public CardType validateCreditCard(@RequestBody String cardNumber) {
        return CreditCardValidatorService.validate(cardNumber);
    }
}
