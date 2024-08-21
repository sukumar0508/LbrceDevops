package com.lbrce;

import java.util.Scanner;

public class SimpleLoginLogout {
    public static void main(String[] args) {
        // Predefined username and password
        String correctUsername = "admin";
        String correctPassword = "password";

        Scanner scanner = new Scanner(System.in);

        // Login process
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
            
            // Logout process
            System.out.println("Do you want to logout? (yes/no)");
            String logoutResponse = scanner.nextLine();

            if (logoutResponse.equalsIgnoreCase("yes")) {
                System.out.println("You have been logged out.");
            } else {
                System.out.println("You are still logged in.");
            }
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        scanner.close();
    }
}
