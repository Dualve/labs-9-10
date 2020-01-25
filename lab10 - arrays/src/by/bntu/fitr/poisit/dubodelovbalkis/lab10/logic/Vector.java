package by.bntu.fitr.poisit.dubodelovbalkis.lab10.logic;

public class Vector {

    private static final int FIRST_ITEM = 0;
    private static final int NEXT = 1;

    private static int findIndexMin(double[] num) {

        int index = FIRST_ITEM;
        double min = num[FIRST_ITEM];

        for (int i = 1; i < num.length; i++) {

            if (num[i] < min) {
                min = num[i];
                index = i;
            }
        }

        return index;
    }


    private static int findIndexMax(double[] num) {

        int index = FIRST_ITEM;
        double max = num[FIRST_ITEM];

        for (int i = 1; i < num.length; i++) {

            if (num[i] > max) {
                max = num[i];
                index = i;
            }
        }

        return index;
    }

    private static double findStartComposition(int startIndex, int endIndex) {

        double startPoint = FIRST_ITEM;

        if (startIndex + NEXT != endIndex && startIndex != endIndex) {
            startPoint = NEXT;
        }

        return startPoint;
    }


    public static double findSumOfNegativeItems(double[] num) {

        int indexOfMin = findIndexMax(num);
        int indexOfMax = findIndexMin(num);

        int startBorder = Math.min(indexOfMin, indexOfMax);
        int endBorder = Math.max(indexOfMin, indexOfMax);

        double sum = FIRST_ITEM;

        for (int i = startBorder + 1; i < endBorder; i++) {
            if (num[i] < FIRST_ITEM) {
                sum += num[i];
            }
        }

        return sum;
    }


    public static double findComposition(double[] num) {

        int indexOfMin = findIndexMax(num);
        int indexOfMax = findIndexMin(num);

        int startBorder = Math.min(indexOfMin, indexOfMax);
        int endBorder = Math.max(indexOfMin, indexOfMax);

        double composition = findStartComposition(startBorder, endBorder);

        for (int i = startBorder + NEXT; i < endBorder; i++) {
            composition *= num[i];
        }

        return composition;
    }
}
