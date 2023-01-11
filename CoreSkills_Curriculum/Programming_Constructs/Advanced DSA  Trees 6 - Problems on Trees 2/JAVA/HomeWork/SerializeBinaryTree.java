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

 //O(N) TC
public class Solution {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode x = q.remove();
                if(x==null){
                    ans.add(-1);
                }
                else{
                    ans.add(x.val);
                    if(x.left!=null){
                        q.add(x.left);
                    }
                    else{
                        q.add(null);
                    }
                    if(x.right!=null){
                        q.add(x.right);
                    }
                    else{
                        q.add(null);
                    }
                }
            }
        }
        return ans;
    }
}
