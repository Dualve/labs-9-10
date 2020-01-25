package by.bntu.fitr.poisit.dubodelovbalkis.lab10.utils;

import java.util.Scanner;

public class UserInput {

    private static Scanner input = new Scanner(System.in);

    public static int inputInt(String msg) {

        System.out.println(msg);

        return input.nextInt();

    }


    public static double inputDouble(String msg) {

        System.out.println(msg);

        return input.nextDouble();

    }
}

