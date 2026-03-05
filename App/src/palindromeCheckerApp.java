class PalindromeIgnoreCase {
    class PalindromeChecker {

        public static void main(String[] args) {

            String text = "A man a plan a canal Panama";

            // Normalize string (remove spaces and convert to lowercase)
            text = text.replaceAll("\\s+", "").toLowerCase();
            // Method to check palindrome
            public boolean checkPalindrome(String word) {

                int start = 0;
                int end = text.length() - 1;
                int end = word.length() - 1;

                boolean isPalindrome = true;

                // Compare characters
                while (start < end) {
                    if (text.charAt(start) != text.charAt(end)) {
                        isPalindrome = false;
                        break;
                        if (word.charAt(start) != word.charAt(end)) {
                            return false;
                        }
                        start++;
                        end--;
                    }

                    // Display result
                    if (isPalindrome) {
                        System.out.println("It is a Palindrome");
                        return true;
                    }
                }

                public class PalindromeApp {

                    public static void main(String[] args) {

                        String text = "madam";

                        PalindromeChecker checker = new PalindromeChecker();

                        if (checker.checkPalindrome(text)) {
                            System.out.println(text + " is a Palindrome");
                        } else {
                            System.out.println("It is NOT a Palindrome");
                            System.out.println(text + " is NOT a Palindrome");
                        }
                    }
                }