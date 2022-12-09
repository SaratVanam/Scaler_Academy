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
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(A==null) return ans;
        q.add(A);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode x=q.poll();
                if(i==0){
                    ans.add(x.val);
                }
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);
                }
            }
        }
        return ans;
    }
}
