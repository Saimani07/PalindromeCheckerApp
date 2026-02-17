/*
MAIN CLASS Use Case2Palindrome CheckerApp
Use Case 2: Hardcoded Palindrome Validation
Description:
This class demonstrates basic palindrome validation
        using a hardcoded string value.
At this stage, the application:
Stores a predefined string
Compares characters from both ends
-Determines whether the string is a palindrome
Displays the result on the console
This use case introduces fundamental comparison logic
before using advanced data structures.
@author Developer
@version 2.0
*/
public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}

