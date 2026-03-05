import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class PalindromeStack {
    class PalindromeQueueStack {

        public static void main(String[] args) {

            String word = "madam";

            Stack<Character> stack = new Stack<>();
            Queue<Character> queue = new LinkedList<>();

            // Push characters into stack
            // Insert characters into Stack and Queue
            for (int i = 0; i < word.length(); i++) {
                stack.push(word.charAt(i));
                char ch = word.charAt(i);
                stack.push(ch);      // LIFO
                queue.add(ch);       // FIFO
            }

            boolean isPalindrome = true;

            // Pop and compare
            // Compare dequeue (queue) and pop (stack)
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != stack.pop()) {

                    char fromQueue = queue.remove(); // FIFO
                    char fromStack = stack.pop();    // LIFO

                    if (fromQueue != fromStack) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Print result
                // Display result
                if (isPalindrome) {
                    System.out.println(word + " is a Palindrome");
                } else {
                    System.out.println(word + " is NOT a Palindrome");
                }
            }