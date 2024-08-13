package April14HashMap;

public class HashMapDemo {
    
    public static void frequencyMap(String str){
        HashMapDemo<Character, Integer> hmap = new HashMapDemo<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch,0)+1);
        }
        System.out.println(hmap);
    }
}
