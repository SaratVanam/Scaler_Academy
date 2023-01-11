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
    int check=0;
    public int hasPathSum(TreeNode A, int B) {
        helper(A,B);
        if(check==1){
            return 1;
        }
        return 0;
    }
    public void helper(TreeNode A, int B){
        if(A==null){
            return;
        }
        if(A.left==null && A.right==null && A.val==B){
            check=1;
            return;
        }
        hasPathSum(A.left,B-A.val);
        hasPathSum(A.right,B-A.val);
    }
}
