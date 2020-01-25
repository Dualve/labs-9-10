package by.bntu.fitr.poisit.dubodelov.lab9.F.logic;

public class RewriteMath {

    public static int gcd(int number1, int number2) { //
        while (number2 != 0) {
            int tmp = Math.abs(number1 % number2);
            number1 = Math.abs(number2);
            number2 = tmp;
        }
        return number1;
    }

    public static int lcm(int number1, int number2){//nok
        int divider = gcd(number1,number2);
        return Math.abs(number1*number2)/divider;
    }
}
