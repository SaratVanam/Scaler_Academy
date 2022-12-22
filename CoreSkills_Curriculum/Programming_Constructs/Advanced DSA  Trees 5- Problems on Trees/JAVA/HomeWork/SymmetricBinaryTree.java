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
    public int isSymmetric(TreeNode A) {
        if(A.left==null && A.right!=null){
            return 0;
        }
        if(A.left!=null && A.right==null){
            return 0;
        }
        return find(A.left,A.right)?1:0;
    }

    public boolean find(TreeNode A, TreeNode B){
        if(A==null && B==null){
            return true;
        }
        if(A==null){
            return false;
        }
        if(B==null){
            return false;
        }
        if(find(A.left,B.right) && find(A.right,B.left)){
            if(A.val==B.val){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
