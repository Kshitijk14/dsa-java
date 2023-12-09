package Nov29Recursion;

public class printPower {
    
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }

    public static int power(int x, int n) {
        
        if (n == 0) {
            return 1;
        }

        n = x * power(x, (n-1));
        return n;
    }
}
