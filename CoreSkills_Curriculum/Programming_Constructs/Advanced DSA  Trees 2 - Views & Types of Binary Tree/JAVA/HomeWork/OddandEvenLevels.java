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
        int sumO=A.val;
        int sumE=0;
        int level=1;
        q.add(A);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                TreeNode x = q.remove();
                if(x.left!=null){
                    if(level%2==0){
                        sumO+=x.left.val;
                        
                    }
                    else{
                        sumE+=x.left.val;
                    }
                    q.add(x.left);
                }
                if(x.right!=null){
                    if(level%2==0){
                        sumO+=x.right.val;
                    }
                    else{
                        sumE+=x.right.val;
                        
                    }
                    q.add(x.right);
                }
            }
            level++;
        }
        return sumO-sumE;
    }
}
