package by.bntu.fitr.poisit.dubodelov.lab9.D.controller;

import by.bntu.fitr.poisit.dubodelov.lab9.D.logic.MaxNum;
import by.bntu.fitr.poisit.dubodelov.lab9.D.utils.UserInput;
import by.bntu.fitr.poisit.dubodelov.lab9.D.view.Printer;

public class Manager {

    private static final String MSG = "Введите натуральное число: ";
    private static final String MSG1 = "Наибольшая цифра числа: ";
    private static final int LOWER_BORDER = 0;

    public static void main(String[] args) {
        try {
            int number = UserInput.inputInt(MSG);
            int max = 0;

            if (number > LOWER_BORDER) {
                max = MaxNum.findMaxNum(number);
            }

            Printer.printInfo(MSG1, max);
        }catch (Exception e){
            Printer.printError("Net");
        }
    }
}
