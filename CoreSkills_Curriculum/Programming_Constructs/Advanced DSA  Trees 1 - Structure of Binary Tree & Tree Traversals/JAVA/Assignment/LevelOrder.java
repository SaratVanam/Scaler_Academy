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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(A==null){
            return res;
        }
        q.add(A);
        while(!q.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode x = q.remove();
                temp.add(x.val);
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
