/**
 MAIN CLASS UseCase Palindrome CheckerApp
 Use Case 6: Queue Stack Fairness Check
 Description:
 This class demonstrates palindrome validation using
 two different data structures:
 Queue (FIFO First In First Out)
 Stack (LIFO Last In First Out).
 Characters are inserted into both structures and then compared by removing from the front of the queue and the top of the stack.
 If all characters match, the input string is confirmed as a palindrome.
 This use case helps understand how FIFO and LIFD behaviors can be combined for symmetric comparison.
 @author Saimani07g
 @version 6.0
 */
import java.util.*;

public class Usecase6PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                ch = Character.toLowerCase(ch);
                queue.add(ch);
                stack.push(ch);
            }
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}
