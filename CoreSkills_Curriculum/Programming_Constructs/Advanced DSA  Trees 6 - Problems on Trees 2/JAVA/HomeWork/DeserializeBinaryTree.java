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
    public TreeNode solve(int[] A) {
        Queue<TreeNode> q = new LinkedList<>();
        
        TreeNode root = new TreeNode(A[0]);
        q.add(root);
        int index=1;
        while(index<A.length){
            TreeNode x = q.remove();
            TreeNode l;
            if(A[index]==-1){
                l=null;
            }
            else{
                l= new TreeNode(A[index]);
            }
            x.left=l;
            if(l!=null){
                q.add(l);
            }
            index++;
            TreeNode r;
            if(A[index]==-1){
                r=null;
            }
            else{
                r=new TreeNode(A[index]);
            }
            x.right=r;
            if(r!=null){
                q.add(r);
            }
            index++;
        }
        return root;
    }
}
