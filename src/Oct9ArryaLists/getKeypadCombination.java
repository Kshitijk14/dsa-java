package Oct9ArryaLists;

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

        char ch = str.charAt(0); // 'a'
        String ros = str.substring(1); // bc

        ArrayList<String> rres = getKPC(ros); // getSS(bc)
        ArrayList<String> myRes = new ArrayList<>();

        for (String rstr : rres) {
            
        }

        return myRes;

    }

    // getKPC(573);

}
