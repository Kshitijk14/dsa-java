package Dec19;

public class getKPC2 {
    
    public static void main(String[] args) {
        String ques = "678";
        String ans = "";
        kpc(ques, ans);
    }

    public static String[] codes = {
        ".;", "abc", "def", "ghi", "jkl", 
        "mno", "pqrs", "tu", "vwx", "yz"
    };

    public static void kpc(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0); // '6'
        String ros = ques.substring(1); // '78'
        String code = codes[ch - '0']; // getting indexes i.e. 'pqrs'

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i); // c = 'p'

            kpc(ros, ans + c); // '78/'p'
        }
    }
}
