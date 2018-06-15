package Easy._617;

/**
 * Problem_617 Merge Two Binary Trees
 * @author: guoyuting
 * @date: 2018-6-5 8:40
 */
public class Solution {

    public static void main(String[] args) {
        TreeNode result = new TreeNode(0);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        System.out.println(result.mergeTrees(t1,t2).val);
        System.out.println(result.mergeTrees(t1,t2).val);
        System.out.println(result.mergeTrees(t1,t2).val);

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        this.val = x;
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode treeNode = new TreeNode(0);
        while (t1 != null | t2 != null) {

        }
        return treeNode;
    }
}
