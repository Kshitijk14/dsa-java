package Oct6;

public class printAllPrimeFactors {

    public static void main(String[] args) {
        int n = 315;
        // printPrimeFactors(n);
        printFactors(n);

    }

    public static void printPrimeFactors(int n) { // less optimized solution
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.println(i);
            }
        }
    }

    public static void printFactors(int n) {
        for (int i = 2; i*i <= n; i++) { // i till sq. root of n
            while (n % i == 0) {
                n = n / i;
                System.out.println(i);
            }
        }
        if (n != 1) {
            System.out.println("Out of loop: " + n);
        }
        
    }    
}