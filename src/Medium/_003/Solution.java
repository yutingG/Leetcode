package Medium._003;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Problem_003 Longest Substring Without Repeating Characters
 * @Author: guoyuting
 * @Date: Created in 2018/5/28 23:26
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "abcabcab";
        System.out.println(solution.lengthOfLongestSubstring(str));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
