package com.userregistration;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class userPasswordTest {

    private String argument;
    private static UserRegistration userRegistration;
    private boolean expectedValidation;

    public userPasswordTest(String argument, boolean expectedValidation) {
        this.argument = argument;
        this.expectedValidation = expectedValidation;
    }

    @BeforeClass
    public static void initialize() {
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"Password123",true},
                {"passWord",true},
                {"pass1234",true},
                {"PASS1234",true},
                {"12345678",true},
                {"PASSWORD",true},
                {"PASSword",true},
                {"PASSword",true},
                {"12PA34ss",true}};

        return Arrays.asList(data);
    }

    @Test
    public void Test() {
        Boolean result = userRegistration.validateUserPassword(this.argument);
        Assert.assertEquals(this.expectedValidation, result);
    }
}
