package Easy._001;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem_001 Two Sum
 * @Author: guoyuting
 * @date: 2018-5-25 16:12
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.print(twoSum(nums, target));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needNum = target - nums[i];
            if(map.containsKey(needNum) && map.get(needNum) != i) {
                return new int[]{map.get(needNum), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
