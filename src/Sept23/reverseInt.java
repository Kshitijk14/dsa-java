package Sept23;
public class reverseInt {
    
    public static void main(String[] args) {
        int n = 1234;
        
        System.out.println(reverseInteger(n));
    }

    public static int reverseInteger(int n) {
        int rev = 0;
        int rem = 0;

        while (n!=0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return rev;
    }

}
