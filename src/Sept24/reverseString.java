package Sept24;

public class reverseString {

    public static void main(String[] args) {
        String str = "hello";

        System.out.println(reverseStr(str));
    }

    public static String reverseStr(String str) {
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right --;
        }
        return new String(arr);
    }

}
