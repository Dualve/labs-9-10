package by.bntu.fitr.poisit.dubodelov.lab9.A.logic;

import org.junit.Assert;
import org.junit.Test;

public class NumberATest {

    @Test
    public void testFoundAmountOfItems() {
        int x = 0;

        int expected = 1;
        int actual = NumberA.findAmountOfItems(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFoundAmountOfItems1() {
        int x = 1234;

        int expected = 4;
        int actual = NumberA.findAmountOfItems(x);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testFoundAmountOfItems2() {
        int x = -12;

        int expected = 2;
        int actual = NumberA.findAmountOfItems(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFoundAmountOfItems3() {
        int x = 99;

        int expected = 2;
        int actual = NumberA.findAmountOfItems(x);

        Assert.assertEquals(expected, actual);
    }
}
