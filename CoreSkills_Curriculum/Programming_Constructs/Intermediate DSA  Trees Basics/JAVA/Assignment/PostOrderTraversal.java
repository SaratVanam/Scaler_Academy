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
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<TreeNode> heads = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        heads.add(A);
        TreeNode top;
        while(heads.size()!=0){
            top=heads.get(heads.size()-1);
            if(top.left==null & top.right==null){
                ans.add(top.val);
                if(heads.size()-1==0){
                    return ans;
                }
                heads.remove(heads.size()-1);
                if(heads.get(heads.size()-1).left==null){
                    heads.get(heads.size()-1).right=null;
                }
                heads.get(heads.size()-1).left=null;
            }
            else if(top.left==null && top.right!=null){
                heads.add(top.right);
            }
            else if(top.left!=null){
                heads.add(top.left);
            }
        }
        return ans;
    }
}
