/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_poe_part1;

import java.util.Scanner;

/**
 * 
 * 
 * @author Student
 */

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserLogin userLogin = new UserLogin();
        
        // REGISTRATION 
       
        System.out.println("welcome! Lets get you REGISTERED!");
        
        
        boolean registrationComplete = false;
        
        while (!registrationComplete) {
            System.out.print("\nEnter name: ");
            String firstName = input.nextLine();
            
            System.out.print("Enter surname: ");
            String lastName = input.nextLine();
            
            System.out.print("Enter username (must contain '_' and be ≤ 5 characters): ");
            String username = input.nextLine();
            
            System.out.print("Enter password (8+ characters, 1 capital, 1 number, 1 special characters): ");
            String password = input.nextLine();
            
            System.out.print("Enter cell phone number (e.g., +27662722126): ");
            String phoneNumber = input.nextLine();
            
            String registrationResult = userLogin.registerUser(username, password,phoneNumber, firstName, lastName);
            System.out.println("\n" + registrationResult);
            
            // Check if registration was successful (no error message)
            if (registrationResult.equals("Cell phone number successfully added.")) {
                registrationComplete = true;
                System.out.println("\n✓ Registration complete! Please login.\n");
            } else {
                System.out.println("\nPlease try again.\n");
            }
        }
        
        // LOGIN 
        
        System.out.println("LOGIN");
        
        boolean loggedIn = false;
        int attempts = 0;
        int maxAttempts = 3;
        
        while (!loggedIn && attempts < maxAttempts) {
            System.out.print("\nEnter username: ");
            String loginUsername = input.nextLine();
            
            System.out.print("Enter password: ");
            String loginPassword = input.nextLine();
            
            boolean loginResult = userLogin.loginUser(loginUsername, loginPassword);
            String loginMessage = userLogin.returnLoginStatus(loginResult);
            
            System.out.println(loginMessage);
            
            if (loginResult) {
                loggedIn = true;
                System.out.println("\n✓ You have successfully logged into the Chat App!");
            } else {
                attempts++;
                if (attempts < maxAttempts) {
                    System.out.println("Attempts remaining: " + (maxAttempts - attempts));
                }
            }
        }
        
        if (!loggedIn) {
            System.out.println("\n✗ Too many failed attempts. Please restart the application.");
        }
        
        input.close();
    }
}