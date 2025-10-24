
package javalabtask;

import java.util.Scanner;


public class q8 {
    
    
    public static void checkPassword(String password) {
        int length = password.length();
        
        // Check if password is too short
        if (length < 6) {
            System.out.println("Too Short");
            return;
        }
        
        // Analyze password composition
        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        
        String specialChars = "!@#$%^&*";
        
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else {
                    hasLowerCase = true;
                }
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (specialChars.indexOf(c) != -1) {
                hasSpecialChar = true;
            }
        }
        
        // Determine strength based on length and composition
        if (length >= 6 && length <= 10) {
            // Check for Strong case: has both upper and lower case (counts as Strong)
            if (hasUpperCase && hasLowerCase) {
                System.out.println("Strong");
            }
            // Check for Medium: has both letters and digits
            else if (hasLetter && hasDigit) {
                System.out.println("Medium");
            }
            // Check for Weak: only letters OR only digits
            else if (hasLetter || hasDigit) {
                System.out.println("Weak");
            }
            else {
                System.out.println("Weak");
            }
        }
        else if (length > 10) {
            // Strong: length > 10 AND has letters, digits, and special characters
            if (hasLetter && hasDigit && hasSpecialChar) {
                System.out.println("Strong");
            }
            // If length > 10 but doesn't meet Strong criteria, apply 6-10 rules
            else if (hasUpperCase && hasLowerCase) {
                System.out.println("Strong");
            }
            else if (hasLetter && hasDigit) {
                System.out.println("Medium");
            }
            else {
                System.out.println("Weak");
            }
        }
    }
    
    // Test method to verify the implementation
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter password: ");
        String Password =x.nextLine();
        System.out.println("Testing Password Strength Checker:");
        
        checkPassword(Password);
          }
}

