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
            Assert.assertTrue(UserRegistration.userFirstName("ravi@"));
        }
        @Test
        public void givenMessageShowTrueWhenLastNameWithCapitalLetter() {
            Assert.assertTrue(UserRegistration.userLastName("Gaikwad"));
        }
}
