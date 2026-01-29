package com.alphaben.xrocketemail.email;

import java.util.regex.Pattern;

/**
 *
 * @author ebennamr
 */
public class EmailValidator {

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
    private final Pattern pattern;
    private int validEmailCount = 0;

    public int getValidEmailCount() {
        return validEmailCount;
    }

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean isValidEmail(String email) {
        boolean isValid = pattern.matcher(email).matches();

        if (isValid) {
            this.validEmailCount++;
        }

        return isValid;
    }

}
