/*MAIN CLASS UseCase 7PalindromeCheckerApp
Use Case 7: Deque Based Optimized Palindrome Checker
Description:
        * This class validates a palindrome using a Deque
        (Double Ended Queue).
Characters are inserted into the deque and then compared by removing elements from both ends:
removeFirst()
removeLast()
This avoids reversing the string and provides an efficient front-to-back comparison approach.
This use case demonstrates optimal bidirectional
traversal using Deque.
@author saimani07
@version 7.6
import java.util.*;
 */

public class Usecase7PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                deque.addLast(Character.toLowerCase(ch));
            }
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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