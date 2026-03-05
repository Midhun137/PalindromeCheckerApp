import java.util.Stack;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;

class PalindromeQueueStack {
    class PalindromeDeque {

        public static void main(String[] args) {

            String word = "madam";
            String word = "racecar";

            Stack<Character> stack = new Stack<>();
            Queue<Character> queue = new LinkedList<>();
            Deque<Character> deque = new LinkedList<>();

            // Insert characters into Stack and Queue
            // Insert characters into deque
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                stack.push(ch);      // LIFO
                queue.add(ch);       // FIFO
                deque.addLast(word.charAt(i));
            }

            boolean isPalindrome = true;

            // Compare dequeue (queue) and pop (stack)
            for (int i = 0; i < word.length(); i++) {
                // Compare first and last characters
                while (deque.size() > 1) {

                    char fromQueue = queue.remove(); // FIFO
                    char fromStack = stack.pop();    // LIFO
                    char first = deque.removeFirst();
                    char last = deque.removeLast();

                    if (fromQueue != fromStack) {
                        if (first != last) {
                            isPalindrome = false;
                            break;
                        }
                    }

                    // Display result
                    if (isPalindrome) {
                        System.out.println(word + " is a Palindrome");
                    } else {
                        System.out.println(word + " is NOT a Palindrome");
                    }
                }