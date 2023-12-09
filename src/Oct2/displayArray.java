package Oct2;

public class displayArray {
    
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        displayArr(array, 0);
        displayRevArr(array, 0);
    }

    public static void displayArr(int[] array, int idx) {

        if (idx > array.length - 1) {
            return;
        }

        System.out.println(array[idx]);
        displayArr(array, idx + 1);
    }

    public static void displayRevArr(int[] array, int idx) {

        if (idx > array.length - 1) {
            return;
        }

        displayRevArr(array, idx + 1);
        System.out.println(array[idx]);
    }

}
