package by.bntu.fitr.poisit.dubodelov.lab9.A.logic;

public class NumberA {

    private static final int DIVIDER = 10;
    private static final int LOWER_BORDER = 0;

    public static int findAmountOfItems(int num) {
        int amountOfItems = 0;

        do {
            num = num / DIVIDER;
            amountOfItems++;
        }while (num != LOWER_BORDER);

        return amountOfItems;
    }
}
