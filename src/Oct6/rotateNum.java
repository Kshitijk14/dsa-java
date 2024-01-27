package Oct6;

public class rotateNum {
    
    public static void main(String[] args) {
        int n = 12345;
        int k = 7;
        Rotate(n, k);
    }

    public static int Count(int n) {
        int count = 0;

        while (n!=0) {
            count ++;
            n = n/10;
        }

        return count;
    }

    public static void Rotate(int n, int k) {
        if (k < 0) {
            k = k + Count(n);
        } else if (k > Count(n)) {
            k = k % Count(n);
        }

        int q = n / (int)Math.pow(10, k);
        int r = n % (int)Math.pow(10, k);
        int rotation = (int)Math.pow(10, (Count(n)-k));

        // System.out.println(q);
        // System.out.println(r);

        n = r * rotation + q;
        System.out.println(n);
    }
}
