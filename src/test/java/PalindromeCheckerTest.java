import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PalindromeCheckerTest {

    // Тест для методу isPalindrome
    @Test
    public void testIsPalindrome() {
        // Arrange
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        // Act & Assert
        assertTrue(palindromeChecker.isPalindrome("level"));
        assertTrue(palindromeChecker.isPalindrome("Able , was I saw eLba"));
        assertFalse(palindromeChecker.isPalindrome("hello"));
        assertFalse(palindromeChecker.isPalindrome("Palindrome"));
    }
}
