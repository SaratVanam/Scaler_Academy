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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(A==null){
            return res;
        }
        q.add(A);
        int level=1;
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
            level++;
            if(level%2!=0){
                Collections.reverse(temp);
                res.add(temp);
            }
            else{
                res.add(temp);
            }
        }
        return res;
    }
}
