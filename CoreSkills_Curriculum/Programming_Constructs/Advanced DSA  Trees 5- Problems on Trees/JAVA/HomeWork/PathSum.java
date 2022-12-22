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

 // O(N) TC O(H) SC
public class Solution {
    public int hasPathSum(TreeNode A, int B) {
        if(A==null){
            return 0;
        }
        B=B-A.val;
        if(A.left==null && A.right==null){
            return (B==0?1:0);
        }
        return(hasPathSum(A.left,B) | hasPathSum(A.right,B));
    }
}
