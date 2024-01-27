package Dec9ArryaLists;

import java.util.ArrayList;

public class getKeypadCombination {
    
    public static void main(String[] args) {
        System.out.println(getKPC("573"));
    }

    public static String[] codes = {
        ".;", "abc", "def", "ghi", "jkl", 
        "mno", "pqrs", "tu", "vwx", "yz"
    };

    public static ArrayList<String> getKPC (String str) {

        if (str.length() == 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        char ch = str.charAt(0); // '5'
        String ros = str.substring(1); // '73'

        ArrayList<String> rRes = getKPC(ros); // getKPC('73')
        
        ArrayList<String> myRes = new ArrayList<>();

        String code = codes[ch - '0']; // to get indexes from the codes

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i); // c = 'm'
            for (String s : rRes) { // String s = the rRes's result of 'codes-of-73'
                myRes.add(c + s);
            }
        }

        return myRes;

    }

    // getKPC(573);

}
