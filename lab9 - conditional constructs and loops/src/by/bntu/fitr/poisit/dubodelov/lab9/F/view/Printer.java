package by.bntu.fitr.poisit.dubodelov.lab9.F.view;

public class Printer {
    public static void printInfo(String msg1, String msg2, int lcm, int gcd) {
        System.out.println(msg1 + lcm + msg2 + gcd);
    }

    public static void printError(String msg){
        System.out.println(msg);
    }
}