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
    public int solve(TreeNode A) {
        checkSum(A);
        if(check==0){
            return 0;
        }
        return 1;
    }
    int check=1;
    public int checkSum(TreeNode A){
        if(A==null){
            return 0;
        }
        if(A.left==null && A.right==null){
            return A.val;
        }
        int l = checkSum(A.left);
        int r=checkSum(A.right);
        if(l+r!=A.val){
            check=0;
        }
        return (A.val+l+r);
    }
}
