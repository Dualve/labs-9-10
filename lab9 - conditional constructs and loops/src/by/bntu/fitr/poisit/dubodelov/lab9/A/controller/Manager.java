package by.bntu.fitr.poisit.dubodelov.lab9.A.controller;

import by.bntu.fitr.poisit.dubodelov.lab9.A.utils.UserInput;
import by.bntu.fitr.poisit.dubodelov.lab9.A.logic.NumberA;
import by.bntu.fitr.poisit.dubodelov.lab9.A.view.Printer;

public class Manager {

    private static final String MSG = "Natural numbers: ";
    private static final String MSG1 = "Enter your natural number: ";
    private static final int LOWER_BORDER = 0;

    public static void main(String[] args) {

        try {
            int amountOfSymbols = 0;
            int number = UserInput.inputInt(MSG1);

            if (number > LOWER_BORDER) {
                amountOfSymbols = NumberA.findAmountOfItems(number);
            }

            Printer.printInfo(MSG, amountOfSymbols);
        }catch (Exception e){
            System.out.println("No");
        }
    }
}
