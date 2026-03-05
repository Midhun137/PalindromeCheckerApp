// Palindrome Checker Application
// Use Case 1: Application Entry & Welcome Message
// Use Case 2: Print a Hardcoded Palindrome Result

class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Display Welcome Message
        System.out.println("====================================");
        System.out.println("     Welcome to Palindrome Checker");
        System.out.println("====================================");
        // Hardcoded string
        String word = "madam";

        // Display Application Details
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Version          : 1.0");
        // Message for next step// Palindrome Checker Application
        //// Use Case 1: Application Entry & Welcome Message
        //// Use Case 2: Print a Hardcoded Palindrome Result

        System.out.println("\nThe program will continue to palindrome validation...");
        // Reverse the string
        String reverse = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        // Check if palindrome
        if(word.equals(reverse)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        }
        else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}