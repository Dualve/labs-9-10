package by.bntu.fitr.poisit.dubodelov.lab9.D.logic;

import org.junit.Assert;
import org.junit.Test;

public class TestMaxNum {

    @Test
    public void testIsPalindrome5() {
        int x = 125679345;

        int expected = 9;
        int actual = MaxNum.findMaxNum(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindrome4() {
        int x = -5237365;

        int expected = 7;
        int actual = MaxNum.findMaxNum(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindrome() {
        int x = 8;

        int expected = 8;
        int actual = MaxNum.findMaxNum(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindrome1() {
        int x = 10;

        int expected = 1;
        int actual = MaxNum.findMaxNum(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindrome2() {
        int x = 0;

        int expected = 0;
        int actual = MaxNum.findMaxNum(x);

        Assert.assertEquals(expected, actual);
    }
}
