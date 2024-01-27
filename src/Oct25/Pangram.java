package Oct25;

public class Pangram {
    
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(sentence));
    }

    public static boolean isPangram (String str) {
        // 1. boolean array
        // 2. calculate index and mark as visited
        // 3. check visited array

        boolean[] visited = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                visited[ch - 'a'] = true;
            } else if (ch >= 'A' && ch <= 'Z') {
                visited[ch - 'A'] = true;
            }
        }

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false) {
                return false;
            }
        }
        return true;
    }
}
