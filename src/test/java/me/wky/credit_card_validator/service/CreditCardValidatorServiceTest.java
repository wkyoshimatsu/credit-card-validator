package me.wky.credit_card_validator.service;

import me.wky.credit_card_validator.model.CardType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidatorServiceTest {

    @Test
    void testMasterCardValidation() {
        String cardNumber = "5125 6027 8815 3627";
        assertEquals(CardType.MASTERCARD, CreditCardValidatorService.validate(cardNumber));
    }

    @Test
    void testVisaValidation() {
        String cardNumber = "4929 2398 3670 3565";
        assertEquals(CardType.VISA, CreditCardValidatorService.validate(cardNumber));
    }

    @Test
    void testAmericanExpressValidation() {
        String cardNumber = "3721 201989 05115";
        assertEquals(CardType.AMERICAN_EXPRESS, CreditCardValidatorService.validate(cardNumber));
    }

    @Test
    void testDinersClubValidation() {
        String cardNumber = "3005 187934 2571";
        assertEquals(CardType.DINERS_CLUB, CreditCardValidatorService.validate(cardNumber));
    }

    @Test
    void testDiscoverValidation() {
        String cardNumber = "6011 1651 7343 2472";
        assertEquals(CardType.DISCOVER, CreditCardValidatorService.validate(cardNumber));
    }

    @Test
    void testEnrouteValidation() {
        String cardNumber = "2014 9871031 8869";
        assertEquals(CardType.ENROUTE, CreditCardValidatorService.validate(cardNumber));
    }

    @Test
    void testJCBValidation() {
        String cardNumber = "3588 7441 6526 6591";
        assertEquals(CardType.JCB, CreditCardValidatorService.validate(cardNumber));
    }

    @Test
    void testVoyagerValidation() {
        String cardNumber = "86997 8620 69780 2";
        assertEquals(CardType.VOYAGER, CreditCardValidatorService.validate(cardNumber));
    }

    @Test
    void testHipercardValidation() {
        String cardNumber = "6062 8244 8623 7725";
        assertEquals(CardType.HIPERCARD, CreditCardValidatorService.validate(cardNumber));
    }

    @Test
    void testAuraValidation() {
        String cardNumber = "5002 4532 2865 9411";
        assertEquals(CardType.AURA, CreditCardValidatorService.validate(cardNumber));
    }

    @Test
    void testNullCardValidation() {
        String cardNumber = null;
        assertEquals(CardType.UNKNOWN, CreditCardValidatorService.validate(cardNumber));
    }

    @Test
    void testEmptyCardValidation() {
        String cardNumber = "";
        assertEquals(CardType.UNKNOWN, CreditCardValidatorService.validate(cardNumber));
    }

    @Test
    void testUnknownCardValidation() {
        String cardNumber = "1234567890123456";
        assertEquals(CardType.UNKNOWN, CreditCardValidatorService.validate(cardNumber));
    }

}