package Sept23;
import java.util.Scanner;

public class greatestSmallest {
    
    public static void main(String[] args) {
        try (// taking inputs from cmd line
        Scanner scn = new Scanner(System.in)) {
            // for x
            System.out.println("Enter first number : ");
            int x = scn.nextInt();
            // for y
            System.out.println("Enter second number : ");
            int y = scn.nextInt();
            // for z
            System.out.println("Enter third number : ");
            int z = scn.nextInt();

            int greatestNumber = greatest(x, y, z);
            System.out.println("Greatest number is : " +greatestNumber);

            int smallestNumber = smallest(x, y, z);
            System.out.println("Smallest number is : " +smallestNumber);
        }
    }

    public static int greatest(int x, int y, int z) {
        if ( x > y && x > z ) {
            return x;
        } else if ( y > x && y > z ) {
            return y;
        } else {
            return z;
        }
    }

    public static int smallest(int x, int y, int z) {
        if ( x < y && x < z ) {
            return x;
        } else if ( y < x && y < z ) {
            return y;
        } else {
            return z;
        }
    }

}