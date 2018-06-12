package Medium._807;

import java.util.ArrayList;

/**
 * Problem_807 Max Increase to Keep City Skyline
 * @author: guoyuting
 * @date: 2018-6-8 9:11
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(solution.maxIncreaseKeepingSkyline(grid));

    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        // the skyline viewed from left or right
        ArrayList left = new ArrayList();
        for(int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[i].length; j++) {
                max = max <= grid[i][j] ? grid[i][j] : max;
            }
            left.add(max);
        }

        int length = grid.length;
        ArrayList top = new ArrayList();
        if (length > 0) {
            // the skyline viewed from left or right
            for(int i = 0; i < grid[0].length; i++) {
                int max = 0;
                for (int j = 0; j < grid[i].length; j++) {
                    max = max <= grid[j][i] ? grid[j][i] : max;
                }
                top.add(max);
            }
        }

        int count = 0;
        int listLength = top.size();
        for (int i = 0; i < listLength; i++) {
            for (int j = 0;j < grid[0].length; j++) {
                int max = Math.min((int)top.get(j), (int)left.get(i));
                if (grid[i][j] < max) {
                    count += max - grid[i][j];
                }
            }
        }
        return count;
    }
}
