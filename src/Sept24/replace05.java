package Sept24;

public class replace05 {
    
    public static void main(String[] args) {
        int n = 102;

        System.out.println(replace0with5(n));
    }

    public static int replace0with5(int n) {
        int rev = 0;

        while (n!=0) {
            int rem = n % 10;

            if (rem == 0) {
                rem = 5;
            }

            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return reverseReplaced(rev);
    }

    public static int reverseReplaced(int n) {
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
