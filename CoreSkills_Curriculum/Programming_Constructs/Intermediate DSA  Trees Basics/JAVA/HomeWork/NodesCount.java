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
public class Solution {
    public int solve(TreeNode A) {
        int c=0;
        return check(A,c);
    }
    public int check(TreeNode A, int c){
        if(A==null){
            return c;
        }
        c++;
        c=check(A.left,c);
        c=check(A.right,c);
        return c;
    }
}
