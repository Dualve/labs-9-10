package by.bntu.fitr.poisit.dubodelov.lab9.C.logic;

import org.junit.Assert;
import org.junit.Test;

public class TestPalindrome {

    @Test
    public void testIsPalindrome() {
        int x = 123321;

        boolean expected = true;
        boolean actual = Palindrome.isPalindrome(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindrome1() {
        int x = 7;

        boolean expected = true;
        boolean actual = Palindrome.isPalindrome(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindrome2() {
        int x = 12321;

        boolean expected = true;
        boolean actual = Palindrome.isPalindrome(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindrome3() {
        int x = -123321;

        boolean expected = true;
        boolean actual = Palindrome.isPalindrome(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindrome4() {
        int x = -7;

        boolean expected = true;
        boolean actual = Palindrome.isPalindrome(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindrome5() {
        int x = -98;

        boolean expected = false;
        boolean actual = Palindrome.isPalindrome(x);

        Assert.assertEquals(expected, actual);
    }

}
