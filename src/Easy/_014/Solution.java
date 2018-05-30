package Easy._014;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem_014 Longest Common Prefix
 * @Author: guoyuting
 * @Date: Created in 2018/5/30 21:35
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"flower", "fly", "flow"};
        System.out.println(solution.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        String result;
        // 获取字符串最短长度
        int len = (strs.length != 0) ? Integer.MAX_VALUE :  0;
        for (int i = 0; i < strs.length; i++) {
            if (len > strs[i].length()) {
                len = strs[i].length();
            }
        }

        Set<Character> set = new HashSet<>();
        int count;
        for (count = 0; count < len;) {
            for(int j = 0; j < strs.length; j++) {
                set.add(strs[j].charAt(count));
            }
            count++;
            if (set.size() != 1) {
                count--;
                break;
            } else {
                set.clear();
            }
        }
        if (len > 0 && count > 0) {
            result = strs[0].substring(0, count);
        } else {
            result = "";
        }

        return result;
    }
}
