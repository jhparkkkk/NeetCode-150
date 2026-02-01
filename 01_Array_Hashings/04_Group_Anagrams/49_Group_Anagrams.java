import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            int [] arr = new int[26];
            Arrays.fill(arr, 0);

            char [] s_arr = s.toCharArray();
            for (char c: s_arr){
                arr[c-'a'] += 1;
            }

            String key = Arrays.toString(arr);

            if (!res.containsKey(key)){
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(s);
        };
        return new ArrayList<>(res.values());
    }
}