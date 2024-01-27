package Dec9ArryaLists;

import java.util.ArrayList;

public class getSubSequenceAL {

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(getSS(s));
    }

    public static ArrayList<String> getSS (String s) {
        
        if (s.length() == 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        char ch = s.charAt(0); // 'a'
        String ros = s.substring(1); // bc

        ArrayList<String> rres = getSS(ros); // getSS(bc)
        ArrayList<String> myRes = new ArrayList<>();

        for (String rstr : rres) { // rstr = i (for loop wala) ... enhanced for loop
            myRes.add(rstr); // a denies
            myRes.add(ch + rstr); // a acc
        }

        return myRes;
    }
}
