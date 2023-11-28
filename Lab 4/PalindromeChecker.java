public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        String cleanWord = word.replaceAll("\\s", "").toLowerCase();

        String reversedWord = new StringBuilder(cleanWord).reverse().toString();
        
        return cleanWord.equals(reversedWord);
    }
}
