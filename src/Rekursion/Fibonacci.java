package Rekursion;

public class Fibonacci {
    public static void main(String[] args) {
        uebung01Fibonacci();
        calcFibonacciViaRecursion(3);
    }

    private static int calcFibonacciViaRecursion(int n)
    {
        if (n <= 1)
            return n;
        else
            return  calcFibonacciViaRecursion(n-1) + calcFibonacciViaRecursion(n-2);

    }

    public static void uebung01Fibonacci(){
        int davor = 0; int aktuell = 1;
        for (int i = 0; i < 20; i++) {
            System.out.print(aktuell + " ");
            int naechste = davor + aktuell;
            davor = aktuell;
            aktuell = naechste;
        }
    }

}
