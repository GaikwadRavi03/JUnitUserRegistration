package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean userFirstName(String firstName) {
        Pattern firstNamePattern= Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match=firstNamePattern.matcher(firstName);
        if (match.matches())
            return true;
        else
            return false;
    }

}
