package by.bntu.fitr.poisit.dubodelov.lab9.F.controller;

import by.bntu.fitr.poisit.dubodelov.lab9.F.logic.RewriteMath;
import by.bntu.fitr.poisit.dubodelov.lab9.F.utils.UserInput;
import by.bntu.fitr.poisit.dubodelov.lab9.F.view.Printer;

public class Manager {

    private static final String MSG = "Введите натуральное число: ";
    private static final String MSG1 = "НОК: ";
    private static final String MSG2 = " НОД: ";
    private static final int LOWER_BORDER = 0;

    public static void main(String[] args) {
        try {
            int lcm = 0;
            int gcd = 0;
            int number1 = UserInput.inputInt(MSG);
            int number2 = UserInput.inputInt(MSG);

            if (number1 > LOWER_BORDER && number2 > LOWER_BORDER) {
                gcd = RewriteMath.gcd(number1, number2);
                lcm = RewriteMath.lcm(number1, number2);
            }

            Printer.printInfo(MSG1, MSG2, lcm, gcd);
        }catch (Exception e){
            Printer.printError("Net");
        }
    }
}
