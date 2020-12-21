import java.util.LinkedHashMap;
import java.util.Map;


public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> tmp = new LinkedHashMap<>();
        for (Character c: s.toCharArray()){
            if(tmp.get(c)!= null){
                tmp.put(c,tmp.get(c)+1);
            }else {
                tmp.put(c,1);
            }
        }
        for (Character c:t.toCharArray()){
            if(tmp.get(c)== null ||tmp.get(c) == 0){
                return false;
            } else if(tmp.get(c) == 1) {
                tmp.remove(c);
            } else {
                tmp.put(c,tmp.get(c)-1);
            }
        }
        return tmp.size()==0;
    }
}
