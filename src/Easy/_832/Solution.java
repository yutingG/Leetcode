package Easy._832;

/**
 * Problem_832 Flipping an Image
 * @author: guoyuting
 * @date: 2018-6-1 14:33
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(solution.flipAndInvertImage(A));
    }

    public int[][] flipAndInvertImage(int[][] A) {
        // first, flip the image
        for(int i = 0; i < A.length; i++) {
            for(int j = 0, k = A[i].length - 1; j < k; j++, k--) {
                int temp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;
            }
        }

        // then, invert the image
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                if (A[i][j] > 0){
                    A[i][j] = 0;
                } else {
                    A[i][j] = 1;
                }
            }
        }
        return A;
    }
}
