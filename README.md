# SecretIntegerDecryption

## Student Information
- Name: Esubalew Kifle  
- Student ID: Trns-0056/24
- Course: Java Programming

------------------------------------------------------------
Description:
------------------------------------------------------------
This program simulates a secret agent's decryption task.
The agent intercepts a coded integer, and the real message is hidden
inside its digits. By performing a series of mathematical operations,
the program extracts and combines parts of the number to reveal
a decrypted code.

------------------------------------------------------------
Program Functionality:
------------------------------------------------------------
1. The user enters a single positive integer (e.g., 13579).
2. The program performs the following operations using only
   mathematical operators and no loops or conditionals (except input validation):
   • Extracts the first digit.
   • Extracts the last digit.
   • Calculates the product of the first and last digits.
   • Extracts the second and second-last digits.
   • Calculates their sum.
   • Concatenates the product and the sum to form the final decrypted code.

Example:
Input: 13579
Process:
   First Digit = 1
   Last Digit = 9
   Second Digit = 3
   Second-Last Digit = 7
   Product = 1 × 9 = 9
   Sum = 3 + 7 = 10
   Final Code = "9" + "10" → 910

Output:
The decrypted code is: 910

------------------------------------------------------------
Key Concepts Used:
------------------------------------------------------------
• Scanner for input reading
• Mathematical operators (/ and %)
• Math.log10() and Math.pow() to determine digit positions
• String concatenation for final code
• Type casting from double to int
• Input validation to ensure the number is positive

------------------------------------------------------------
Sample Run:
------------------------------------------------------------
Enter the secret integer: 13579
The decrypted code is: 910

------------------------------------------------------------
Error Handling:
------------------------------------------------------------
If the user enters a non-positive integer (0 or negative),
the program displays:
   "Please enter a positive integer."
and terminates safely.

------------------------------------------------------------
Learning Reflection:
------------------------------------------------------------
This challenge demonstrates how mathematical logic alone
can extract and manipulate digits from an integer without
using conditional statements or loops. It also provides
practice in combining numerical and string operations to
produce formatted output.

------------------------------------------------------------
