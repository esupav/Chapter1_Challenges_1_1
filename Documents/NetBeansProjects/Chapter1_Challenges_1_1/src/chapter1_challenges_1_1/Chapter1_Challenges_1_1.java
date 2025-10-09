/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1_challenges_1_1;

import java.util.Scanner;

public class Chapter1_Challenges_1_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the secret integer: ");
        
        int n = sc.nextInt(); 

        // Ensure n is positive to avoid math errors
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        int digits = (int) Math.log10(n);

        int first = n / (int) Math.pow(10, digits);
        int last = n % 10;
        int second = (n / (int) Math.pow(10, digits - 1)) % 10;
        int secondLast = (n / 10) % 10;

        int product = first * last;
        int sum = second + secondLast;

        String finalCode = String.valueOf(product) + String.valueOf(sum);

        System.out.println("The decrypted code is: " + finalCode);

        sc.close(); 
    }
}