/*MAIN CLASS UseCase RecursivePalindrome
Use Case 0: Recursive Palindrome Checker
Description:
This class validates a palindrome using recursion.
Characters are compared from the outer positions
moving inward using recursive calls.
The recurazon stops when
All characters are matched, ur
A mismatch is found
This use case demonstrates divide-and-conquer
logic using method recursion.
Qauthor Developer
@version 9.0
import java.util.*;
*/

public class UseCase9PalindromeCheckerApp {

    static boolean isPalindrome(String str, int start, int end) {
        // Base condition
        if (start >= end)
            return true;

        // If characters don't match
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        // Remove non-alphanumeric characters
        input = input.replaceAll("[^a-z0-9]", "");

        if (isPalindrome(input, 0, input.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}