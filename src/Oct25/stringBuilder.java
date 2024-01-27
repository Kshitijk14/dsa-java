package Oct25;

public class stringBuilder {
    
    public static void main(String[] args) {
        
    }

    public static String toggle (String s) {
        StringBuilder sb = new StringBuilder("abcd");
        char ch = 'e';
        sb.setCharAt(0, ch);
        System.out.println(sb);
        return s;
    }
}
