package Oct7;

public class ArraysStart {
    
    public static void main(String[] args) {
        int[] one = new int[2];
        for (int i = 0; i < one.length; i++) {
            one[i] = i + 1;
        }
        
        swap(one, 0, 1); // shallow copy in array
        for (int i = 0; i < one.length; i++) {
            System.out.println(one[i]);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void start1(int[] n) {
        int[] arr; // declaration of an array
        arr = new int[5]; // initialization of an array (memory allocation, size: 5)
        System.out.println(arr);
        
        // arr[0] = 10;
        // arr[1] = 20;
        // System.out.println(arr[0]);

        int c = 1;
        for (int i = 0; i < (arr.length - 1); i++) { // traversing an array (visiting every index)
            arr[i] = c;
            c += 1;
        }
    }

    public static void start2(int[] n) {
        int[] one = new int[2];
        for (int i = 0; i < one.length; i++) {
            one[i] = i + 1;
        }
        System.out.println(one);

        int[] two = one;
        System.out.println(two);
        two[0] = 10;
        System.out.println(one[0]);
    }

}
