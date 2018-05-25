package Easy._009;

/**
 * @Author: guoyuting
 * @date: 2018-5-25 16:12
 */
public class Solution {

    public static void main(String[] args) {
        int temp = 12001;
        System.out.println(isPalindrome(temp));
    }

    public static boolean isPalindrome(int x) {
        String temp = String.valueOf(x);
        char[] chars = temp.toCharArray();
        int len = chars.length / 2;
        int i, j;
        boolean flag = true;
        for(i = 0, j = chars.length - 1; i < len; i++, j--) {
            if (chars[i] != chars[j]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
