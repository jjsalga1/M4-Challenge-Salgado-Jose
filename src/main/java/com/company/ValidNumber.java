package com.company;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10:");
        int userInput;
        boolean valid = false;

        while (valid != true) {
            userInput = Integer.parseInt(scan.nextLine());
            if (userInput < 1 || userInput > 10) {
                System.out.println("You must enter a number between 1 and 10. Please try again.");
            } else {
                System.out.println(userInput);
                valid = true;
            }
        }
    }
}
