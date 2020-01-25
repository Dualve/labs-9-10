package by.bntu.fitr.poisit.dubodelov.lab9.C.controller;

import by.bntu.fitr.poisit.dubodelov.lab9.C.logic.Palindrome;
import by.bntu.fitr.poisit.dubodelov.lab9.C.utils.UserInput;
import by.bntu.fitr.poisit.dubodelov.lab9.C.view.Printer;

public class Manager {
    private static final String MSG = "Введите натуральное число: ";
    private static final String MSG1 = "Является ли число палиндромом? - ";
    private static final  int LOWER_BORDER = 0;

    public static void main(String[] args) {
        try{
            boolean isPalindrome = false;
            int number = UserInput.inputInt(MSG);

            if (number > LOWER_BORDER) {
                isPalindrome = Palindrome.isPalindrome(number);
            }

            Printer.printInfo(MSG1, isPalindrome);
        }catch (Exception e){
            Printer.printError("Net");
        }
    }
}
