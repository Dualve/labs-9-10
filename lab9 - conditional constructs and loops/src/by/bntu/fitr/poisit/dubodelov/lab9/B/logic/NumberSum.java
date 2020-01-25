package by.bntu.fitr.poisit.dubodelov.lab9.B.logic;

public class NumberSum {

    private static final int LOWER_BORDER = 0;

    public static int findSum(int number) {
        int sum = 0;

        while (number != LOWER_BORDER) {
            sum += Math.abs(number % 10);
            number /= 10;
        }

        return sum;
    }
}
