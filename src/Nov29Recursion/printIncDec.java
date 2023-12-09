package Nov29Recursion;

public class printIncDec {
    
    public static void main(String[] args) {
        // printDecreasing(5);
        // printIncreasing(5);
        printIncreasingDecreasing(5);
    }

    public static void printDecreasing(int n) {
        
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) {
        
        if (n == 0) {
            return;
        }

        printIncreasing(n - 1);
        System.out.println(n);
    }

    public static void printIncreasingDecreasing(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);
        printIncreasingDecreasing(n - 1);
        System.out.println(n);
    }

}
