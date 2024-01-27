package Sept24;

public class largestSmallestDigit {
    
    public static void main(String[] args) {
        int n = 159;

        largestSmallest(n);
    }

    public static void largestSmallest(int n) {
        int large = 0;
        int small = 9;

        while (n!=0) {
            int rem = n % 10;

            large = Math.max(large, rem);
            small = Math.min(small, rem);

            n = n / 10;
        }

        System.out.println("Largest digit: " + large);
        System.out.println("Smallest digit: " + small);
    }
}
