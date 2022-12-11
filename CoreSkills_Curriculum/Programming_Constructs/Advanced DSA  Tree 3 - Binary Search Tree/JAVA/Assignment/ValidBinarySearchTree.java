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
    public int isValidBST(TreeNode A) {
        if (isValid(A, Long.MIN_VALUE, Long.MAX_VALUE))
            return 1;
        return 0;
    }
    public static boolean isValid(TreeNode A, long l, long r) {
        if (A == null)
            return true;
        if (A.val > l && A.val < r) {
            boolean left = isValid(A.left, l, A.val);
            boolean right = isValid(A.right, A.val, r);
            return (left && right);
        } else
            return false;
    }
}
