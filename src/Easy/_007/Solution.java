package Easy._007;

/**
 * Problem_007 Reverse Integer
 * @Author: guoyuting
 * @Date: Created in 2018/5/27 17:14
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-230123));
        System.out.println(solution.reverse(1990900));
        System.out.println(solution.reverse(1000000003));
    }

    public int reverse(int x) {
        long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }
}
