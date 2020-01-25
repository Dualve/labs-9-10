package by.bntu.fitr.poisit.dubodelov.lab9.D.logic;

public class MaxNum {

    private static final int DIVIDER = 10;

    public static int findMaxNum(int number) {
        int max = Math.abs(number % DIVIDER);

        for (int i = number / DIVIDER; Math.abs(i) >= 1; i /= DIVIDER) {
            if (max < Math.abs(i % DIVIDER)) {
                max = Math.abs(i % DIVIDER);
            }
        }
        return max;
    }
}
