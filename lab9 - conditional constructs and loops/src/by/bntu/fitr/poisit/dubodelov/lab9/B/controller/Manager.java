package by.bntu.fitr.poisit.dubodelov.lab9.B.controller;

import by.bntu.fitr.poisit.dubodelov.lab9.B.logic.NumberSum;
import by.bntu.fitr.poisit.dubodelov.lab9.B.utils.UserInput;
import by.bntu.fitr.poisit.dubodelov.lab9.B.view.Printer;

public class Manager {
    private static final String MSG = "Сумма цифр натурального числа: ";
    private static final String MSG1 = "Введите ваше натуральное число: ";
    private static final int LOWER_BORDER = 0;

    public static void main(String[] args) {
        try {
            int sum = 0;
            int number = UserInput.inputInt(MSG1);

            if (number > LOWER_BORDER) {
                sum = NumberSum.findSum(number);
            }

            Printer.printInfo(MSG, sum);
        }catch (Exception e){
            Printer.printError("Net");
        }
    }

}
