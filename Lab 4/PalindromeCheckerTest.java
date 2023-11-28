public class PalindromeCheckerTest {
    public static void main(String[] args) {
        testIsPalindrome("level", true);
        testIsPalindrome("hello", false);
        testIsPalindrome("A man a plan a canal Panama", true);
        testIsPalindrome("Was it a car or a cat I saw?", true);
        testIsPalindrome("This is not a palindrome", false);
    }

    private static void testIsPalindrome(String word, boolean expected) {
        boolean result = PalindromeChecker.isPalindrome(word);
        String resultString = result ? "is a palindrome" : "is not a palindrome";
        System.out.println("\"" + word + "\" " + resultString + ". Expected: " + expected);
    }
}
