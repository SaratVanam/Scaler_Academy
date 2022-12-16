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
    int ans=0;
    public int solve(TreeNode A, int B, int C) {
        inorder(A,B,C);
        return ans;
    }

    public void inorder(TreeNode A, int B, int C){
        if(A==null){
            return;
        }

        inorder(A.left,B,C);
        if(A.val>= B && A.val<=C){
            ans++;
        }
        inorder(A.right,B,C);
    }
}
