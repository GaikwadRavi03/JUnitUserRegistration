package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean userFirstName(String firstName) {
        Pattern firstNamePattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = firstNamePattern.matcher(firstName);
        if (match.matches())
            return true;
        else
            return false;
    }

    public static boolean userLastName(String lastName) {
        Pattern lastNamePattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = lastNamePattern.matcher(lastName);
        if (match.matches())
            return true;
        else
            return false;
    }


    public Boolean validateUserEmail(String userEmail) {
        Pattern lastNamePattern = Pattern.compile("^[a-zA-Z0-9]([._+]{0,1}[a-zA-Z0-9])*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2}){0,1}$");
        Matcher match = lastNamePattern.matcher(userEmail);
        if (match.matches())
            return true;
        else
            return false;
    }
}

