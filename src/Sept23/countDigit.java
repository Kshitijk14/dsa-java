package Sept23;
public class countDigit {
    
    public static void main(String[] args) {
        int n = 1634;

        System.out.println("Number of digits(through string approach): " + countString(n));

        System.out.println("Number of digits: " + count10(n));

        System.out.println("The number is Armstrong?: " + isArmstrong(n));
    }

    // v basic algorithm
    public static int countString(int n) {
        String numString = Integer.toString(n);
        int noDigits = numString.length();
        return (noDigits);
    }

    // optimized algorithm
    public static int count10(int n) {
        int count = 0;

        while (n!=0) {
            count ++;
            n = n/10;
        }

        return count;
    }

    public static boolean isArmstrong(int n) {
        int count = count10(n);
        int originalNum = n;
        int sum = 0;

        while(n!=0) {
            int digit = n % 10;
            sum = (int) (sum + Math.pow(digit, count));
            n = n / 10;
        }

        if ( sum == originalNum ) {
            return true;
        } return false;
    }

}