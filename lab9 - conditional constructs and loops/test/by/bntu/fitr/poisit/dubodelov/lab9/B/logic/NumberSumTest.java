package by.bntu.fitr.poisit.dubodelov.lab9.B.logic;

import org.junit.Assert;
import org.junit.Test;

public class NumberSumTest {

    @Test
    public void testNumberSum() {
        int x = 0;

        int expected = 0;
        int actual = NumberSum.findSum(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumberSum1() {
        int x = 1234;

        int expected = 10;
        int actual = NumberSum.findSum(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumberSum2() {
        int x = -1234;

        int expected = 10;
        int actual = NumberSum.findSum(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumberSum3() {
        int x = 7;

        int expected = 7;
        int actual = NumberSum.findSum(x);

        Assert.assertEquals(expected, actual);
    }
}
