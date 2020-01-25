package by.bntu.fitr.poisit.dubodelov.lab9.F.utils;

import java.util.Scanner;

public class UserInput {

    public static int inputInt(String msg) {
        Scanner scan = new Scanner(System.in);
        System.out.print(msg);
        return scan.nextInt();
    }
}
