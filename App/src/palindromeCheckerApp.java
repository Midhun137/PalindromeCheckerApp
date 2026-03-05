class PalindromeRecursion {
    class PalindromeIgnoreCase {

        // Recursive function
        static boolean isPalindrome(String str, int start, int end) {
            public static void main(String[] args) {

                // Base condition
                if (start >= end) {
                    return true;
                }
                String text = "A man a plan a canal Panama";

                // If characters are not equal
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                // Normalize string (remove spaces and convert to lowercase)
                text = text.replaceAll("\\s+", "").toLowerCase();

                // Recursive call
                return isPalindrome(str, start + 1, end - 1);
            }
            int start = 0;
            int end = text.length() - 1;

            public static void main(String[] args) {
                boolean isPalindrome = true;

                String word = "madam";
                // Compare characters
                while (start < end) {
                    if (text.charAt(start) != text.charAt(end)) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                if (isPalindrome(word, 0, word.length() - 1)) {
                    System.out.println(word + " is a Palindrome");
                    // Display result
                    if (isPalindrome) {
                        System.out.println("It is a Palindrome");
                    } else {
                        System.out.println(word + " is NOT a Palindrome");
                        System.out.println("It is NOT a Palindrome");
                    }
                }
            }