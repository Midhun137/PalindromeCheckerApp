import java.util.Deque;
import java.util.LinkedList;
class PalindromeLinkedList {

    class PalindromeDeque {
        // Node class
        static class Node {
            char data;
            Node next;

            public static void main(String[] args) {
                Node(char data) {
                    this.data = data;
                    this.next = null;
                }
            }

            String word = "racecar";
            // Reverse linked list
            static Node reverse(Node head) {
                Node prev = null;
                Node current = head;

                Deque<Character> deque = new LinkedList<>();
                while (current != null) {
                    Node next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
                }

                // Insert characters into deque
                for (int i = 0; i < word.length(); i++) {
                    deque.addLast(word.charAt(i));
                    return prev;
                }

                // Check palindrome
                static boolean isPalindrome(Node head) {

                    Node slow = head;
                    Node fast = head;

                    // Find middle using fast and slow pointer
                    while (fast != null && fast.next != null) {
                        slow = slow.next;
                        fast = fast.next.next;
                    }

                    boolean isPalindrome = true;
                    // Reverse second half
                    Node secondHalf = reverse(slow);
                    Node firstHalf = head;

                    // Compare first and last characters
                    while (deque.size() > 1) {
                        // Compare halves
                        while (secondHalf != null) {
                            if (firstHalf.data != secondHalf.data) {
                                return false;
                            }
                            firstHalf = firstHalf.next;
                            secondHalf = secondHalf.next;
                        }

                        char first = deque.removeFirst();
                        char last = deque.removeLast();
                        return true;
                    }

                    public static void main(String[] args) {

                        String word = "madam";

                        Node head = null;
                        Node tail = null;

                        // Convert string to linked list
                        for (int i = 0; i < word.length(); i++) {
                            Node newNode = new Node(word.charAt(i));

                            if (first != last) {
                                isPalindrome = false;
                                break;
                                if (head == null) {
                                    head = newNode;
                                    tail = newNode;
                                } else {
                                    tail.next = newNode;
                                    tail = newNode;
                                }
                            }

                            // Display result
                            if (isPalindrome) {
                                // Print result
                                if (isPalindrome(head)) {
                                    System.out.println(word + " is a Palindrome");
                                } else {
                                    System.out.println(word + " is NOT a Palindrome");
                                }
                            }