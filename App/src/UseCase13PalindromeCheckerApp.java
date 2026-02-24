/**
 * =============================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =============================================================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution time of different
 * palindrome checking algorithms.
 * * At this stage, the application:
 * - Executes multiple algorithms (Array-based vs. Stack-based)
 * - Captures start and end times using System.nanoTime()
 * - Displays the time taken for each approach
 * * @author vamsikoneru06
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        String testInput = "racecar".repeat(1000); // Larger string for measurable results

        // --- Benchmark 1: Array-Based Logic ---
        long startArray = System.nanoTime();
        checkArray(testInput);
        long endArray = System.nanoTime();
        long durationArray = endArray - startArray;

        // --- Benchmark 2: Stack-Based Logic ---
        long startStack = System.nanoTime();
        checkStack(testInput);
        long endStack = System.nanoTime();
        long durationStack = endStack - startStack;

        // Display results
        System.out.println("Performance Comparison Results:");
        System.out.println("Array-Based Time: " + durationArray + " nanoseconds");
        System.out.println("Stack-Based Time: " + durationStack + " nanoseconds");
    }

    private static boolean checkArray(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    private static boolean checkStack(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) stack.push(c);
        for (char c : s.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}