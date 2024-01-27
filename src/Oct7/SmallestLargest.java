package Oct7;

public class SmallestLargest {
    
    public static void main(String[] args) {
        int[] arr = {80, 20, 30, 40, 50};
        printSLOptimized(arr);
    }

    public static void printSL(int[] arr) {
        int large = arr[0];
        int small = arr[0];
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            } else if (arr[i] < small) {
                small = arr[i];
            }
        }

        System.out.println("Max: " + large);
        System.out.println("Min: " + small);
    }

    public static void printSLOptimized(int[] arr) {
        int large = Integer.MAX_VALUE;
        int small = Integer.MIN_VALUE;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            large = Math.max(large, arr[i]);
            small = Math.min(small, arr[i]);
        }

        System.out.println("Max: " + large);
        System.out.println("Min: " + small);
    }
}
