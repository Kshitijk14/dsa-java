package Oct6;

public class findPivotOfNum {
    
    public static void main(String[] args) {
        int n = 8;
        // PivotNestedLoops(n);
        Pivot(n);
    }

    public static void PivotNestedLoops(int n) { // less optimized solution
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 = sum1 + i;
            int sum2 = 0;
            for (int j = i + 1; j <= n; j++) {
                sum2 = sum2 + j;
            }

            // System.out.println(sum1);
            // System.out.println(sum2 + i);
            // System.out.println("********************************");
            
            if ( sum1 == (sum2 + i) ) {
                System.out.println("Pivot: " + i);
            }
            
        }
    }

    public static void Pivot(int n) { // more optimized solution

        for (int i = 1; i <= n; i++) {
            int sumLeft = (i*(i+1)) / 2;
            int sumRight = ((n*(n+1)) / 2) - sumLeft + i;

            // System.out.println(sumLeft);
            // System.out.println(sumRight);
            // System.out.println("********************************");

            if (sumRight == sumLeft) {
                System.out.println("Pivot is: " + i);
            }
        }
    }

}
