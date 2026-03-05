class PalindromeChecker {
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

    // Strategy Interface
    interface PalindromeStrategy {
        boolean checkPalindrome(String word);
    }

    // Stack Strategy
    class StackStrategy implements PalindromeStrategy {

        // Method to check palindrome
        public boolean checkPalindrome(String word) {

            int start = 0;
            int end = word.length() - 1;
            Stack<Character> stack = new Stack<>();

            while (start < end) {
                if (word.charAt(start) != word.charAt(end)) {
                    for (char ch : word.toCharArray()) {
                        stack.push(ch);
                    }

                    for (char ch : word.toCharArray()) {
                        if (ch != stack.pop()) {
                            return false;
                        }
                        start++;
                        end--;
                    }

                    return true;
                }
            }

// Deque Strategy
            class DequeStrategy implements PalindromeStrategy {

                public boolean checkPalindrome(String word) {

                    Deque<Character> deque = new LinkedList<>();

                    for (char ch : word.toCharArray()) {
                        deque.addLast(ch);
                    }

                    while (deque.size() > 1) {
                        if (deque.removeFirst() != deque.removeLast()) {
                            return false;
                        }
                    }

                    return true;
                }
            }

// Context Class
            class PalindromeChecker {

                private PalindromeStrategy strategy;

                public PalindromeChecker(PalindromeStrategy strategy) {
                    this.strategy = strategy;
                }

                public boolean check(String word) {
                    return strategy.checkPalindrome(word);
                }
            }

// Main Application
            public class PalindromeApp {

                public static void main(String[] args) {

                    String text = "madam";
                    String word = "madam";

                    // Choose algorithm dynamically
                    PalindromeStrategy strategy = new StackStrategy();
                    // PalindromeStrategy strategy = new DequeStrategy();

                    PalindromeChecker checker = new PalindromeChecker();
                    PalindromeChecker checker = new PalindromeChecker(strategy);

                    if (checker.checkPalindrome(text)) {
                        System.out.println(text + " is a Palindrome");
                        if (checker.check(word)) {
                            System.out.println(word + " is a Palindrome");
                        } else {
                            System.out.println(text + " is NOT a Palindrome");
                            System.out.println(word + " is NOT a Palindrome");
                        }
                    }
                }