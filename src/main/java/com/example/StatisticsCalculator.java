package com.example;
import java.util.Scanner;

public class StatisticsCalculator {
    public static void main(String[] args) {
       /*Add basic validation for non-numeric input (using loops and character verification)
 */ 
    Scanner scanner = new Scanner(System.in); // Create once
    int number;
    int sum = 0;
    int count = 0;
    int max = Integer.MIN_VALUE; // Initialize to smallest possible integer
    int min = Integer.MAX_VALUE; // Initialize to largest possible integer      
    double average;
    System.out.println("Enter numbers one by one. Enter 0 to finish:");
    while (true) {
        //check if non -numeric input 
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            scanner.next(); // Clear invalid input
            }
        number = scanner.nextInt();
        if (number == 0) {
            break; // Exit loop on sentinel value       
        }
        sum += number; // Update sum
        count++; // Update count
        if (number > max) {
            max = number; // Update max if current number is greater 
        }      
        if (number < min) {
            min = number; // Update min if current number is smaller       
        }   }
    scanner.close();
    if (count > 0) {
        average = (double) sum / count; // Calculate average
        System.out.println("Total Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);  
        System.out.println("Average: " + average);
    } else {
        System.out.println("No numbers were entered.");}
    }}