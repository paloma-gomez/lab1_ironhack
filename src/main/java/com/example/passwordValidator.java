package com.example;
import java.util.Scanner;
public class passwordValidator {
    public static void main(String[] args) {
    /***Step 1: Prompt the user to enter a password.

Step 2: Use a while loop to ensure the password meets all of the following requirements:

At least 8 characters long
Contains at least one uppercase letter
Contains at least one lowercase letter
Contains at least one number
Contains at least one special character (e.g., !@#$%^&*)
Step 3: If the password does not meet all criteria, print the missing requirements and ask the user to re-enter the password.

Step 4: When a valid password is entered, print a success message.

Add Comments
Include comments explaining each condition and loop used in your code.

Allowed methods for verification:
Use for loops to iterate through each character of the string
Use while loops to repeat until the password is valid
Use if conditionals to verify each criterion
Check string length with .length method or equivalent
Compare individual characters using ASCII codes or character ranges
Avoid
Regular expressions (can be used optionally if the language allows it easily)
Language-specific string methods that are not portable between languages
//Allow the user to exit the program by entering “quit” or “exit”

 */
        Scanner scanner = new Scanner(System.in); // Create once
        String password;
        int counter= 0;
        boolean isValid;
        do {
            System.out.print("Please enter a password: ");
            password = scanner.nextLine();
            if (password.equalsIgnoreCase("quit") || password.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }
            isValid = true; // Assume valid until proven otherwise
            StringBuilder missingCriteria = new StringBuilder("Password must have:");

            // Check length
            if (password.length() < 8) {
                isValid = false;
                missingCriteria.append("\n- At least 8 characters long");
            }

            // Check for uppercase letter
            boolean hasUppercase = false;
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                    break;
                }
            }
            if (!hasUppercase) {
                isValid = false;
                missingCriteria.append("\n- At least one uppercase letter");
            }

            // Check for lowercase letter
            boolean hasLowercase = false;
            for (char c : password.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    hasLowercase = true;
                    break;
                }
            }
            if (!hasLowercase) {
                isValid = false;
                missingCriteria.append("\n- At least one lowercase letter");
            }

            // Check for number
            boolean hasNumber = false;
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasNumber = true;
                    break;
                }
            }
            if (!hasNumber) {
                isValid = false;
                missingCriteria.append("\n- At least one number");
            }

            // Check for special character
            boolean hasSpecialChar = false;
            String specialChars = "!@#$%^&*";
            for (char c : password.toCharArray()) {
                if (specialChars.indexOf(c) != -1) {
                    hasSpecialChar = true;
                    break;
                }
            }
            if (!hasSpecialChar) {
                isValid = false;
                missingCriteria.append("\n- At least one special character (e.g., !@#$%^&*)");
            }

            // If not valid, print missing criteria
            if (!isValid) {
                System.out.println(missingCriteria.toString());
            } else {
                System.out.println("Password is valid!");
            }
        counter++;
        } while (!isValid); // Repeat until
        scanner.close();
        System.out.println("You made " + counter + " attempts to set a valid password.");
        //Allow the user to exit the program by entering “quit” or “exit”


    }}
