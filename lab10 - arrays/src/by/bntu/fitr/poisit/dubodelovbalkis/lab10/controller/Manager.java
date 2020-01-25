package by.bntu.fitr.poisit.dubodelovbalkis.lab10.controller;

import by.bntu.fitr.poisit.dubodelovbalkis.lab10.utils.UserInput;
import by.bntu.fitr.poisit.dubodelovbalkis.lab10.view.Printer;
import by.bntu.fitr.poisit.dubodelovbalkis.lab10.logic.Vector;

public class Manager {

    private static final String FIRST_MSG = "Enter amount of items: ";
    private static final String SECOND_MSG = "Item = ";

    private static final String THIRD_MSG = "Composition: ";
    private static final String FORTH_MSG = ". Sum of negative items: ";

    private static final String EXCEPTION_MSG = "You entered wrong data.";


    public static void main(String[] args) {
        try {

            int counter = UserInput.inputInt(FIRST_MSG);

            double[] num = new double[counter];

            for (int i = 0; i < counter; i++) {
                double item = UserInput.inputDouble(SECOND_MSG);
                num[i] = item;
            }

            double composition = Vector.findComposition(num);
            double sum = Vector.findSumOfNegativeItems(num);

            Printer.printResult(THIRD_MSG, composition, FORTH_MSG, sum);

        } catch (Exception e) {
            Printer.printException(EXCEPTION_MSG);
        }
    }
}
