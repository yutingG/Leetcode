package Easy._840;

/**
 * Problem_840 Magic Squares In Grid
 * @author: guoyuting
 * @date: 2018-6-1 16:21
 */
public class Solution {
    public static void main(String[] args) {
        int[][] grid = {{4,3,8,4}, {9,5,1,9}, {2,7,6,2}};
        Solution solution = new Solution();
        System.out.println(solution.numMagicSquaresInside(grid));
    }

    // 寻找有多少个 3 * 3 的子魔方
    public int numMagicSquaresInside(int[][] grid) {
        int rowLength = grid.length;   // 一维长度
        int colLength = 0;             // 二维长度
        if (rowLength >= 3) {
            colLength = grid[0].length;
        }

        int count = 0;
        for(int i = 0; i <= rowLength-3; i++) {
            for (int j = 0; j <= colLength-3;j++) {
                // 数据只能是1~9
                if ( grid[i][j] > 9 | grid[i][j+1] > 9 | grid[i][j+2] > 9 |
                        grid[i+1][j] > 9 | grid[i+1][j+1] > 9 | grid[i+1][j+2] > 9 |
                        grid[i+2][j] > 9 | grid[i+2][j+1] > 9 | grid[i+2][j+2] > 9 |
                        grid[i][j] < 1 | grid[i][j+1] < 1 | grid[i][j+2] < 1 |
                        grid[i+1][j] < 1 | grid[i+1][j+1] < 1 | grid[i+1][j+2] < 1 |
                        grid[i+2][j] < 1 | grid[i+2][j+1] < 1 | grid[i+2][j+2] < 1) {
                    continue;
                }
                int[] sum = new int[8];
                sum[0] = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                sum[1] = grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2];
                sum[2] = grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
                sum[3] = grid[i][j] + grid[i+1][j] + grid[i+2][j];
                sum[4] = grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1];
                sum[5] = grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2];
                sum[6] = grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2];
                sum[7] = grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j];

                boolean flag = true;
                for(int k = 1; k < 8; k++) {
                    if (sum[k] != sum[0]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    count++;
                }
            }
        }
        return count;
    }
}
