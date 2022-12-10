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
    public ArrayList<Integer> solve(TreeNode A) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        TreeNode curr=A;
        q.add(curr);
        while(!q.isEmpty()){
            int n= q.size();
            for(int i=0;i<n;i++){
                TreeNode x = q.remove();
                if(x==null){
                    ans.add(-1);
                }
                else{
                    ans.add(x.val);
                    q.add(x.left==null?null:x.left);
                    q.add(x.right==null?null:x.right);
                }
            }
        }
        return ans;
    }

}
