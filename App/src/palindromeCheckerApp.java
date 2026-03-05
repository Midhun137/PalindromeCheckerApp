// Palindrome Checker Application
// Use Case 2: Print a Hardcoded Palindrome Result
// Use Case 3: Palindrome Check Using String Reverse

class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";
        // Original String
        String word = "level";

        // Reverse the string
        String reverse = "";
        // Variable to store reversed string
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
            // Reverse the string using for loop
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }

            // Check if palindrome
            if(word.equals(reverse)) {
                // Compare original and reversed string
                if (word.equals(reversed)) {
                    System.out.println("The word \"" + word + "\" is a Palindrome.");
                }
                else {
                } else {
                    System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
                }
            }