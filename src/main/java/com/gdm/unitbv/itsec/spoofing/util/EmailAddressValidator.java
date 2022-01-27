package com.gdm.unitbv.itsec.spoofing.util;

public class EmailAddressValidator {

    public static boolean validateEmailAddress(String emailAddress){

        return emailAddress != null &&
                !emailAddress.isEmpty() &&
                isValidEmailAddress(emailAddress);
    }

    private static boolean isValidEmailAddress(String emailAddress) {

        return emailAddress.length() > 10 &&
                (emailAddress.contains("@yahoo.com") || emailAddress.contains("@gmail.com"));
    }
}
