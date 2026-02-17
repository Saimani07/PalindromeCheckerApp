/*
MAIN CLASS UseCase3PalindromeCheckerApp
Use Case 3: Reverse String Based Palindrome Check
Description:
This class checks whether a string is a palindrome by reversing the string and comparing it with
* the original value.
        At this stage, the application:
Iterates the string in reverse order
Builds a reversed version
Compares original and reversed strings
Displays the validation result
This introduces transformation-based validation.
@author Saimani07
@version 3.0
*/
public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse using loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}
