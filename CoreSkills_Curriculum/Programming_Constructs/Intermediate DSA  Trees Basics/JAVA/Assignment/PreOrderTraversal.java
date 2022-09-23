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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<TreeNode> heads = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        heads.add(A);
        TreeNode top;
        while(heads.size()!=0){
            top=heads.get(heads.size()-1);
            ans.add(top.val);
            if(top.left==null && top.right==null){
                if(heads.size()-1==0){
                    break;
                }
                heads.remove(heads.size()-1);
            }
            else if(top.right==null && top.left!=null){
                heads.remove(heads.size()-1);
                heads.add(top.left);
            }
            else if(top.right!=null){
                heads.remove(heads.size()-1);
                heads.add(top.right);
                if(top.left!=null){
                    heads.add(top.left);
                }
            }
        }
        return ans;
    }
}
