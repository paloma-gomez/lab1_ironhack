package com.example;
import java.util.Scanner;

public class SimpleConsoleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create once
        String response = "yes";
        do {
            //Step 1: Prompt the user to enter a number between 1 and 10.
            System.out.print("Please enter a number between 1 and 10: ");
            int number = scanner.nextInt();

            //Step 2: Use a while loop to ensure the user enters a valid number. If the number is outside the range, prompt the user to enter a valid number again until a valid input is provided.
            while (number < 1 || number > 10) { // || is logical OR operator 
                System.out.print("Invalid input. Please enter a number between 1 and 10: ");
                number = scanner.nextInt();
            }
            //Step 3: Once a valid number is entered, use an if-else statement to determine if the number is even or odd. Print a message to the console indicating whether the number is even or odd.
            if (number % 2 == 0) { // modulus operator to check even (divisible by 2)
                System.out.println("The number " + number + " is even.");
            } else {
                System.out.println("The number " + number + " is odd.");
            }   
            // Step 4: Use a for loop to print all numbers from 1 up to the entered number, but skip numbers divisible by 3 using the continue statement.
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0) { // modulus operator to check divisibility by 3 
                    continue;
                }
                System.out.println(i);
            }
            // Step 5: Use a switch statement to print a message based on the entered number. For example:
                //If the number is 1, print “You entered one!”
                //If the number is 2, print “You entered two!”
                //Add cases for at least three numbers, and use a default case to handle any other numbers.
            switch (number) {
                case 1:
                    System.out.println("You entered one!");
                    break;
                case 2:           
                    System.out.println("You entered two!");
                    break; 
                case 3:
                    System.out.println("You entered three!");
                    break;
                case 4:           
                    System.out.println("You entered four!");
                    break;           
                default:
                    System.out.println("You entered a number between 5 and 10!");           
        }
        // Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to run the program again= (yes/no): ");
        response = scanner.next();
        //Use a do-while loop to repeat the program if the user enters “yes.” Exit the loop if the user enters “no.”
        } while (response.equalsIgnoreCase("yes")); 
        scanner.close();
    }
}
//Document Challenges:
// I had troubles with the scanner object as I forgot to close it at the end of the program. 
// I had created the scanner object inside the loop but i never closed it, 
// therefore I had to move the declaration of the scanner object ouside of the loop and then close it (after the do while loop)
