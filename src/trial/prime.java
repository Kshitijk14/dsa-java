package trial;
import java.util.Scanner;

public class prime {
    
    public static void main(String[] args) {

        try (// for taking int x as input parameter
        Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();

            boolean isP1 = isPrime2(x);
            System.out.println(isP1);
        }
    }

    // brute force algorithm
    public static boolean isPrime1(int x) {
        if ( x == 0 || x == 1 ) return false;

        for ( int i = 2; i < x; i ++ ) {
            if ( x % i == 0 ) return false;
        }

        return true;
    }

    // optimized algorithm
    public static boolean isPrime2(int x) {
        if ( x == 0 || x == 1 ) return false;

        for ( int i = 2; i < Math.sqrt(x); i ++ ) {
            if ( x % i == 0 ) return false;
        }

        return true;
    }

}
