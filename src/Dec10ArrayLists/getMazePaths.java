package Dec10ArrayLists;

import java.util.ArrayList;

public class getMazePaths {
    
    public static void main(String[] args) {
        System.out.println(getMazePath(1, 1, 3, 3));
    }

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {

        // base case
        if (sr == dr && sc == dc) {
            ArrayList<String> bRes = new ArrayList<>();
            bRes.add("");
            return bRes;
        }

        ArrayList<String> hPaths = new ArrayList<String>();
        ArrayList<String> vPaths = new ArrayList<String>();

        if (sc < dc) {
            hPaths = getMazePath(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vPaths = getMazePath(sr + 1, sc, dr, dc);
        }

        ArrayList<String> myRes = new ArrayList<>();

        for (String hPath : hPaths) {
            myRes.add("h" + hPath);
        }
        for (String vPath : vPaths) {
            myRes.add("v" + vPath);
        }

        return myRes;

    }
}
