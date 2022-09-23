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
        int valCompare=Integer.MIN_VALUE;
        return check(A,c,valCompare);
    }

    public int check(TreeNode A, int c, int valCompare){
        if(A==null){
            return c;
        }
        if(A.val>valCompare){
            c++;
            valCompare=A.val;
        }
        c=check(A.left,c,valCompare);
        c=check(A.right,c,valCompare);
        return c;
    }
}
