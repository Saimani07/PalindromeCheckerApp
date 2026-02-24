import java.util.*;

/**
 * =============================================================================
 * STRATEGY INTERFACE
 * =============================================================================
 */
interface PalindromeStrategy {
    boolean isValid(String input);
}

/**
 * STRATEGY 1: Stack-Based
 */
class StackStrategy implements PalindromeStrategy {
    public boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

/**
 * STRATEGY 2: Two-Pointer / Array-Based
 */
class ArrayStrategy implements PalindromeStrategy {
    public boolean isValid(String input) {
        int start = 0, end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start++) != input.charAt(end--)) return false;
        }
        return true;
    }
}

/**
 * =============================================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =============================================================================
 * * Use Case 12: Strategy Pattern (Advanced)
 * * Description: Demonstrates switching algorithms dynamically at runtime.
 * * @author saimani07
 * @version 12.0
 */
public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "kayak";

        // Context decides which strategy to use at runtime
        PalindromeStrategy strategy;

        // Using Stack Strategy
        strategy = new StackStrategy();
        System.out.println("Using Stack: " + strategy.isValid(word));

        // Switching to Array Strategy dynamically
        strategy = new ArrayStrategy();
        System.out.println("Using Array: " + strategy.isValid(word));
    }
}