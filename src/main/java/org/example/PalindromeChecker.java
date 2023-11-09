// Збережено у файлі PalindromeChecker.java
public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        String cleanWord = word.replaceAll("\\s", "").toLowerCase();

        int length = cleanWord.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanWord.charAt(i) != cleanWord.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
