package Oct8;

public class findMaxInArray {
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 14, 15, 33};
        System.out.println(findMax(arr, 0));
    }

    public static int findMax(int[] arr, int idx) {
        
        if (idx > arr.length - 1) {
            return Integer.MIN_VALUE;
        }

        return Math.max(arr[idx], findMax(arr, idx + 1));
    }



}
