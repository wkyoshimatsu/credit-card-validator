package me.wky.credit_card_validator.service;

import me.wky.credit_card_validator.model.CardType;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;
@Service
public class CreditCardValidatorService {

    public static CardType validate(String cardNumber) {
        if (cardNumber == null || cardNumber.isEmpty()) {
            return CardType.UNKNOWN;
        }

        cardNumber = cardNumber.replaceAll("\\s+", ""); // Remove espaços

        if (Pattern.matches("^5[1-5][0-9]{14}$", cardNumber)) {
            return CardType.MASTERCARD;
        } else if (Pattern.matches("^4[0-9]{12}(?:[0-9]{3})?$", cardNumber)) {
            return CardType.VISA;
        } else if (Pattern.matches("^3[47][0-9]{13}$", cardNumber)) {
            return CardType.AMERICAN_EXPRESS;
        } else if (Pattern.matches("^3(?:0[0-5]|[68][0-9])[0-9]{11}$", cardNumber)) {
            return CardType.DINERS_CLUB;
        } else if (Pattern.matches("^6(?:011|5[0-9]{2})[0-9]{12}$", cardNumber)) {
            return CardType.DISCOVER;
        } else if (Pattern.matches("^2(?:014|149)[0-9]{11}$", cardNumber)) { // Corrigido para Enroute
            return CardType.ENROUTE;
        } else if (Pattern.matches("^(?:2131|1800|35\\d{3})\\d{11}$", cardNumber)) {
            return CardType.JCB;
        } else if (Pattern.matches("^8699[0-9]{11}$", cardNumber)) {
            return CardType.VOYAGER;
        } else if (Pattern.matches("^606282[0-9]{10}$", cardNumber)) { // Corrigido para Hipercard
            return CardType.HIPERCARD;
        } else if (Pattern.matches("^50[0-9]{14,17}$", cardNumber)) {
            return CardType.AURA;
        } else {
            return CardType.UNKNOWN;
        }
    }
}
