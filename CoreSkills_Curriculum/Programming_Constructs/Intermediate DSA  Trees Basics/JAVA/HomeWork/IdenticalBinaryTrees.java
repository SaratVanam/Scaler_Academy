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
    public int isSameTree(TreeNode A, TreeNode B) {
        if(A==null && B==null){
            return 1;
        }
        ArrayList<TreeNode> heads1 = new ArrayList<>();
        ArrayList<Integer> ans1 = new ArrayList<>();
        heads1.add(A);
        TreeNode top1;
        while(heads1.size()!=0){
            top1=heads1.get(heads1.size()-1);
            ans1.add(top1.val);
            if(top1.left==null && top1.right==null){
                if(heads1.size()-1==0){
                    break;
                }
                heads1.remove(heads1.size()-1);
            }
            else if(top1.right==null && top1.left!=null){
                heads1.remove(heads1.size()-1);
                heads1.add(top1.left);
            }
            else if(top1.right!=null){
                heads1.remove(heads1.size()-1);
                heads1.add(top1.right);
                if(top1.left!=null){
                    heads1.add(top1.left);
                }
            }
        }
        ArrayList<TreeNode> heads = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        heads.add(B);
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
        if(ans.equals(ans1)){
            return 1;
        }
        return 0;
    }
}
