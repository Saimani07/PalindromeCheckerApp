/*MAIN CLASS UseCaselPalindrome CheckerApp
Use Case 10 Normalized Palindrome Validation
Description:
This class validates a palindrome after preprocessing
        the input string.
Normalization includes:
Removing spaces and synbela
Converting to lowercase
This ensures the palindrome check is Logical rather
than character-format dependent.
Example:
        "A man a plan a canel Panaва"
Nauthar Developer
@version 10.0
*/
import java.util.*;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize string: remove spaces & convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}