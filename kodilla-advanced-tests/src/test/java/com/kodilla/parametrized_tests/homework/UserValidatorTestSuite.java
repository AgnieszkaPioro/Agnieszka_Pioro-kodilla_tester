package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"a8-", "A.B_", "12345", "eeee", "abc123"})

    public void shouldReturnTrueIfUsernameMatches(String text) {
        assertTrue(validator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "A.B_ ", "12!?", "eeee@", "a5", "", " "})

    public void shouldReturnFalseIfUsernameNotMatches(String text) {
        assertFalse(validator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"agnieszka@wp.pl", "12345@wp.pl", "A-4@bb.com", ""})

    public void shouldReturnTrueIfEmailMatches(String email) {
        assertTrue(validator.validateEmail(email));
    }
    @ParameterizedTest
    @ValueSource(strings = {"lalala.pl", "agnieszkaaa-pioro@@wp.pl", "a bcd@wp.pl", "pszczółka@wp.pl"})

    public void shouldReturnFalseIfEmailNotMatches(String email) {
        assertFalse(validator.validateEmail(email));
    }
}
