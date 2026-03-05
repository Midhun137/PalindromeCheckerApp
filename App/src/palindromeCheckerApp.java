import java.util.Deque;
import java.util.LinkedList;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}
public class PalindromePerformance {

    // Stack Strategy
    class StackStrategy implements PalindromeStrategy {
        // Reverse String Method
        public static boolean reverseMethod(String word) {
            String reversed = "";

            public boolean checkPalindrome(String word) {
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed += word.charAt(i);
                }

                return word.equals(reversed);
            }

            // Stack Method
            public static boolean stackMethod(String word) {

                Stack<Character> stack = new Stack<>();


                return true;
            }
        }

        // Deque Strategy
        class DequeStrategy implements PalindromeStrategy {

            public boolean checkPalindrome(String word) {
                // Deque Method
                public static boolean dequeMethod(String word) {

                    Deque<Character> deque = new LinkedList<>();

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
            // Two Pointer Method
            public static boolean twoPointerMethod(String word) {

                private PalindromeStrategy strategy;
                int start = 0;
                int end = word.length() - 1;

    public PalindromeChecker(PalindromeStrategy strategy) {
                    this.strategy = strategy;
                }
                while (start < end) {
                    if (word.charAt(start) != word.charAt(end)) {
                        return false;
                    }
                    start++;
                    end--;
                }

                public boolean check(String word) {
                    return strategy.checkPalindrome(word);
                    return true;
                }
            }

            // Main Application
            public class PalindromeApp {

                public static void main(String[] args) {

                    String word = "madam";

                    // Choose algorithm dynamically
                    PalindromeStrategy strategy = new StackStrategy();
                    // PalindromeStrategy strategy = new DequeStrategy();

                    PalindromeChecker checker = new PalindromeChecker(strategy);

                    if (checker.check(word)) {
                        System.out.println(word + " is a Palindrome");
                    } else {
                        System.out.println(word + " is NOT a Palindrome");
                    }
                    String word = "racecar";

                    long startTime, endTime;

                    // Reverse Method
                    startTime = System.nanoTime();
                    reverseMethod(word);
                    endTime = System.nanoTime();
                    System.out.println("Reverse Method Time: " + (endTime - startTime) + " ns");

                    // Stack Method
                    startTime = System.nanoTime();
                    stackMethod(word);
                    endTime = System.nanoTime();
                    System.out.println("Stack Method Time: " + (endTime - startTime) + " ns");

                    // Deque Method
                    startTime = System.nanoTime();
                    dequeMethod(word);
                    endTime = System.nanoTime();
                    System.out.println("Deque Method Time: " + (endTime - startTime) + " ns");

                    // Two Pointer Method
                    startTime = System.nanoTime();
                    twoPointerMethod(word);
                    endTime = System.nanoTime();
                    System.out.println("Two Pointer Method Time: " + (endTime - startTime) + " ns");
                }
            }