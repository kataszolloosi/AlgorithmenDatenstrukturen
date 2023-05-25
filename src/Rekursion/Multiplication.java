package Rekursion;

public class Multiplication {
    public static void main(String[] args) {

        System.out.println(calcMultiplication(4,3));
    }

    public static int calcMultiplication(int multiplicand, int multiplier)
    {
        if (multiplier == 1)
            return multiplicand;
        else
            return multiplicand + calcMultiplication(multiplicand, multiplier-1);
    }
}
