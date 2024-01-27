package trial;
public class binarySegg {
    
    public static void main(String[] args) {
        int[] arr = new int[]{ 0, 1, 0, 0, 1, 1, 1, 0 };

        // Call the segg function to segregate 0s and 1s
        segg(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void segg(int[] arr) {
        int i = 0;
        int j = 0;

        while ( i <= j && i < arr.length && j < arr.length) {
            if (arr[j] == 1) {
                j ++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i ++;
                j ++;
            }
        }
    }

}
