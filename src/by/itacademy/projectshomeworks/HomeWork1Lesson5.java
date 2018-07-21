package by.itacademy.projectshomeworks;

public class HomeWork1Lesson5 {
    public static void main(String[] args) {
        if (isPalindrome("кабак")) {
            System.out.println(" Это слово является палиндромом.");
        } else {
            System.out.println("Это слово не является палиндромом.");
        }
    }

    private static boolean isPalindrome(String palindrome) {
        StringBuilder stringBuilder = new StringBuilder(palindrome).reverse();
        System.out.println(stringBuilder);
        return stringBuilder.toString().equals(palindrome);
    }
}


