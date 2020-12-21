import java.util.Arrays;


public class ValidAnagram {

    /**
     * https://leetcode-cn.com/problems/valid-anagram/
     */
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        return Arrays.equals(chars,chart);
    }
}
