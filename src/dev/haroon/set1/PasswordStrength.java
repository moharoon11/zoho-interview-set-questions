package dev.haroon.set1;

import java.util.regex.Pattern;
/**
 * 2. Password Strength
 *
 * Find the strength of the given password string based on the conditions
 *
 * Four rules were given based on the type and no. of characters in the string.
 *
 * Weak – only Rule 1 is satisfied or Rule 1 is not satisfied
 *
 * Medium – Two rules are satisfied
 *
 * Good – Three rules satisfied
 *
 * Strong – All Four rules satisfied
 *
 *
 * I/P: Qw!1        O/P: Weak
 *
 * I/P: Qwertyuiop      O/P: Medium
 *
 * I/P: QwertY123       O/P: Good
 *
 * I/P: Qwerty@123    O/P: Strong
 */


public class PasswordStrength {

    public static void main(String[] args) {
        System.out.println(checkStrength("Qw!1")); // Weak
        System.out.println(checkStrength("Qwertyuiop")); // Medium
        System.out.println(checkStrength("QwertY123")); // Good
        System.out.println(checkStrength("Qwerty@123")); // Strong
    }

    private static final Pattern UPPERCASE_PATTERN = Pattern.compile("[A-Z]");
    private static final Pattern DIGIT_PATTERN = Pattern.compile("\\d");
    private static final Pattern SPECIAL_CHARACTER_PATTERN = Pattern.compile("[!@#$%^&*()-+]");

    private static String checkStrengthUsingPatters(String password) {
        boolean rule1 = password.length() >= 6;
        boolean rule2 = UPPERCASE_PATTERN.matcher(password).find();
        boolean rule3 = DIGIT_PATTERN.matcher(password).find();
        boolean rule4 = SPECIAL_CHARACTER_PATTERN.matcher(password).find();

        if (rule1 && rule2 && rule3 && rule4) {
            return "Strong";
        } else if (rule1 && ((!rule2 && rule3 && rule4) || (rule2 && !rule3 && rule4) || (rule2 && rule3 && !rule4))) {
            return "Good";
        } else if (rule1 && ((rule2 && !rule3) || (!rule2 && rule3) || (!rule2 && rule4) || (!rule3 && rule4))) {
            return "Medium";
        } else {
            return "Weak";
        }
    }

    private static String checkStrength(String password) {

        boolean rule1 = password.length() >= 6;
        boolean rule2 = false;
        boolean rule3 = false;
        boolean rule4 = false;

        String specialCharacters = "!@#$%^&*()-+";

        for(int i=0; i<password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)) {
                rule2 = true;
            } else if(Character.isDigit(ch)) {
                rule3 = true;
            } else if(specialCharacters.contains(String.valueOf(ch))) {
                rule4 = true;
            }
        }

        if(rule1 && rule2 && rule3 && rule4) {
            return "Strong";
        } else if(rule1 && ((!rule2 && rule3 && rule4) || (rule2 && !rule3 && rule4) || (rule2 && rule3 && !rule4)) ) {
            return "Good";
        } else if(rule1 && ((rule2 && !rule3) || (!rule2 && rule3) || (!rule2 && rule4) || (!rule3 && rule4)) ) {
            return "Medium";
        } else {
            return "Weak";
        }

    }
}
