/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */

 // O(N) TC
public class Solution {
    int balanced = 1;
    public int isBalanced(TreeNode A) {
        balanced(A);
        return balanced;
    }
    public int balanced(TreeNode A) {
        if (A == null)
            return 0;
 
        int heightLeft = 1 + balanced(A.left);
        int heightRight = 1 + balanced(A.right);
 
        if (Math.abs(heightLeft - heightRight) > 1)
            balanced = 0;
        return Math.max(heightLeft, heightRight);
    }
}
