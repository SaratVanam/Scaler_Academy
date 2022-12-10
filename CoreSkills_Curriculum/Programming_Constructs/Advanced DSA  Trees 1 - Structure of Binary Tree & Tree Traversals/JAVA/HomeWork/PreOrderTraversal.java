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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        Stack<TreeNode> s =  new Stack<>();
        TreeNode curr= A;
        ArrayList<Integer> ans=new ArrayList<>();
        while(!s.isEmpty() || curr!=null){
            while(curr!=null){
                ans.add(curr.val);
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            curr=curr.right;
        }
        return ans;
    }
}
