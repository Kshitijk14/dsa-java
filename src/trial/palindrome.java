package trial;
public class palindrome {
    
    public static void main(String[] args) {
        String str = "naman";

        String res = reverseString(str);
        System.out.println(res);

        boolean isPalin = isPalindrome(str);
        System.out.println(isPalin);
    }

    public static String reverseString(String str) {
        // string into char array
        char[] s = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // temporary variable
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left ++;
            right --;
        }

        return new String(s);
    }

    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }

}