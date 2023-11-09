import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введіть слово для перевірки на паліндром:");
            String userWord = scanner.nextLine();

            if (PalindromeChecker.isPalindrome(userWord)) {
                System.out.println(userWord + " є паліндромом!");
            } else {
                System.out.println(userWord + " не є паліндромом.");
            }
        }
    }
}
