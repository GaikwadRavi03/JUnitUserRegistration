package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenMessageShowTrueWhenFirstNameWithCapitalLetter() {
        Assert.assertTrue(UserRegistration.userFirstName("Ravi"));
    }

    @Test
    public void givenMessageShowFalseWhenFirstNameWithoutCapitalLetterAndWithSymbols() {
        Assert.assertFalse(UserRegistration.userFirstName("ravi@"));
    }

    @Test
    public void givenMessageShowTrueWhenLastNameWithCapitalLetter() {
        Assert.assertTrue(UserRegistration.userLastName("Gaikwad"));
    }

    @Test
    public void givenMessageShowFalseWhenLastNameWithoutCapitalLetterAndWithSymbols() {
        Assert.assertFalse(UserRegistration.userLastName("g$aikwad#"));
    }

    @Test
    public void givenMessageShowTrueWhenMobNoIsValidWithCountryCode() {
        Assert.assertTrue(UserRegistration.userMobNo("91 9876543210"));
    }

    @Test
    public void givenMessageShowFalseWhenMobNoIsNOtValidWithLessThan10Digits() {
        Assert.assertFalse(UserRegistration.userMobNo("91 987654210"));
    }

    @Test
    public void givenMessageShowFalseWhenMobNoIsNOtValidWithGreaterThan10Digits() {
        Assert.assertFalse(UserRegistration.userMobNo("91 98765421000"));
    }
}
