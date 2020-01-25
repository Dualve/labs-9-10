package by.bntu.fitr.poisit.dubodelov.lab9.C.logic;

public class Palindrome {
    private static final int DIVIDER = 10;
    private static final int LOWER_BORDER = 0;

    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;

        while (palindrome != LOWER_BORDER) {
            int remainder = palindrome % DIVIDER;
            reverse = reverse * DIVIDER + remainder;
            palindrome = palindrome / DIVIDER;
        }

        return number == reverse;
    }
}
