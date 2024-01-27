package Dec2;

public class towerOfHanoi {
    
    public static void main(String[] args) {
        toh(3, "A", "B", "C");
    }

    public static void toh(int n, String t1, String t2, String t3) {
        
        if (n == 0) {
            return;
        }

        toh(n-1, t1, t2, t3); // S1
        System.out.println(n + "[" + t1 + "->" + t2 + "]"); // S2
        toh(n-1, t3, t1, t2); // S3
    }

}