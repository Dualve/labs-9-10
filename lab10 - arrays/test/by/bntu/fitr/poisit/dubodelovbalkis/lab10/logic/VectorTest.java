package by.bntu.fitr.poisit.dubodelovbalkis.lab10.logic;

import org.junit.Assert;
import org.junit.Test;

public class VectorTest {

    @Test
    public void testFindComposition1() {
        double[] x = new double[]{-1, 2};

        double expected = 0;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition2() {
        double[] x = new double[]{1, -2};

        double expected = 0;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition3() {
        double[] x = new double[]{1};

        double expected = 0;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition4() {
        double[] x = new double[]{-5};

        double expected = 0;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition5() {
        double[] x = new double[]{-1, -2, 3};

        double expected = 0;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition6() {
        double[] x = new double[]{0, 2, -1};

        double expected = 0;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    ///////////////////////////////////////////////

    @Test
    public void testFindComposition7() {
        double[] x = new double[]{-5, -2, -3, -1};

        double expected = 6;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition8() {
        double[] x = new double[]{-5, -2, -1};

        double expected = -2;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition9() {
        double[] x = new double[]{-1, -2, -3, -5};

        double expected = 6;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition10() {
        double[] x = new double[]{-1, -2, -5};

        double expected = -2;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    ///////////////////////////////////////////////////

    @Test
    public void testFindComposition11() {
        double[] x = new double[]{-5, -2, -3, 1};

        double expected = 6;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition12() {
        double[] x = new double[]{-5, -2, 1};

        double expected = -2;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition13() {
        double[] x = new double[]{1, -2, -3, -5};

        double expected = 6;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition14() {
        double[] x = new double[]{1, -2, -5};

        double expected = -2;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    /////////////////////////////////////////////////

    @Test
    public void testFindComposition15() {
        double[] x = new double[]{1, 2, 3, 5};

        double expected = 6;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition16() {
        double[] x = new double[]{1, 2, 5};

        double expected = 2;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition17() {
        double[] x = new double[]{5, 2, 3, 1};

        double expected = 6;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition18() {
        double[] x = new double[]{5, 2, 1};

        double expected = 2;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    ////////////////////////////////////////////

    @Test
    public void testFindComposition19() {
        double[] x = new double[]{5, 2, 7, -1, -10, 5, 3, -16};

        double expected = 150;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindComposition20() {
        double[] x = new double[]{5, 2, -16, -1, -10, 5, 3, 7};

        double expected = 150;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    ///////////////////////////////////////////////////
    ///////////////////////////////////////////////////

    @Test
    public void testFindSumOfNegativeItems1() {
        double[] x = new double[]{5, 2, -16, -1, -10, 5, 3, 7};

        double expected = -11;
        double actual = Vector.findSumOfNegativeItems(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindSumOfNegativeItems2() {
        double[] x = new double[]{5, 2, 7, -1, -10, 5, 3, -16};

        double expected = -11;
        double actual = Vector.findSumOfNegativeItems(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindSumOfNegativeItems3() {
        double[] x = new double[]{5, 2};

        double expected = 0;
        double actual = Vector.findSumOfNegativeItems(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindSumOfNegativeItems4() {
        double[] x = new double[]{2, 5};

        double expected = 0;
        double actual = Vector.findSumOfNegativeItems(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindSumOfNegativeItems5() {
        double[] x = new double[]{-2, 5};

        double expected = 0;
        double actual = Vector.findComposition(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindSumOfNegativeItems6() {
        double[] x = new double[]{2, -5};

        double expected = 0;
        double actual = Vector.findSumOfNegativeItems(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindSumOfNegativeItems7() {
        double[] x = new double[]{2, 1 ,-5};

        double expected = 0;
        double actual = Vector.findSumOfNegativeItems(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindSumOfNegativeItems8() {
        double[] x = new double[]{-5, 1, 2};

        double expected = 0;
        double actual = Vector.findSumOfNegativeItems(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindSumOfNegativeItems9() {
        double[] x = new double[]{2, -1, -5};

        double expected = -1;
        double actual = Vector.findSumOfNegativeItems(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testFindSumOfNegativeItems10() {
        double[] x = new double[]{-5, -1, 2};

        double expected = -1;
        double actual = Vector.findSumOfNegativeItems(x);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }



}

