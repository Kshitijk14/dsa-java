package Dec17OnTheWayUp;

// Recursion All The Way Up
public class printSubString {
    
    public static void main(String[] args) {
        
    }

    public static void pss(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        pss(roq, ans + ch);
        pss(roq, ans + "");
    }
}
