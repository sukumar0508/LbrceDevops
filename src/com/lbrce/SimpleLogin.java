package com.lbrce;

import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        // Predefined username and password
        String correctUsername = "admin";
        String correctPassword = "password";

        Scanner scanner = new Scanner(System.in);

        // Input for username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Input for password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check if username and password match
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        scanner.close();
    }
}
