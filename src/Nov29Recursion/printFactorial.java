package Nov29Recursion;

public class printFactorial {
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {

        if (n == 0) {
            return (1);
        }

        n = n * factorial(n - 1);
        return n;
    }

}