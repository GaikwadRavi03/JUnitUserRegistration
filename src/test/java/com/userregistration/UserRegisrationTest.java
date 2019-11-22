package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegisrationTest {

        @Test
        public void givenMessageShowTrueWhenFirstNameWithCapitalLetter() {
            Assert.assertTrue(UserRegistration.userFirstName("Ravi"));
        }
        @Test
        public void givenMessageShowFalseWhenFirstNameWithoutCapitalLetterAndWithSymbols() {
            Assert.assertTrue(UserRegistration.userFirstName("ravi@"));
    }
}
