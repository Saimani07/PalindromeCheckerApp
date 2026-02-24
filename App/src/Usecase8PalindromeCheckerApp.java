/**
 MAIN CLASS UseCase@PalindromeCheckerApp
 Use Case 8: Linked List Based Palindrome Checker
 Description:
 This class checks shether a string is a palindrome
 using a LinkedList.
 Characters are added to the list and then compared by removing elements from both ends:
 removeFirst()
 removelust()
 This demonstrates how LinkedList supports
 double-ended operations for symmetric validation.
 * @author Developer
 @version 8.0
import java.util.*;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}
 */

public class Usecase8PalindromeCheckerApp {

    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        Node slow = head, fast = head;

        // Find middle using fast & slow pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        // Compare both halves
        Node temp = secondHalf;
        while (temp != null) {
            if (firstHalf.data != temp.data)
                return false;
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        Node head = null, tail = null;

        // Convert string to linked list
        for (char ch : input.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                Node newNode = new Node(ch);
                if (head == null) {
                    head = tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
        }

        if (isPalindrome(head))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}