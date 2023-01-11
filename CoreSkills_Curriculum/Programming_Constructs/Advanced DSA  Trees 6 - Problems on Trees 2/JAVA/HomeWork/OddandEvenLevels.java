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
    public int solve(TreeNode A) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        int oddSum=0;
        int evenSum=0;
        int valueCheck=1;
        while(!q.isEmpty()){
            int n= q.size();
            for(int i=0;i<n;i++){
                TreeNode x = q.remove();
                if(valueCheck%2!=0){
                    oddSum+=x.val;
                }
                else{
                    evenSum+=x.val;
                }
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);
                }
            }
            valueCheck++;
        }
        return oddSum-evenSum;
    }
}
