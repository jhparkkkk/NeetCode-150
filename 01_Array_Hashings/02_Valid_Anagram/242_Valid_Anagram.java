import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_ar = s.toCharArray();
        char[] t_ar = t.toCharArray();
        
        Arrays.sort(s_ar);
        Arrays.sort(t_ar);

        return Arrays.equals(s_ar, t_ar);
    }
}
