package by.bntu.fitr.poisit.dubodelov.lab9.F.logic;

import by.bntu.fitr.poisit.dubodelov.lab9.D.logic.MaxNum;
import org.junit.Assert;
import org.junit.Test;

public class TestRewriteMath {
    @Test
    public void testGCD() {
        int x = 10;

        int expected = 1;
        int actual = MaxNum.findMaxNum(x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCD1() {
        int x = 10;
        int y = 10;

        int expected = 10;
        int actual = RewriteMath.gcd(x,y);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCD2() {
        int x = 10;
        int y = -2;

        int expected = 2;
        int actual = RewriteMath.gcd(x,y);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCD3() {
        int x = 0;
        int y = 0;

        int expected = 0;
        int actual = RewriteMath.gcd(x,y);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCD4() {
        int x = -12;
        int y = -8;

        int expected = 4;
        int actual = RewriteMath.gcd(x,y);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCD5() {
        int x = 21;
        int y = 7;

        int expected = 7;
        int actual = RewriteMath.gcd(x,y);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLCM1() {
        int x = 10;
        int y = 5;

        int expected = 10;
        int actual = RewriteMath.lcm(x,y);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLCM2() {
        int x = -5;
        int y = 1;

        int expected = 5;
        int actual = RewriteMath.lcm(x,y);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLCM3() {
        int x = -7;
        int y = 3;

        int expected = 21;
        int actual = RewriteMath.lcm(x,y);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLCM4() {
        int x = 7;
        int y = 3;

        int expected = 21;
        int actual = RewriteMath.lcm(x,y);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLCM5() {
        int x = -5;
        int y = -9;

        int expected = 45;
        int actual = RewriteMath.lcm(x,y);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLCM6() {
        int x = 6;
        int y = 6;

        int expected = 6;
        int actual = RewriteMath.lcm(x,y);

        Assert.assertEquals(expected, actual);
    }
}
