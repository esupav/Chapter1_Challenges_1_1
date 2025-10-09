/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbebirrmobile.banking;
import java.util.Scanner;
/**
 *
 * @author hi
 */
public class CBEbirrMobileBanking {

    private static final String CORRECT_USERNAME = "Esubalew Kifle";
    private static final String CORRECT_PASSWORD = "199615";
    private static double accountBalance = 50000.34;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to CBE Mobile Banking");
        System.out.println("=============================");

        boolean loggedIn = false;

        while (true) {
            if (!loggedIn) {
                System.out.println("\n1. Login");
                System.out.println("2. Exit");
                System.out.print("Enter your choice: ");

                int choice;
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }

                switch (choice) {
                    case 1:
                        loggedIn = login(scanner);
                        break;
                    case 2:
                        System.out.println("Thank you for using CBE Mobile Banking. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                // Main menu after login
                System.out.println("\nCBE Mobile Banking - Main Menu");
                System.out.println("1. Check Balance");
                System.out.println("2. Transfer to CBE Account");
                System.out.println("3. Transfer to CBE Wallet");
                System.out.println("4. Transfer to other Bank Account");             
                System.out.println("5. Make Utility Payment");
                System.out.println("6. Logout");
                System.out.print("Enter your choice: ");

                int choice;
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }

                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        transferToCBEAccount(scanner);
                        break;
                    case 3:
                        transferToCBEWallet(scanner);
                        break;
                    case 4:
                        transferToOtherBankAccount(scanner);
                        break;
                    case 5:
                        makeUtilityPayment(scanner);
                        break;
                    case 6:
                        loggedIn = false;
                        System.out.println("You have been logged out successfully.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

    private static boolean login(Scanner scanner) {
        System.out.println("\nCBE Mobile Banking - Login");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password. Please try again.");
            return false;
        }
    }

    private static void checkBalance() {
        System.out.println("Your account balance is: " + accountBalance + " ETB");
    }

    private static void transferToCBEAccount(Scanner scanner) {
        System.out.println("\nTransfer to CBE Account");
        System.out.print("Enter recipient account number: ");
        String recipientAccountNumber = scanner.nextLine();
        System.out.print("Enter amount to transfer: ");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a number.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        if (amount > accountBalance) {
            System.out.println("Insufficient balance.");
            return;
        }

        accountBalance -= amount;
        System.out.println("Successfully transferred " + amount + " ETB to account " + recipientAccountNumber);
        System.out.println("Your new balance is: " + accountBalance + " ETB");
    }

    private static void transferToCBEWallet(Scanner scanner) {
        System.out.println("\nTransfer to CBE Wallet");
        System.out.print("Enter recipient CBE Wallet number: ");
        String recipientWalletNumber = scanner.nextLine();
        System.out.print("Enter amount to transfer: ");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a number.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        if (amount > accountBalance) {
            System.out.println("Insufficient balance.");
            return;
        }

        accountBalance -= amount;
        System.out.println("Successfully transferred " + amount + " ETB to CBE Wallet " + recipientWalletNumber);
        System.out.println("Your new balance is: " + accountBalance + " ETB");
    }

    private static void transferToOtherBankAccount(Scanner scanner) {
        System.out.println("\nTransfer to other Bank Account");
        System.out.print("Enter recipient bank name: ");
        String recipientBankName = scanner.nextLine();
        System.out.print("Enter recipient account number: ");
        String recipientAccountNumber = scanner.nextLine();
        System.out.print("Enter amount to transfer: ");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a number.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        if (amount > accountBalance) {
            System.out.println("Insufficient balance.");
            return;
        }

        accountBalance -= amount;
        System.out.println("Successfully transferred " + amount + " ETB to account " + recipientAccountNumber + " at " + recipientBankName);
        System.out.println("Your new balance is: " + accountBalance + " ETB");
    }

    private static void makeUtilityPayment(Scanner scanner) {
        System.out.println("\nMake Utility Payment");
        System.out.print("Enter utility type (e.g., electricity, water, internet): ");
        String utilityType = scanner.nextLine();
        System.out.print("Enter account/meter number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to pay: ");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a number.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        if (amount > accountBalance) {
            System.out.println("Insufficient balance.");
            return;
        }

        accountBalance -= amount;
        System.out.println("Successfully paid " + amount + " ETB for " + utilityType + " account " + accountNumber);
        System.out.println("Your new balance is: " + accountBalance + " ETB");
    }
}
