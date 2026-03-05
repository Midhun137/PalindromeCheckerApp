// Palindrome Checker Application
// Use Case 3: Palindrome Check Using String Reverse
// Use Case 4: Character Array Based Palindrome Check

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String word = "level";
        String word = "radar";

        // Variable to store reversed string
        String reversed = "";
        // Convert string to character array
        char[] chars = word.toCharArray();

        // Reverse the string using for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
            // Two pointer variables
            int start = 0;
            int end = chars.length - 1;

            boolean isPalindrome = true;

            // Two-pointer comparison
            while (start < end) {
                if (chars[start] != chars[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            // Compare original and reversed string
            if (word.equals(reversed)) {
                // Display result
                if (isPalindrome) {
                    System.out.println("The word \"" + word + "\" is a Palindrome.");
                } else {
                    System.out.println("The word \"" + word + "\" is NOT a Palindrome.");