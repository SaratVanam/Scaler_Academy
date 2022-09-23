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
    public int[] inorderTraversal(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(A.left==null){
            ans.add(A.val);
        }
        checkRight(A.right,ans);
    }

    public void checkRight(TreeNode A,ArrayList<Integer> ans ){
        if(A==null){
            return;
        }
        
    }

}
