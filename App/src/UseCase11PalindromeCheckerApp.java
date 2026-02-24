/**
 * =============================================================================
 * SERVICE CLASS - PalindromeService
 * =============================================================================
 * Encapsulates the core logic for palindrome validation.
 */
class PalindromeService {

    /**
     * Checks if a string is a palindrome.
     * This method is reusable by any part of the application.
     */
    public boolean check(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Normalize string (handling case and non-alphanumeric characters)
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = clean.length() - 1;

        while (start < end) {
            if (clean.charAt(start) != clean.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

/**
 * =============================================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * =============================================================================
 * * Use Case 11: Object-Oriented Palindrome Service
 * * Description:
 * This class demonstrates Encapsulation by delegating logic
 * to a separate service class.
 * * @author Saimani07
 * @version 11.0
 */
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {
        // Instantiate the service object
        PalindromeService service = new PalindromeService();

        String testString = "Race Car";

        // Use the service to check the palindrome
        boolean result = service.check(testString);

        // Display results
        System.out.println("Input        : " + testString);
        System.out.println("Is Palindrome: " + result);
    }
}