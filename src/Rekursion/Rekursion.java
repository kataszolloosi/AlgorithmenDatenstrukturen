package Rekursion;

public class Rekursion {
    public static void main(String[] args) {
        recursiveFunctionA(1);
        System.out.println();
        recursiveFunctionB(1);
    }
    public static void recursiveFunctionA(int num) {
        System.out.printf("%d\n", num);
        if (num >= 4)
            return;
        else
            recursiveFunctionA(num + 1);
    }

    public static void recursiveFunctionB (int num){
        if (num >= 4)
            return;
        else
            recursiveFunctionB(num + 1);
        System.out.printf("%d\n", num);
    }
}

